package jadestrouble.musicdiscs.mixin;

import net.minecraft.item.ItemInstance;
import net.minecraft.item.Record;
import net.modificationstation.stationapi.api.client.gui.CustomTooltipProvider;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Record.class)
public class RecordMixin implements CustomTooltipProvider {

    @Shadow
    @Final
    public String title;

    @Override
    public String[] getTooltip(ItemInstance itemInstance, String originalTooltip) {
        return new String[]{originalTooltip, title};
    }
}
