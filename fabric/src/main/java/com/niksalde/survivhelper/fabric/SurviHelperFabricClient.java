package com.niksalde.survivhelper.fabric;

import net.fabricmc.api.ClientModInitializer;
import com.niksalde.survivhelper.SurviHelper;

public class SurviHelperFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SurviHelper.clientInit();
    }
}