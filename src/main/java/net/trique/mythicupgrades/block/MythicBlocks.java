package net.trique.mythicupgrades.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.MythicItemGroup;

public class MythicBlocks {

//  public static final Block DIAMOND_ORE = Blocks.register("diamond_ore",
//  new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(3, 7)));

//  public static final Block DEEPSLATE_DIAMOND_ORE = Blocks.register("deepslate_diamond_ore",
//  new ExperienceDroppingBlock(AbstractBlock.Settings.copy(DIAMOND_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

//  public static final Block DIAMOND_BLOCK = Blocks.register("diamond_block",
//  new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)));

//  public static final Block NETHERITE_BLOCK = Blocks.register("netherite_block",
//  new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)));

//  Mythic Upgrades related blocks have same stats as diamond related blocks have to be Vanilla-friendly (except for their experience amount)

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(SAPPHIRE_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.LAPIS_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_SAPPHIRE_BLOCK = registerBlock("tough_sapphire_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.LAPIS_BLUE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);


    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.DARK_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_RUBY_BLOCK = registerBlock("tough_ruby_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.DARK_RED).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);


    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.LIME).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_JADE_BLOCK = registerBlock("tough_jade_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.LIME).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);


    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.TERRACOTTA_ORANGE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_TOPAZ_BLOCK = registerBlock("tough_topaz_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.TERRACOTTA_ORANGE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);


    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(6.0f, 4.5f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.PURPLE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_AMETRINE_BLOCK = registerBlock("tough_ametrine_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.PURPLE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);


    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock("deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(AbstractBlock.Settings.copy(RUBY_ORE).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5f, 3.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(8, 32)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)),
            MythicItemGroup.MYTHICITEMGROUP);

    public static final Block TOUGH_AQUAMARINE_BLOCK = registerBlock("tough_aquamarine_block",
            new Block(AbstractBlock.Settings.of(Material.METAL, MapColor.DIAMOND_BLUE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)),
            MythicItemGroup.MYTHICITEMGROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MythicUpgrades.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerMythicBlocks() {
        MythicUpgrades.LOGGER.info("Registering Mythic Blocks for " + MythicUpgrades.MOD_ID);
    }
}
