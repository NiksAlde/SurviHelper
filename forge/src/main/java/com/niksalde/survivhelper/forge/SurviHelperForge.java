package com.niksalde.survivhelper.forge;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafxmod.FXModLoadingContext;
import com.niksalde.survivhelper.SurviHelper;

@Mod("survivhelper")
public class SurviHelperForge {
    public SurviHelperForge() {
        IEventBus modEventBus = FXModLoadingContext.getInstance().getModEventBus();
        SurviHelper.init();
    }
}