package de.jaypi4c.mineduino.survival.component;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.UnaryOperator;

public class MineDuinoSurvivalComponentTypes {

    private static <T> ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(MineDuinoSurvival.MOD_ID, name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        MineDuinoSurvival.LOGGER.info("Registering Data Component Types for " + MineDuinoSurvival.MOD_ID);
    }

}
