package jadestrouble.musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.template.item.TemplateMusicDiscItem;
import net.modificationstation.stationapi.api.util.Namespace;
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

//    public static ItemBase pigstep_Disc;
//    public static ItemBase otherside_Disc;
//    public static ItemBase relic_Disc;
//    public static ItemBase five_Disc;

    @Entrypoint.Namespace
    public static final Namespace NAMESPACE = Null.get();

    @EventListener
    void registerItems(ItemRegistryEvent event) {
        blocks_Disc = new TemplateMusicDiscItem(NAMESPACE.id("blocks_disc"), "blocks").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        chirp_Disc = new TemplateMusicDiscItem(NAMESPACE.id("chirp_disc"), "chirp").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        far_Disc = new TemplateMusicDiscItem(NAMESPACE.id("far_disc"), "far").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        mall_Disc = new TemplateMusicDiscItem(NAMESPACE.id("mall_disc"), "mall").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        mellohi_Disc = new TemplateMusicDiscItem(NAMESPACE.id("mellohi_disc"), "mellohi").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        stal_Disc = new TemplateMusicDiscItem(NAMESPACE.id("stal_disc"), "stal").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        strad_Disc = new TemplateMusicDiscItem(NAMESPACE.id("strad_disc"), "strad").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        ward_Disc = new TemplateMusicDiscItem(NAMESPACE.id("ward_disc"), "ward").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        eleven_Disc = new TemplateMusicDiscItem(NAMESPACE.id("11_disc"), "11").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
        wait_Disc = new TemplateMusicDiscItem(NAMESPACE.id("wait_disc"), "wait").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
//        pigstep_Disc = new NewDiscs(NAMESPACE.id("pigstep_disc"), "musicdiscs:Pigstep","Pigstep","Lena Raine").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
//        otherside_Disc = new NewDiscs(NAMESPACE.id("otherside_disc"), "musicdiscs:otherside","otherside","Lena Raine").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
//        relic_Disc = new NewDiscs(NAMESPACE.id("relic_disc"), "musicdiscs:Relic","Relic","Aaron Cherof").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
//        five_Disc = new NewDiscs(NAMESPACE.id("five_disc"), "musicdiscs:5","5","Samuel Åberg").setMaxStackSize(1).setTranslationKey(NAMESPACE, "Disc");
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
        };
    }
}