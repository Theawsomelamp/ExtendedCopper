package com.lankaster.extendedcopper.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import com.lankaster.extendedcopper.ExtendedCopper;
import com.lankaster.extendedcopper.block.custom.*;

import static net.minecraft.item.ItemGroups.REDSTONE;

public class ModBlocks {

    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new ModStoneButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button",
            new ExposedButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button",
            new WeatheredButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button",
            new OxidizedButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block WAXED_COPPER_BUTTON = registerBlock("waxed_copper_button",
            new ModStoneButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlock("waxed_exposed_copper_button",
            new ExposedButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlock("waxed_weathered_copper_button",
            new WeatheredButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlock("waxed_oxidized_copper_button",
            new OxidizedButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool().noCollision()));

    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 1, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 15, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 75, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 150, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block WAXED_COPPER_PRESSURE_PLATE = registerBlock("waxed_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 1, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("waxed_exposed_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 15, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("waxed_weathered_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 75, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("waxed_oxidized_copper_pressure_plate",
            new ModPressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, 150, FabricBlockSettings.of(Material.METAL).requiresTool().noCollision().strength(4.0F)));

    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor",
            new ModTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block COPPER_BARS = registerBlock("copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block EXPOSED_COPPER_BARS = registerBlock("exposed_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WEATHERED_COPPER_BARS = registerBlock("weathered_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block OXIDIZED_COPPER_BARS = registerBlock("oxidized_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_COPPER_BARS = registerBlock("waxed_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlock("waxed_exposed_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlock("waxed_weathered_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlock("waxed_oxidized_copper_bars",
            new ModBarsBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final LanternBlock COPPER_LANTERN = (LanternBlock) registerBlock("copper_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.5F).sounds(BlockSoundGroup.LANTERN).luminance((state) -> {
        return 15;
    }).nonOpaque()));

    public static final Block COPPER_CHAIN = registerBlock("copper_chain",
            new ChainBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

    public static final Block COPPER_DOOR = registerBlock("copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block EXPOSED_COPPER_DOOR = registerBlock("exposed_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WEATHERED_COPPER_DOOR = registerBlock("weathered_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block OXIDIZED_COPPER_DOOR = registerBlock("oxidized_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_COPPER_DOOR = registerBlock("waxed_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_EXPOSED_COPPER_DOOR = registerBlock("waxed_exposed_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_WEATHERED_COPPER_DOOR = registerBlock("waxed_weathered_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));

    public static final Block WAXED_OXIDIZED_COPPER_DOOR = registerBlock("waxed_oxidized_copper_door",
            new ModDoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL).strength(4.0f)
                    .requiresTool().nonOpaque()));



    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(ExtendedCopper.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ExtendedCopper.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ExtendedCopper.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(REDSTONE).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ExtendedCopper.MOD_ID);
    }
}