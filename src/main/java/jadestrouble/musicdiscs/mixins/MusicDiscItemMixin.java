package jadestrouble.musicdiscs.mixins;

import jadestrouble.musicdiscs.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MusicDiscItem;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MusicDiscItem.class)
public class MusicDiscItemMixin extends Item implements CustomTooltipProvider {

    @Shadow @Final public String sound;

    public MusicDiscItemMixin(int id) {
        super(id);
    }

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        if (Config.config.disableModernMusicDiscTooltips) {
            return new String[]{originalTooltip};
        } else {
            return new String[]{"§b" + originalTooltip, "§7C418 - " + sound};
        }
    }
}
