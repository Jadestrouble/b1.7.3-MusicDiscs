package jadestrouble.musicdiscs;

import blue.endless.jankson.Comment;
import net.glasslauncher.mods.api.gcapi.api.*;

public class Config {

    @GConfig(value = "config", visibleName = "Music Discs")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigName("Replace Creeper/Skeleton Discs")
        @Comment("If skeleton kills creeper get random disc")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean replaceDiscsOnSkeletonKillCreeper = true;

        @ConfigName("Replace Discs In Dungeon Chests")
        @Comment("Dungeons spawn with random music discs")
        @MultiplayerSynced
        @ValueOnVanillaServer(booleanValue = TriBoolean.FALSE)
        public Boolean replaceDiscsInDungeonChests = true;
    }
}