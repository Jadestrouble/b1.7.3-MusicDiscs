package jadestrouble.musicdiscs.mixins;

import jadestrouble.musicdiscs.Config;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.MonsterEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static jadestrouble.musicdiscs.items.Discs.items;
import static net.glasslauncher.hmifabric.Utils.rand;

@Mixin(CreeperEntity.class)
abstract public class CreeperEntityMixin extends MonsterEntity {
    public CreeperEntityMixin(World arg) {
        super(arg);
    }

    @Redirect(method = "method_938", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/mob/CreeperEntity;method_1339(II)Lnet/minecraft/entity/ItemEntity;"))
    public ItemEntity onKilledBy(CreeperEntity instance, int id, int count) {
        if (Config.config.replaceDiscsOnSkeletonKillCreeper) {
            return instance.method_1327(new ItemStack(items[rand.nextInt(items.length)]), 1);
        } else {
            return instance.method_1339(id, count);
        }
    }
}