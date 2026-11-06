/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.rpmod.item.DaggerItem;
import net.mcreator.rpmod.RpmodMod;

public class RpmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RpmodMod.MODID);
	public static final DeferredItem<Item> DAGGER;
	static {
		DAGGER = REGISTRY.register("dagger", DaggerItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}