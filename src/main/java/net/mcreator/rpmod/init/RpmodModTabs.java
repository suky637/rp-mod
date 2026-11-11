/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.rpmod.RpmodMod;

public class RpmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RpmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RP_MODCORE = REGISTRY.register("rp_modcore",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rpmod.rp_modcore")).icon(() -> new ItemStack(RpmodModItems.SAPHIRE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RpmodModItems.DAGGER.get());
				tabData.accept(RpmodModItems.SCYTHE.get());
				tabData.accept(RpmodModItems.RUBY.get());
				tabData.accept(RpmodModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(RpmodModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(RpmodModItems.SAPHIRE.get());
				tabData.accept(RpmodModBlocks.SAPHIRE_ORE.get().asItem());
				tabData.accept(RpmodModBlocks.SAPHIRE_BLOCK.get().asItem());
				tabData.accept(RpmodModItems.TOPAZ.get());
				tabData.accept(RpmodModBlocks.TOPAZ_ORE.get().asItem());
				tabData.accept(RpmodModBlocks.TOPAZ_BLOCK.get().asItem());
				tabData.accept(RpmodModItems.BASICWAND.get());
				tabData.accept(RpmodModBlocks.LV_RECEIVER.get().asItem());
				tabData.accept(RpmodModBlocks.LV_TRANSMITTER.get().asItem());
				tabData.accept(RpmodModBlocks.LV_BATTERY.get().asItem());
				tabData.accept(RpmodModBlocks.LV_GEM_EXTRACTOR.get().asItem());
			}).build());
}