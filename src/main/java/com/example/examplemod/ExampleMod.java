package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;

@Mod("examplemod")
package com.example.examplemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("examplemod")
public class ExampleMod {
    public ExampleMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent event) {
        // Common setup logic
    }
}