package jadestrouble.musicdiscs.items;

import jadestrouble.musicdiscs.Config;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateMusicDiscItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class NewDiscs extends TemplateMusicDiscItem implements CustomTooltipProvider {

    public String jukeboxMessage;

    public NewDiscs(Identifier i, String s, String jukeboxMessage) {
        super(i, s);
        this.jukeboxMessage = jukeboxMessage;
    }

    @Override
    public String[] getTooltip(ItemStack itemStack, String originalTooltip) {
        if (Config.config.disableModernMusicDiscTooltips) {
            return new String[]{originalTooltip};
        } else {
            return new String[]{"§b" + originalTooltip, "§7" + jukeboxMessage};
        }
    }
}
