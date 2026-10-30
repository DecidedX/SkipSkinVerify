package top.decided.skipskinverify;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkipSkinVerify implements ClientModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("skipskinverify");

	@Override
	public void onInitializeClient() {
		LOGGER.info("SkipSkinVerify loaded");
	}
}