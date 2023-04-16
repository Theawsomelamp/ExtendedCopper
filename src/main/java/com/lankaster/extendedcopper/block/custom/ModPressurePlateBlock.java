package com.lankaster.extendedcopper.block.custom;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.entity.ItemEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ModPressurePlateBlock extends WeightedPressurePlateBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;
    private final int weight;

    public ModPressurePlateBlock(Oxidizable.OxidationLevel oxidationLevel, int weight, Settings settings) {
        super(weight, settings,  BlockSetType.IRON);
        this.oxidationLevel = oxidationLevel;
        this.weight = weight;
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        int i = Math.min(world.getNonSpectatingEntities(ItemEntity.class, BOX.offset(pos)).size(), this.weight);
        if (i > 0) {
            float f = (float)Math.min(this.weight, i) / (float)this.weight;
            return MathHelper.ceil(f * 15.0F);
        } else {
            return 0;
        }
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