package net.lev.satisfactory;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB_REGISTRY =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Satisfactory.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SATISFACTORY = CREATIVE_TAB_REGISTRY.register("satisfactory",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BIOMASS.get()))
//                    .title(Component.translatable())
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.BIOMASS.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TAB_REGISTRY.register(eventBus);
    }
}
