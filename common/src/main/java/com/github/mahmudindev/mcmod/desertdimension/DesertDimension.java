package com.github.mahmudindev.mcmod.desertdimension;

import com.github.mahmudindev.mcmod.desertdimension.platform.Services;
import com.github.mahmudindev.mcmod.desertdimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class DesertDimension {
    public static final String MOD_ID = "desertdimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
