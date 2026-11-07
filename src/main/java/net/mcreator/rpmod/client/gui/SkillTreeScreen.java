package net.mcreator.rpmod.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.rpmod.world.inventory.SkillTreeMenu;
import net.mcreator.rpmod.procedures.GetPointsProcedure;
import net.mcreator.rpmod.procedures.GetArrowCostProcedure;
import net.mcreator.rpmod.network.SkillTreeButtonMessage;
import net.mcreator.rpmod.init.RpmodModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class SkillTreeScreen extends AbstractContainerScreen<SkillTreeMenu> implements RpmodModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_upg_arrow;
	private static final ResourceLocation BACKGROUND = ResourceLocation.parse("rpmod:textures/screens/skill_tree.png");

	public SkillTreeScreen(SkillTreeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, GetPointsProcedure.execute(entity), 4, 4, -12829636, false);
		guiGraphics.drawString(this.font, GetArrowCostProcedure.execute(entity), 8, 127, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_upg_arrow = Button.builder(Component.translatable("gui.rpmod.skill_tree.button_upg_arrow"), e -> {
			int x = SkillTreeScreen.this.x;
			int y = SkillTreeScreen.this.y;
			if (true) {
				PacketDistributor.sendToServer(new SkillTreeButtonMessage(0, x, y, z));
				SkillTreeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 139, 70, 20).build();
		this.addRenderableWidget(button_upg_arrow);
	}
}