/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.rpmod.network.SkillTreeKMessage;

@EventBusSubscriber(Dist.CLIENT)
public class RpmodModKeyMappings {
	public static final KeyMapping SKILL_TREE_K = new KeyMapping("key.rpmod.skill_tree_k", GLFW.GLFW_KEY_M, "key.category.rpmod.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				PacketDistributor.sendToServer(new SkillTreeKMessage(0, 0));
				SkillTreeKMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SKILL_TREE_K);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				SKILL_TREE_K.consumeClick();
			}
		}
	}
}