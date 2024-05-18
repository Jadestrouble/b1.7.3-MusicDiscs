package jadestrouble.musicdiscs.mixins;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import jadestrouble.musicdiscs.items.NewDiscs;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin extends Item {

    public MusicDiscItemMixin(int id) {
        super(id);
    }

    @WrapWithCondition(method = "useOnBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;method_173(Lnet/minecraft/entity/player/PlayerEntity;IIIII)V"))
    public boolean cancelSendingJukeboxMessage(World world, PlayerEntity player, int eventId, int x, int y, int z, int id) {
        return !(this.asItem() instanceof NewDiscs);
    }
}
