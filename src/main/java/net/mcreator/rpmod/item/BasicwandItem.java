package net.mcreator.rpmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.rpmod.procedures.BasicwandRightclickedProcedure;

public class BasicwandItem extends Item {
	public BasicwandItem() {
		super(new Item.Properties().durability(32));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		BasicwandRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}