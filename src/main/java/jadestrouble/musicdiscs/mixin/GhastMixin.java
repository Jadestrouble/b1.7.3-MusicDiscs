package jadestrouble.musicdiscs.mixin;

import jadestrouble.musicdiscs.items.Discs;
import net.minecraft.entity.living.FlyingBase;
import net.minecraft.entity.monster.Ghast;
import net.minecraft.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Ghast.class)
public class GhastMixin extends FlyingBase {
    private GhastMixin(Level arg) {
        super(arg);
    }
    @Override
    protected void getDrops() {
        dropItem(Discs.pigstep_Disc.id, 1);
    }
}