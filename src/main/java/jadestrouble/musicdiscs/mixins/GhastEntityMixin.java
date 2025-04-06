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
        int var1 = this.getDroppedItemId();
        if (var1 > 0) {
            int var2 = this.random.nextInt(3);

            if (  (0 < Config.config.chanceGhastsDropPigstep)
               && (Config.config.chanceGhastsDropPigstep >= this.random.nextFloat())
            ) {
                dropItem(Discs.pigstep_Disc.id, 1);
            }

            for(int var3 = 0; var3 < var2; ++var3) {
                this.dropItem(var1, 1);
            }
        }

    }
}
