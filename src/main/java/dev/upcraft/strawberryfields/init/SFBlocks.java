package dev.upcraft.strawberryfields.init;

import dev.upcraft.strawberryfields.StrawberryFieldsForever;
import dev.upcraft.strawberryfields.block.SFSaplingBlock;
import io.github.glasspane.mesh.api.annotation.AutoRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.sapling.OakSaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;

@SuppressWarnings("unused")
@AutoRegistry.Register(value = Block.class, modid = StrawberryFieldsForever.MODID, registry = "block")
public class SFBlocks {

    public static final Block APPLE_SAPLING = new SFSaplingBlock(new OakSaplingGenerator(), FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.GRASS));
}
