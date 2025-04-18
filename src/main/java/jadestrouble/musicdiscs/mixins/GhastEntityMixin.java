package jadestrouble.musicdiscs.mixins;

import jadestrouble.musicdiscs.Config;
import jadestrouble.musicdiscs.items.Discs;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(GhastEntity.class)
public class GhastEntityMixin extends FlyingEntity {

    private GhastEntityMixin(World arg) {
        super(arg);
    }

    @Override
    protected void dropItems() {
        if (Config.config.replaceGhastsDropPigstep) {
            dropItem(Discs.pigstep_Disc.id, 1);
        }
    }
}
