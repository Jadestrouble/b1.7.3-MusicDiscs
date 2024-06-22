package jadestrouble.musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class Discs {
    @Entrypoint.Namespace
    public static final Namespace MOD_ID = Null.get();
    public static Item[] items;
    public static Item blocks_Disc;
    public static Item chirp_Disc;
    public static Item far_Disc;
    public static Item mall_Disc;
    public static Item mellohi_Disc;
    public static Item stal_Disc;
    public static Item strad_Disc;
    public static Item ward_Disc;
    public static Item eleven_Disc;
    public static Item wait_Disc;
    public static Item pigstep_Disc;
    public static Item otherside_Disc;
@EventListener
public void registerItems(ItemRegistryEvent event) {
  blocks_Disc = (new NewDiscs(Identifier.of(MOD_ID, "blocks_Disc"), "musicdiscs:blocks", "C418 - blocks")).setTranslationKey(MOD_ID, "Disc");
  chirp_Disc = (new NewDiscs(Identifier.of(MOD_ID, "chirp_Disc"), "musicdiscs:chirp", "C418 - chirp")).setTranslationKey(MOD_ID, "Disc");
  far_Disc = (new NewDiscs(Identifier.of(MOD_ID, "far_Disc"), "musicdiscs:far", "C418 - far")).setTranslationKey(MOD_ID, "Disc");
  mall_Disc = (new NewDiscs(Identifier.of(MOD_ID, "mall_Disc"), "musicdiscs:mall", "C418 - mall")).setTranslationKey(MOD_ID, "Disc");
  mellohi_Disc = (new NewDiscs(Identifier.of(MOD_ID, "mellohi_Disc"), "musicdiscs:mellohi", "C418 - mellohi")).setTranslationKey(MOD_ID, "Disc");
  stal_Disc = (new NewDiscs(Identifier.of(MOD_ID, "stal_Disc"), "musicdiscs:stal", "C418 - stal")).setTranslationKey(MOD_ID, "Disc");
  strad_Disc = (new NewDiscs(Identifier.of(MOD_ID, "strad_Disc"), "musicdiscs:strad", "C418 - strad")).setTranslationKey(MOD_ID, "Disc");
  ward_Disc = (new NewDiscs(Identifier.of(MOD_ID, "ward_Disc"), "musicdiscs:ward", "C418 - ward")).setTranslationKey(MOD_ID, "Disc");
  eleven_Disc = (new NewDiscs(Identifier.of(MOD_ID, "eleven_Disc"), "musicdiscs:eleven", "C418 - 11")).setTranslationKey(MOD_ID, "Disc");
  wait_Disc = (new NewDiscs(Identifier.of(MOD_ID, "wait_Disc"), "musicdiscs:wait", "C418 - wait")).setTranslationKey(MOD_ID, "Disc");
  pigstep_Disc = (new NewDiscs(Identifier.of(MOD_ID, "pigstep_Disc"), "musicdiscs:pigstep", "Lena Raine - Pigstep")).setTranslationKey(MOD_ID, "Disc");
  otherside_Disc = (new NewDiscs(Identifier.of(MOD_ID, "otherside_Disc"), "musicdiscs:otherside", "Lena Raine - otherside")).setTranslationKey(MOD_ID, "Disc");
    items = new Item[]{
           Item.RECORD_THIRTEEN,
           Item.RECORD_CAT,
           Discs.blocks_Disc,
           Discs.chirp_Disc,
           Discs.eleven_Disc,
           Discs.far_Disc,
           Discs.mellohi_Disc,
           Discs.stal_Disc,
           Discs.strad_Disc,
           Discs.ward_Disc,
           Discs.wait_Disc,
           Discs.otherside_Disc,
    };
   }
}

