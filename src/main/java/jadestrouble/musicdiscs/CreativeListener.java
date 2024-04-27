package jadestrouble.musicdiscs;

import jadestrouble.musicdiscs.items.Discs;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabMusicDiscs;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabMusicDiscs = new SimpleTab(Discs.MOD_ID.id("blocks_disc"), Discs.blocks_Disc);
        event.register(tabMusicDiscs);
        for (Item item : Discs.items){
            tabMusicDiscs.addItem(new ItemStack(item, 1));
        }
    }
}