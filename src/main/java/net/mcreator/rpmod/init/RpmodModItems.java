/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rpmod.item.*;
import net.mcreator.rpmod.RpmodMod;

public class RpmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RpmodMod.MODID);
	public static final DeferredItem<Item> DAGGER;
	public static final DeferredItem<Item> SCYTHE;
	public static final DeferredItem<Item> RUBY;
	public static final DeferredItem<Item> RUBY_ORE;
	public static final DeferredItem<Item> RUBY_BLOCK;
	public static final DeferredItem<Item> SAPHIRE;
	public static final DeferredItem<Item> SAPHIRE_ORE;
	public static final DeferredItem<Item> SAPHIRE_BLOCK;
	public static final DeferredItem<Item> TOPAZ;
	public static final DeferredItem<Item> TOPAZ_ORE;
	public static final DeferredItem<Item> TOPAZ_BLOCK;
	public static final DeferredItem<Item> BASICWAND;
	static {
		DAGGER = REGISTRY.register("dagger", DaggerItem::new);
		SCYTHE = REGISTRY.register("scythe", ScytheItem::new);
		RUBY = REGISTRY.register("ruby", RubyItem::new);
		RUBY_ORE = block(RpmodModBlocks.RUBY_ORE);
		RUBY_BLOCK = block(RpmodModBlocks.RUBY_BLOCK);
		SAPHIRE = REGISTRY.register("saphire", SaphireItem::new);
		SAPHIRE_ORE = block(RpmodModBlocks.SAPHIRE_ORE);
		SAPHIRE_BLOCK = block(RpmodModBlocks.SAPHIRE_BLOCK);
		TOPAZ = REGISTRY.register("topaz", TopazItem::new);
		TOPAZ_ORE = block(RpmodModBlocks.TOPAZ_ORE);
		TOPAZ_BLOCK = block(RpmodModBlocks.TOPAZ_BLOCK);
		BASICWAND = REGISTRY.register("basicwand", BasicwandItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}