package jadestrouble.b173musicdiscs.mixin;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.sound.SoundHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin { /*
    @Redirect(method = "method_1155", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/sound/SoundHelper;playStreaming(Ljava/lang/String;FFFFF)V"))
    public void playStreaming(SoundHelper instance, String f, float g, float h, float i, float j, float v) {
        instance.playStreaming("b173musicdiscs:blocks",g,h,i,j,v);
    } */
}