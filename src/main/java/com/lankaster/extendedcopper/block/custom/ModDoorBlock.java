package com.lankaster.extendedcopper.block.custom;


import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

import java.util.Iterator;


public class ModDoorBlock extends DoorBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public ModDoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings, BlockSetType.IRON);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return state.get(HALF) == (DoubleBlockHalf.LOWER) && Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }

    public void tryDegrade(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        int i = this.getDegradationLevel().ordinal();
        int j = 0;
        int k = 0;
        Iterator var8 = BlockPos.iterateOutwards(pos, 4, 4, 4).iterator();

        while(var8.hasNext()) {
            BlockPos blockPos = (BlockPos)var8.next();
            int l = blockPos.getManhattanDistance(pos);
            if (l > 4) {
                break;
            }

            if (!blockPos.equals(pos)) {
                BlockState blockState = world.getBlockState(blockPos);
                Block block = blockState.getBlock();
                if (block instanceof Degradable) {
                    Enum<?> enum_ = ((Degradable)block).getDegradationLevel();
                    if (this.getDegradationLevel().getClass() == enum_.getClass()) {
                        int m = enum_.ordinal();
                        if (m < i) {
                            return;
                        }

                        if (m > i) {
                            ++k;
                        } else {
                            ++j;
                        }
                    }
                }
            }
        }

        float f = (float)(k + 1) / (float)(k + j + 1);
        float g = f * f * this.getDegradationChanceMultiplier();
        if (random.nextFloat() < g) {
            this.getDegradationResult(state).ifPresent((statex) -> {
                BlockPos replacedPosition = pos;
                if (state.get(HALF).equals(DoubleBlockHalf.UPPER)) {
                    replacedPosition = replacedPosition.down();
                }
                world.setBlockState(replacedPosition, Blocks.AIR.getDefaultState());
                world.setBlockState(replacedPosition, statex.with(HALF, DoubleBlockHalf.LOWER));
                world.setBlockState(replacedPosition.up(), statex.with(HALF, DoubleBlockHalf.UPPER));
            });
        }

    }
}
