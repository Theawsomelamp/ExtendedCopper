package com.lankaster.extendedcopper.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class ModTrapdoorBlock extends TrapdoorBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public ModTrapdoorBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings, BlockSetType.IRON);
        this.oxidationLevel = oxidationLevel;
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
