package top.decided.skipskinverify.mixin;

import com.mojang.authlib.yggdrasil.TextureUrlChecker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TextureUrlChecker.class)
public class TextureUrlCheckerMixin {
    @Inject(method = "isAllowedTextureDomain", at = @At("HEAD"), cancellable = true)
    private static void rjsOfflineServerSkins$allowCustomTextureHosts(String url, CallbackInfoReturnable<Boolean> cir) {
        if (url != null && (url.startsWith("https://") || url.startsWith("http://"))) {
            cir.setReturnValue(true);
        }
    }
}