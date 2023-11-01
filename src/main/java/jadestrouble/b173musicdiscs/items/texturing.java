package jadestrouble.b173musicdiscs.items;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.util.Null;

public class texturing {
    @Entrypoint.ModID
    final ModID MODID = Null.get();

    @EventListener
    void registerTextures(TextureRegisterEvent event) {
        discs.blocks_Disc.setTexture(MODID.id("item/blocks_disc.png"));
    }
}
