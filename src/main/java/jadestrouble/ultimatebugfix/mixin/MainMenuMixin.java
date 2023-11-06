package jadestrouble.ultimatebugfix.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.menu.MainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({MainMenu.class})
public class MainMenuMixin {
        public MainMenuMixin() {
        }
        @Redirect(
                method = {"init"},
                at = @At(
                        value = "FIELD",
                        target = "Lnet/minecraft/client/Minecraft;isApplet:Z",
                        opcode = 180
                )
        )
        private boolean enableQuitButton(Minecraft minecraft) {
            return false;
        }
}
