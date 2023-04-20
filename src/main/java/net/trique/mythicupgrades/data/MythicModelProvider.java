package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.item.MythicItems;

public class MythicModelProvider extends FabricModelProvider {
    public MythicModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_SAPPHIRE_BLOCK);
        
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_RUBY_BLOCK);
        
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_JADE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.JADE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_JADE_BLOCK);
        
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_TOPAZ_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOPAZ_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_TOPAZ_BLOCK);
        
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AMETRINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AMETRINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_AMETRINE_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.AQUAMARINE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_AQUAMARINE_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.KUNZITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.DEEPSLATE_KUNZITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.KUNZITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(MythicBlocks.TOUGH_KUNZITE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(MythicItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.SAPPHIRE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.SAPPHIRE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.SAPPHIRE_CHARM, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.register(MythicItems.SAPPHIRE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.SAPPHIRE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.SAPPHIRE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.SAPPHIRE_BOOTS, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(MythicItems.RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.RUBY_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.RUBY_CHARM, Models.GENERATED);

        itemModelGenerator.register(MythicItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.register(MythicItems.RUBY_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.RUBY_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.RUBY_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.RUBY_BOOTS, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.JADE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.JADE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.JADE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.JADE_CHARM, Models.GENERATED);

        itemModelGenerator.register(MythicItems.JADE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.JADE_BATTLE_AXE, Models.HANDHELD);

        itemModelGenerator.register(MythicItems.JADE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.JADE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.JADE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.JADE_BOOTS, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.TOPAZ, Models.GENERATED);
        itemModelGenerator.register(MythicItems.TOPAZ_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.TOPAZ_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.TOPAZ_CHARM, Models.GENERATED);

        itemModelGenerator.register(MythicItems.TOPAZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.TOPAZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.TOPAZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.TOPAZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(MythicItems.TOPAZ_HOE, Models.HANDHELD);

        itemModelGenerator.register(MythicItems.TOPAZ_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.TOPAZ_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.TOPAZ_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.TOPAZ_BOOTS, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.AMETRINE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AMETRINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AMETRINE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.AMETRINE_CHARM, Models.GENERATED);

        itemModelGenerator.register(MythicItems.AMETRINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AMETRINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AMETRINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AMETRINE_BOOTS, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.AQUAMARINE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AQUAMARINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AQUAMARINE_FISH, Models.GENERATED);

        itemModelGenerator.register(MythicItems.AQUAMARINE_CHARM, Models.GENERATED);

        itemModelGenerator.register(MythicItems.AQUAMARINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AQUAMARINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AQUAMARINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.AQUAMARINE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(MythicItems.KUNZITE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.KUNZITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(MythicItems.KUNZITE_APPLE, Models.GENERATED);

        itemModelGenerator.register(MythicItems.KUNZITE_CHARM, Models.GENERATED);
        
        itemModelGenerator.register(MythicItems.KUNZITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(MythicItems.KUNZITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(MythicItems.KUNZITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(MythicItems.KUNZITE_BOOTS, Models.GENERATED);
    }
}
