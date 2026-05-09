package com.niksalde.survivhelper.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafxmod.FXModLoadingContext;
import com.niksalde.survivhelper.SurviHelper;

@Mod.EventBusSubscriber(modid = "survivhelper", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SurviHelperForgeClient {
    public SurviHelperForgeClient() {
        IEventBus modEventBus = FXModLoadingContext.getInstance().getModEventBus();
        SurviHelper.clientInit();
    }
}