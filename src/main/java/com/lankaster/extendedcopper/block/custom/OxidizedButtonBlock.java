package com.lankaster.extendedcopper.block.custom;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;


public class OxidizedButtonBlock extends ButtonBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public OxidizedButtonBlock(Oxidizable.OxidationLevel oxidationLevel, Settings settings) {
        super(settings, BlockSetType.IRON, 50, false);
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