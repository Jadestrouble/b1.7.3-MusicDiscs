package jadestrouble.musicdiscs.mixin;

import jadestrouble.musicdiscs.Config;
import net.minecraft.item.ItemInstance;
import net.minecraft.item.Record;
import net.minecraft.level.structure.Dungeon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

import static jadestrouble.musicdiscs.items.Discs.items;

@Mixin(Dungeon.class)
public class DungeonMixin {

    @Inject(method = "getRandomChestItem", at = @At("RETURN"), cancellable = true)
    private void replaceDisc(Random rand, CallbackInfoReturnable<ItemInstance> cir) {
        if (Config.config.replaceDiscsInDungeonChests) {
            ItemInstance i = cir.getReturnValue();

            if (i == null) {
                return;
            }

            if (cir.getReturnValue().getType() instanceof Record) {
                cir.setReturnValue(new ItemInstance(items[rand.nextInt(items.length)], 1));
            }
        }
    }
}
