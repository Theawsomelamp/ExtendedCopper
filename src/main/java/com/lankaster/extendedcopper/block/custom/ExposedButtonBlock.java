package com.lankaster.extendedcopper.block.custom;

import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ExposedButtonBlock extends ModAbstractButtonBlock {
    public ExposedButtonBlock(Settings settings) {
        super(2, settings);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}