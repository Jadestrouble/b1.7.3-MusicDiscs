package jadestrouble.musicdiscs.mixin;

import jadestrouble.musicdiscs.Config;
import net.minecraft.entity.Item;
import net.minecraft.entity.monster.Creeper;
import net.minecraft.entity.monster.MonsterBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static jadestrouble.musicdiscs.items.Discs.items;

@Mixin(Creeper.class)
abstract public class CreeperMixin extends MonsterBase {
    public CreeperMixin(Level arg) {
        super(arg);
    }

    @Redirect(method = "onKilledBy", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/monster/Creeper;dropItem(II)Lnet/minecraft/entity/Item;"))
    public Item onKilledBy(Creeper instance, int id, int count) {
        if (Config.config.replaceDiscsOnSkeletonKillCreeper) {
            return instance.dropItem(new ItemInstance(items[rand.nextInt(items.length)]), 1);
        } else {
            return instance.dropItem(id, count);
        }
    }
}
