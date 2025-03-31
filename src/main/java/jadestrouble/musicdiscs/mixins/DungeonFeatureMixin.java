package jadestrouble.musicdiscs.mixins;

import jadestrouble.musicdiscs.Config;
import jadestrouble.musicdiscs.items.Discs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.world.gen.feature.DungeonFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(DungeonFeature.class)
public class DungeonFeatureMixin {

    public DungeonFeatureMixin() {
    }

    @Inject(
            method = {"getRandomChestItem"},
            at = {@At("RETURN")},
            cancellable = true
    )
    private void replaceDisc(Random rand, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack i = cir.getReturnValue();
        if (Config.config.replaceDiscsInDungeonChests) {
            if (i == null)
                return;
            if (cir.getReturnValue().getItem() instanceof MusicDiscItem) {
                cir.setReturnValue(new ItemStack(Discs.items[rand.nextInt(Discs.items.length)], 1));
            }
        }
    }
}
