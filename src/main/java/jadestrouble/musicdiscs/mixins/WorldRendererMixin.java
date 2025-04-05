package jadestrouble.musicdiscs.mixins;

import jadestrouble.musicdiscs.items.NewDiscs;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @Shadow private Minecraft client;

    public void musicDiscs_playStreaming(String stream, int x, int y, int z, String jukeboxMessage) {
        if (stream != null) {
            this.client.inGameHud.setRecordPlayingOverlay(jukeboxMessage);
        }

        this.client.soundManager.playStreaming(stream, (float)x, (float)y, (float)z, 1.0F, 1.0F);
    }

    @Inject(
            method = {"worldEvent"},
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/World;playStreaming(Ljava/lang/String;III)V",
                    ordinal = 0
            ),
            cancellable = true
    )
    public void worldEvent(PlayerEntity player, int event, int x, int y, int z, int data, CallbackInfo ci) {
        if (Item.ITEMS[data] instanceof NewDiscs) {
            musicDiscs_playStreaming(((NewDiscs) Item.ITEMS[data]).sound, x, y, z, ((NewDiscs) Item.ITEMS[data]).jukeboxMessage);
            ci.cancel();
        }
    }
}
