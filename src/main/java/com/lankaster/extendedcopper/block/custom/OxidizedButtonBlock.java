package com.lankaster.extendedcopper.block.custom;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class OxidizedButtonBlock extends ModAbstractButtonBlock {
    public OxidizedButtonBlock(Settings settings) {
        super(4, settings);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}