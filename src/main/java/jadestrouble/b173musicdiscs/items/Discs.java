package jadestrouble.b173musicdiscs.items;


import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.TemplateRecord;
import net.modificationstation.stationapi.api.util.Null;

public class Discs {
    public static ItemBase[] items;
    public static ItemBase blocks_Disc;
    public static ItemBase chirp_Disc;
    public static ItemBase far_Disc;
    public static ItemBase mall_Disc;
    public static ItemBase mellohi_Disc;
    public static ItemBase stal_Disc;
    public static ItemBase strad_Disc;
    public static ItemBase ward_Disc;
    public static ItemBase eleven_Disc;
    @Entrypoint.ModID
    final ModID modId = Null.get();
    final ModID MODID = Null.get();

    @EventListener
    void registerItems(ItemRegistryEvent event) {
        blocks_Disc = new TemplateRecord(modId.id("blocks_disc"), "blocks").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        chirp_Disc = new TemplateRecord(modId.id("chirp_disc"), "chirp").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        far_Disc = new TemplateRecord(modId.id("far_disc"), "far").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        mall_Disc = new TemplateRecord(modId.id("mall_disc"), "mall").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        mellohi_Disc = new TemplateRecord(modId.id("mellohi_disc"), "mellohi").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        stal_Disc = new TemplateRecord(modId.id("stal_disc"), "stal").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        strad_Disc = new TemplateRecord(modId.id("strad_disc"), "strad").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        ward_Disc = new TemplateRecord(modId.id("ward_disc"), "ward").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        eleven_Disc = new TemplateRecord(modId.id("11_disc"), "11").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        items = new ItemBase[]{
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
    }
}