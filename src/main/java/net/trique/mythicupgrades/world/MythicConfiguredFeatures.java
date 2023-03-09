package net.trique.mythicupgrades.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.block.MythicBlocks;

import java.util.List;

public class MythicConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JADE_ORE_KEY = registerKey("jade_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETRINE_ORE_KEY = registerKey("ametrine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_KEY = registerKey("aquamarine_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldJadeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.JADE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endAmetrineOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, MythicBlocks.AMETRINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MythicBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MythicBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));


        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 4));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4));
        register(context, JADE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldJadeOres, 4));
        register(context, TOPAZ_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTopazOres, 4));
        register(context, AMETRINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endAmetrineOres, 4));
        register(context, AQUAMARINE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquamarineOres, 4));
}

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MythicUpgrades.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
