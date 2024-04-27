package jadestrouble.musicdiscs;

import jadestrouble.musicdiscs.items.Discs;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabMusicDiscs;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabMusicDiscs = new SimpleTab(Discs.NAMESPACE.id("blocks_disc"), Discs.blocks_Disc);
        event.register(tabMusicDiscs);
        for (ItemBase item : Discs.items){
            tabMusicDiscs.addItem(new ItemInstance(item, 1));
        }
    }
}