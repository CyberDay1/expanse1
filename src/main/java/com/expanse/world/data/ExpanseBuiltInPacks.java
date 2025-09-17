package com.expanse.world.data;

import com.expanse.world.ExpanseMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@Mod.EventBusSubscriber(modid = ExpanseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ExpanseBuiltInPacks {
    private static final ResourceLocation BUILTIN_PACK_ID = ExpanseMod.id("theexpanse");
    private static final Component BUILTIN_TITLE = Component.literal("The Expanse");

    private ExpanseBuiltInPacks() {
    }

    @SubscribeEvent
    public static void addPackFinders(final AddPackFindersEvent event) {
        if (event.getPackType() != PackType.SERVER_DATA) {
            return;
        }

        event.addPackFinders(
            BUILTIN_PACK_ID,
            PackType.SERVER_DATA,
            BUILTIN_TITLE,
            PackSource.BUILT_IN,
            true,
            Pack.Position.TOP
        );
    }
}
