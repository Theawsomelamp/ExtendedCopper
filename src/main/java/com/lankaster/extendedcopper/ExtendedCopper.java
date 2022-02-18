package com.lankaster.extendedcopper;

import net.fabricmc.api.ModInitializer;
import com.lankaster.extendedcopper.block.ModBlocks;
import com.lankaster.extendedcopper.item.ModItems;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.client.render.RenderLayer;

import static com.lankaster.extendedcopper.block.ModBlocks.*;

public class ExtendedCopper implements ModInitializer {

	public static final String MOD_ID = "extendedcopper";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EXPOSED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEATHERED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OXIDIZED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EXPOSED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEATHERED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OXIDIZED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_EXPOSED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_WEATHERED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_OXIDIZED_COPPER_BARS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_LANTERN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_CHAIN, RenderLayer.getCutout());

		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_BARS, EXPOSED_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_BARS, WEATHERED_COPPER_BARS);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_BARS, OXIDIZED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_BARS, WAXED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);

		OxidizableBlocksRegistry.registerOxidizableBlockPair(COPPER_TRAPDOOR, EXPOSED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_TRAPDOOR, WEATHERED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerOxidizableBlockPair(WEATHERED_COPPER_TRAPDOOR, OXIDIZED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerWaxableBlockPair(COPPER_TRAPDOOR, WAXED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_TRAPDOOR, WAXED_EXPOSED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerWaxableBlockPair(WEATHERED_COPPER_TRAPDOOR, WAXED_WEATHERED_COPPER_TRAPDOOR);
		OxidizableBlocksRegistry.registerWaxableBlockPair(OXIDIZED_COPPER_TRAPDOOR, WAXED_OXIDIZED_COPPER_TRAPDOOR);

		System.out.println("Hello Fabric world!");
	}
}
