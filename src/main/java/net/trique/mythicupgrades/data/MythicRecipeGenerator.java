package net.trique.mythicupgrades.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.item.MythicItems;

import java.util.List;
import java.util.function.Consumer;

public class MythicRecipeGenerator extends FabricRecipeProvider {
    public MythicRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerSmelting(exporter, List.of(MythicBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, MythicItems.SAPPHIRE,
                3.0f, 200, "sapphire");
        offerBlasting(exporter, List.of(MythicBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, MythicItems.SAPPHIRE,
                3.0f, 100, "sapphire");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_SAPPHIRE_ORE), RecipeCategory.MISC, MythicItems.SAPPHIRE,
                3.0f, 200, "sapphire");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_SAPPHIRE_ORE), RecipeCategory.MISC, MythicItems.SAPPHIRE,
                3.0f, 100, "sapphire");

        offerSmelting(exporter, List.of(MythicBlocks.RUBY_ORE), RecipeCategory.MISC, MythicItems.RUBY,
                3.0f, 200, "ruby");
        offerBlasting(exporter, List.of(MythicBlocks.RUBY_ORE), RecipeCategory.MISC, MythicItems.RUBY,
                3.0f, 100, "ruby");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_RUBY_ORE), RecipeCategory.MISC, MythicItems.RUBY,
                3.0f, 200, "ruby");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_RUBY_ORE), RecipeCategory.MISC, MythicItems.RUBY,
                3.0f, 100, "ruby");

        offerSmelting(exporter, List.of(MythicBlocks.JADE_ORE), RecipeCategory.MISC, MythicItems.JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MythicBlocks.JADE_ORE), RecipeCategory.MISC, MythicItems.JADE,
                3.0f, 100, "jade");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, MythicItems.JADE,
                3.0f, 200, "jade");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_JADE_ORE), RecipeCategory.MISC, MythicItems.JADE,
                3.0f, 100, "jade");

        offerSmelting(exporter, List.of(MythicBlocks.TOPAZ_ORE), RecipeCategory.MISC, MythicItems.TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MythicBlocks.TOPAZ_ORE), RecipeCategory.MISC, MythicItems.TOPAZ,
                3.0f, 100, "topaz");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, MythicItems.TOPAZ,
                3.0f, 200, "topaz");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_TOPAZ_ORE), RecipeCategory.MISC, MythicItems.TOPAZ,
                3.0f, 100, "topaz");

        offerSmelting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, MythicItems.AMETRINE,
                3.0f, 200, "ametrine");
        offerBlasting(exporter, List.of(MythicBlocks.AMETRINE_ORE), RecipeCategory.MISC, MythicItems.AMETRINE,
                3.0f, 100, "ametrine");
        
        offerSmelting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE), RecipeCategory.MISC, MythicItems.AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MythicBlocks.AQUAMARINE_ORE), RecipeCategory.MISC, MythicItems.AQUAMARINE,
                3.0f, 100, "aquamarine");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, MythicItems.AQUAMARINE,
                3.0f, 200, "aquamarine");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_AQUAMARINE_ORE), RecipeCategory.MISC, MythicItems.AQUAMARINE,
                3.0f, 100, "aquamarine");
        
        offerSmelting(exporter, List.of(MythicBlocks.KUNZITE_ORE), RecipeCategory.MISC, MythicItems.KUNZITE,
                3.0f, 200, "kunzite");
        offerBlasting(exporter, List.of(MythicBlocks.KUNZITE_ORE), RecipeCategory.MISC, MythicItems.KUNZITE,
                3.0f, 100, "kunzite");
        offerSmelting(exporter, List.of(MythicBlocks.DEEPSLATE_KUNZITE_ORE), RecipeCategory.MISC, MythicItems.KUNZITE,
                3.0f, 200, "kunzite");
        offerBlasting(exporter, List.of(MythicBlocks.DEEPSLATE_KUNZITE_ORE), RecipeCategory.MISC, MythicItems.KUNZITE,
                3.0f, 100, "kunzite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.SAPPHIRE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_SAPPHIRE_BLOCK);
        
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.RUBY, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.RUBY_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_RUBY_BLOCK);
        
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.JADE, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.JADE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_JADE_BLOCK);
        
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.TOPAZ, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOPAZ_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.TOPAZ_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_TOPAZ_BLOCK);
        
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.AMETRINE, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AMETRINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.AMETRINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_AMETRINE_BLOCK);
        
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.AQUAMARINE, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.AQUAMARINE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.AQUAMARINE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_AQUAMARINE_BLOCK);
   
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.KUNZITE, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.KUNZITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, MythicItems.KUNZITE_INGOT, RecipeCategory.BUILDING_BLOCKS, MythicBlocks.TOUGH_KUNZITE_BLOCK);
    }
}
