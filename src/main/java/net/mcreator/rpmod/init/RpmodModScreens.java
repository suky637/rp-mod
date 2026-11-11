/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rpmod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.rpmod.client.gui.SkillTreeScreen;
import net.mcreator.rpmod.client.gui.LVGemExtractorGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class RpmodModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RpmodModMenus.SKILL_TREE.get(), SkillTreeScreen::new);
		event.register(RpmodModMenus.LV_GEM_EXTRACTOR_GUI.get(), LVGemExtractorGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}