package jadestrouble.b173musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;
import net.modificationstation.stationapi.api.util.Null;

public class discs {
    @Entrypoint.ModID
    final ModID modId = Null.get();

    public static ItemBase blocks_Disc;

    @EventListener
    void registerItems(ItemRegistryEvent event) {
        blocks_Disc = new TemplateItemBase(modId.id("blocks_disc")).setMaxStackSize(1).setTranslationKey(modId, "blocksDisc");
    }
}