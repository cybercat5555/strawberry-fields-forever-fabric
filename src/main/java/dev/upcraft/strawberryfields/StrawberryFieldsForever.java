package dev.upcraft.strawberryfields;

import dev.upcraft.strawberryfields.world.gen.SFWorldgen;
import io.github.glasspane.mesh.api.annotation.CalledByReflection;
import io.github.glasspane.mesh.api.logging.MeshLoggerFactory;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Logger;

@CalledByReflection
public class StrawberryFieldsForever implements ModInitializer {

    public static final String MODID = "sff";
    private static final Logger log = MeshLoggerFactory.createPrefixLogger(MODID, "Strawberry Fields");

    @Override
    public void onInitialize() {
        SFWorldgen.init();
    }

    public static Logger getLogger() {
        return log;
    }

    public static Identifier id(String path) {
        return new Identifier(MODID, path);
    }
}
