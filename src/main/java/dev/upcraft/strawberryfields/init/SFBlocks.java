package dev.upcraft.strawberryfields.init;

import dev.upcraft.strawberryfields.StrawberryFieldsForever;
import io.github.glasspane.mesh.api.annotation.AutoRegistry;
import net.minecraft.block.Block;

@AutoRegistry.Register(value = Block.class, modid = StrawberryFieldsForever.MODID, registry = "block")
public class SFBlocks {
}
