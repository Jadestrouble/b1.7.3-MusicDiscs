package jadestrouble.musicdiscs.items;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.BlockBase;
import net.minecraft.block.Jukebox;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateMusicDiscItem;
import net.modificationstation.stationapi.api.util.Identifier;

public class NewDiscs extends TemplateMusicDiscItem implements CustomTooltipProvider {
    String displayTitle = "";
    String musicId = "";
    String author = "";
    public NewDiscs(Identifier i, String music, String displayTitle, String author) {
        super(i, music);
        musicId = music;
        this.displayTitle = displayTitle;
        this.author = author;
    }

    @Override
    public boolean useOnTile(ItemInstance arg, PlayerBase arg2, Level arg3, int i, int j, int k, int l) {
        if (arg3.getTileId(i, j, k) == BlockBase.JUKEBOX.id && arg3.getTileMeta(i, j, k) == 0) {
            if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
                System.out.println(this.displayTitle);
                ((Minecraft) FabricLoader.getInstance().getGameInstance()).overlay.showJukeboxMessage(this.author + " - " + this.displayTitle);
                ((Minecraft) FabricLoader.getInstance().getGameInstance()).soundHelper.playStreaming(musicId, i, j, k, 1.0F, 1.0F);
            }
            if (arg3.isServerSide) {
                return true;
            } else {
                ((Jukebox) BlockBase.JUKEBOX).setRecord(arg3, i, j, k, this.id);
                --arg.count;
                return true;
            }
        } else {
            return false;
        }
    }
    @Override
    public String[] getTooltip(ItemInstance itemInstance, String originalTooltip) {
        return new String[]{"§bMusic Disc" , author + " - "+ displayTitle};
    }
}
