package dev.upcraft.strawberryfields.block;

import io.github.glasspane.mesh.api.registry.BlockItemProvider;
import io.github.glasspane.mesh.api.registry.RenderLayerProvider;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import org.jetbrains.annotations.Nullable;

public class SFSaplingBlock extends SaplingBlock implements BlockItemProvider, RenderLayerProvider {

    public SFSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    public @Nullable Item createItem() {
        return new BlockItem(this, new Item.Settings().group(ItemGroup.DECORATIONS));
    }

    @Environment(EnvType.CLIENT)
    @Override
    public RenderLayer getRenderLayer() {
        return RenderLayer.getCutout();
    }
}
