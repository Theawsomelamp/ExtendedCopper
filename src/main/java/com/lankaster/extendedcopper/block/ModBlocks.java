package com.lankaster.extendedcopper.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.lankaster.extendedcopper.ExtendedCopper;
import com.lankaster.extendedcopper.block.custom.*;

public class ModBlocks {

    public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()));

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





    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(ExtendedCopper.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(ExtendedCopper.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(ExtendedCopper.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(ItemGroup.REDSTONE)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + ExtendedCopper.MOD_ID);
    }
}