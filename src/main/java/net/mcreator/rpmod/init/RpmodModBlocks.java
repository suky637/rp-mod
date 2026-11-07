/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.rpmod.block.RubyOreBlock;
import net.mcreator.rpmod.block.RubyBlockBlock;
import net.mcreator.rpmod.RpmodMod;

public class RpmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RpmodMod.MODID);
	public static final DeferredBlock<Block> RUBY_ORE;
	public static final DeferredBlock<Block> RUBY_BLOCK;
	static {
		RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreBlock::new);
		RUBY_BLOCK = REGISTRY.register("ruby_block", RubyBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}