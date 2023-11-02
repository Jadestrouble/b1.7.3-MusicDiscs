package jadestrouble.musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class Texturing {

    @Entrypoint.ModID
    public static final ModID MOD_ID = Null.get();

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        Discs.blocks_Disc.setTexture(Identifier.of(MOD_ID, "item/blocks_disc"));
        Discs.chirp_Disc.setTexture(Identifier.of(MOD_ID, "item/chirp_disc"));
        Discs.far_Disc.setTexture(Identifier.of(MOD_ID, "item/far_disc"));
        Discs.mall_Disc.setTexture(Identifier.of(MOD_ID, "item/mall_disc"));
        Discs.mellohi_Disc.setTexture(Identifier.of(MOD_ID, "item/mellohi_disc"));
        Discs.stal_Disc.setTexture(Identifier.of(MOD_ID, "item/stal_disc"));
        Discs.strad_Disc.setTexture(Identifier.of(MOD_ID, "item/strad_disc"));
        Discs.ward_Disc.setTexture(Identifier.of(MOD_ID, "item/ward_disc"));
        Discs.eleven_Disc.setTexture(Identifier.of(MOD_ID, "item/11_disc"));
        Discs.wait_Disc.setTexture(Identifier.of(MOD_ID, "item/wait_disc"));

    }
}
