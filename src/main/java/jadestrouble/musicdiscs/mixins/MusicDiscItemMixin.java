package jadestrouble.musicdiscs.mixins;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin implements CustomTooltipProvider  {

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        return new String[]{"§b" + originalTooltip,};
    }
}
