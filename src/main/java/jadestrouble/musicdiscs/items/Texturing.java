package jadestrouble.musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;

public class Texturing {

    @Entrypoint.Namespace
    public static final Namespace NAMESPACE = Null.get();

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        Discs.blocks_Disc.setTexture(NAMESPACE.id("item/blocks_disc"));
        Discs.chirp_Disc.setTexture(NAMESPACE.id("item/chirp_disc"));
        Discs.far_Disc.setTexture(NAMESPACE.id("item/far_disc"));
        Discs.mall_Disc.setTexture(NAMESPACE.id("item/mall_disc"));
        Discs.mellohi_Disc.setTexture(NAMESPACE.id("item/mellohi_disc"));
        Discs.stal_Disc.setTexture(NAMESPACE.id("item/stal_disc"));
        Discs.strad_Disc.setTexture(NAMESPACE.id("item/strad_disc"));
        Discs.ward_Disc.setTexture(NAMESPACE.id("item/ward_disc"));
        Discs.eleven_Disc.setTexture(NAMESPACE.id("item/11_disc"));
        Discs.wait_Disc.setTexture(NAMESPACE.id("item/wait_disc"));
//        Discs.pigstep_Disc.setTexture(NAMESPACE.id("item/pigstep_disc"));
//        Discs.otherside_Disc.setTexture(NAMESPACE.id("item/otherside_disc"));
//        Discs.relic_Disc.setTexture(NAMESPACE.id("item/relic_disc"));
//        Discs.five_Disc.setTexture(NAMESPACE.id("item/5_disc"));
    }
}
