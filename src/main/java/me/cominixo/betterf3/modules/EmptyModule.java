package me.cominixo.betterf3.modules;

import me.cominixo.betterf3.utils.DebugLine;
import net.minecraft.client.MinecraftClient;

public class EmptyModule extends BaseModule {

    public static EmptyModule INSTANCE = new EmptyModule(false);

    public EmptyModule(boolean invisible) {
        super(invisible);
        lines.add(new DebugLine("", "", false));

        lines.get(0).inReducedDebug = true;
    }

    @Override
    public void update(MinecraftClient client) {
        lines.get(0).setValue("");
    }
}
