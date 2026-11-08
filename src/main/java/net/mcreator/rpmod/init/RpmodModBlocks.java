/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.rpmod.block.*;
import net.mcreator.rpmod.RpmodMod;

public class RpmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RpmodMod.MODID);
	public static final DeferredBlock<Block> RUBY_ORE;
	public static final DeferredBlock<Block> RUBY_BLOCK;
	public static final DeferredBlock<Block> SAPHIRE_ORE;
	public static final DeferredBlock<Block> SAPHIRE_BLOCK;
	public static final DeferredBlock<Block> TOPAZ_ORE;
	public static final DeferredBlock<Block> TOPAZ_BLOCK;
	static {
		RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreBlock::new);
		RUBY_BLOCK = REGISTRY.register("ruby_block", RubyBlockBlock::new);
		SAPHIRE_ORE = REGISTRY.register("saphire_ore", SaphireOreBlock::new);
		SAPHIRE_BLOCK = REGISTRY.register("saphire_block", SaphireBlockBlock::new);
		TOPAZ_ORE = REGISTRY.register("topaz_ore", TopazOreBlock::new);
		TOPAZ_BLOCK = REGISTRY.register("topaz_block", TopazBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}