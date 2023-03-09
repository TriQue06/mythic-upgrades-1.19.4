package net.trique.mythicupgrades.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MythicFoodComponents {

    public static final FoodComponent SAPPHIRE_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1), 1F).
            alwaysEdible().build();

    public static final FoodComponent RUBY_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4800, 1), 1F).
            alwaysEdible().build();

    public static final FoodComponent JADE_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1F).
            alwaysEdible().build();

    public static final FoodComponent TOPAZ_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 2), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1200), 1F).
            alwaysEdible().build();

    public static final FoodComponent AMETRINE_APPLE = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 2), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2400, 2), 1F).
            alwaysEdible().build();

    public static final FoodComponent AQUAMARINE_FISH = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 7200), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 7200), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2400), 1F).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1F).
            alwaysEdible().build();

}
