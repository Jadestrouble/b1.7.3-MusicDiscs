package jadestrouble.b173musicdiscs.mixin;

import jadestrouble.b173musicdiscs.items.Discs;
import net.minecraft.entity.Item;
import net.minecraft.entity.monster.Creeper;
import net.minecraft.entity.monster.MonsterBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Creeper.class)
abstract public class CreeperMixin extends MonsterBase {
    public CreeperMixin(Level arg) {
        super(arg);
    }

    @Redirect(method = "onKilledBy", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/monster/Creeper;dropItem(II)Lnet/minecraft/entity/Item;"))
    public Item onKilledBy(Creeper instance, int id, int count) {
        ItemBase[] items = new ItemBase[]{
                ItemBase.record13,
                ItemBase.recordCat,
                Discs.blocks_Disc,
                Discs.chirp_Disc,
                Discs.eleven_Disc,
                Discs.far_Disc,
                Discs.mall_Disc,
                Discs.mellohi_Disc,
                Discs.stal_Disc,
                Discs.strad_Disc,
                Discs.ward_Disc
        };
        return instance.dropItem(new ItemInstance(items[rand.nextInt(items.length)]),1);
    }
}
