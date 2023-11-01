package jadestrouble.b173musicdiscs.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin { /*
    @Redirect(method = "method_1155", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/sound/SoundHelper;playStreaming(Ljava/lang/String;FFFFF)V"))
    public void playStreaming(SoundHelper instance, String f, float g, float h, float i, float j, float v) {
        instance.playStreaming("b173musicdiscs:blocks",g,h,i,j,v);
    } */
}