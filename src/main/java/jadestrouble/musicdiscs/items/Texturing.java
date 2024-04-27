package jadestrouble.musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

import static net.modificationstation.stationapi.api.util.Identifier.of;

public class Texturing {
    @Entrypoint.Namespace
    private static final Namespace MOD_ID = Null.get();

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        setItemTextures();
    }
    private void setItemTextures() {
        Discs.blocks_Disc.setTexture(of(MOD_ID, "item/blocks_disc"));
        Discs.chirp_Disc.setTexture(of(MOD_ID,"item/chirp_disc"));
        Discs.far_Disc.setTexture(of(MOD_ID,"item/far_disc"));
        Discs.mall_Disc.setTexture(of(MOD_ID,"item/mall_disc"));
        Discs.mellohi_Disc.setTexture(of(MOD_ID,"item/mellohi_disc"));
        Discs.stal_Disc.setTexture(of(MOD_ID,"item/stal_disc"));
        Discs.strad_Disc.setTexture(of(MOD_ID,"item/strad_disc"));
        Discs.ward_Disc.setTexture(of(MOD_ID,"item/ward_disc"));
        Discs.eleven_Disc.setTexture(of(MOD_ID,"item/11_disc"));
        Discs.wait_Disc.setTexture(of(MOD_ID,"item/wait_disc"));
        Discs.pigstep_Disc.setTexture(of(MOD_ID,"item/pigstep_disc"));
        Discs.otherside_Disc.setTexture(of(MOD_ID,"item/otherside_disc"));
    }
}

