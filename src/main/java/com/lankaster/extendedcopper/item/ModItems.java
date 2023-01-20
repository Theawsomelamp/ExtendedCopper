package com.lankaster.extendedcopper.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.lankaster.extendedcopper.ExtendedCopper;
import com.lankaster.extendedcopper.block.ModBlocks;

import static net.minecraft.item.ItemGroups.INGREDIENTS;

public class ModItems {

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExtendedCopper.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(COPPER_NUGGET);
    }

    public static void addToItemGroup(Item item){
        ItemGroupEvents.modifyEntriesEvent(INGREDIENTS).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + ExtendedCopper.MOD_ID);
        addItemsToItemGroup();
    }
}
