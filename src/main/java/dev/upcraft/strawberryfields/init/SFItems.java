package dev.upcraft.strawberryfields.init;

import dev.upcraft.strawberryfields.StrawberryFieldsForever;
import io.github.glasspane.mesh.api.annotation.AutoRegistry;
import net.minecraft.item.Item;

@SuppressWarnings("unused")
@AutoRegistry.Register(value = Item.class, modid = StrawberryFieldsForever.MODID, registry = "item")
public class SFItems {
}
