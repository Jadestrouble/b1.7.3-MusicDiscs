package jadestrouble.musicdiscs.mixin;

import jadestrouble.musicdiscs.items.Discs;
import net.minecraft.entity.monster.Ghast;
import net.minecraft.item.ItemBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Ghast.class)
public class GhastMixin{
    @Inject(method = "getMobDrops", at = @At("RETURN"), cancellable = true)
    private void addDisc(CallbackInfoReturnable<ItemBase> cir){
        cir.setReturnValue(Discs.pigstep_Disc);
    }
}


