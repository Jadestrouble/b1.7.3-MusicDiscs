package jadestrouble.musicdiscs.items;


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
    public static ItemBase wait_Disc;
    public static ItemBase pigstep_Disc;
    public static ItemBase otherside_Disc;
    public static ItemBase relic_Disc;
    public static ItemBase five_Disc;

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
        wait_Disc = new NewDiscs(modId.id("wait_disc"), "musicdiscs:wait","wait","C418").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        pigstep_Disc = new NewDiscs(modId.id("pigstep_disc"), "musicdiscs:pigstep","Pigstep","Lena Raine").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        otherside_Disc = new NewDiscs(modId.id("otherside_disc"), "musicdiscs:otherside","otherside","Lena Raine").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        relic_Disc = new NewDiscs(modId.id("relic_disc"), "musicdiscs:relic","Relic","Aaron Cherof").setMaxStackSize(1).setTranslationKey(modId, "Disc");
        five_Disc = new NewDiscs(modId.id("five_disc"), "musicdiscs:5","5","Samuel Åberg").setMaxStackSize(1).setTranslationKey(modId, "Disc");
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
                Discs.ward_Disc,
                Discs.wait_Disc,
                Discs.otherside_Disc,
        };
    }
}