package com.lankaster.extendedcopper.block.custom;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;


public class ModPressurePlateBlock extends PressurePlateBlock {
    public ModPressurePlateBlock(ActivationRule type, Settings settings) {
        super(type, settings);
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        Box box = BOX.offset(pos);
        List list3;
        list3 = world.getNonSpectatingEntities(ItemEntity.class, box);

        if (!list3.isEmpty()) {

            for (Object o : list3) {
                Entity entity = (Entity) o;
                if (!entity.canAvoidTraps()) {
                    return 15;
                }
            }
        }

        return 0;
    }
}