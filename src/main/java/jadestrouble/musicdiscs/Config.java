package jadestrouble.musicdiscs;

import net.glasslauncher.mods.gcapi3.api.ConfigEntry;
import net.glasslauncher.mods.gcapi3.api.ConfigRoot;

public class Config {

    @ConfigRoot(value = "config", visibleName = "Music Discs")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {
        @ConfigEntry(
                name = "Add Calm4 (Magnetic Circuit) Music Disc",
                multiplayerSynced = true
        )
        public Boolean addCalm4MusicDisc = true;

        @ConfigEntry(
                name = "Calm4 Displays Magnetic As Disc Name",
                description = "Restart required for changes to take effect"
        )
        public Boolean calm4DisplaysMagneticAsDiscName = true;

        @ConfigEntry(
                name = "Chance Ghasts Drop Pigstep",
                description = "Float value between 0.0 (0%) and 1.0 (100%)",
                multiplayerSynced = true
        )
        public Float chanceGhastsDropPigstep = 0.056f;

        @ConfigEntry(
                name = "Disable Modern Music Disc Tooltips"
        )
        public Boolean disableModernMusicDiscTooltips = false;

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