package com.niksalde.survivhelper.fabric;

import net.fabricmc.api.ModInitializer;
import com.niksalde.survivhelper.SurviHelper;

public class SurviHelperFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SurviHelper.init();
    }
}