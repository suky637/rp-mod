package net.mcreator.rpmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RubyOreBlock extends Block {
	public RubyOreBlock() {
		super(BlockBehaviour.Properties.of().strength(6f, 5.2233033798f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}