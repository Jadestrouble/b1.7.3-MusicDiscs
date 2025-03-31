package jadestrouble.musicdiscs;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;

public class Config {

    @ConfigRoot(value = "config", visibleName = "Music Discs")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigEntry(
                name = "Disable Modern Music Disc Tooltips"
        )
        public Boolean disableModernMusicDiscTooltips = false;

        @ConfigEntry(
                name = "Ghasts Drop Pigstep",
                description = "Ghasts will drop Pigstep disc when killed",
                multiplayerSynced = true
        )
        public Boolean replaceGhastsDropPigstep = true;

        @ConfigEntry(
                name = "Replace Creeper/Skeleton Discs",
                description = "If skeleton kills creeper get random disc",
                multiplayerSynced = true
        )
        public Boolean replaceDiscsOnSkeletonKillCreeper = true;

        @ConfigEntry(
                name = "Replace Creeper/Skeleton Discs",
                description = "Dungeons spawn with random music discs",
                multiplayerSynced = true
        )
        public Boolean replaceDiscsInDungeonChests = true;
    }
}