package net.trique.mythicupgrades.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.item.custom.*;


// This class includes all the items in the mod.

public class MythicItems {

    // public static final Item NETHERITE_SWORD = Items.register("netherite_sword", (Item)new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new Item.Settings().fireproof()));
    // public static final Item NETHERITE_SHOVEL = Items.register("netherite_shovel", (Item)new ShovelItem(ToolMaterials.NETHERITE, 1.5f, -3.0f, new Item.Settings().fireproof()));
    // public static final Item NETHERITE_PICKAXE = Items.register("netherite_pickaxe", (Item)new PickaxeItem(ToolMaterials.NETHERITE, 1, -2.8f, new Item.Settings().fireproof()));
    // public static final Item NETHERITE_AXE = Items.register("netherite_axe", (Item)new AxeItem(ToolMaterials.NETHERITE, 5.0f, -3.0f, new Item.Settings().fireproof()));
    // public static final Item NETHERITE_HOE = Items.register("netherite_hoe", (Item)new HoeItem(ToolMaterials.NETHERITE, -4, 0.0f, new Item.Settings().fireproof()));

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_APPLE = registerItem("sapphire_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.SAPPHIRE_APPLE)));

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(MythicToolMaterials.SAPPHIRE, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(MythicToolMaterials.SAPPHIRE, 5.0f, -3.0f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(MythicToolMaterials.SAPPHIRE, 1, -2.8f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(MythicToolMaterials.SAPPHIRE, -4, 0.0f,(new FabricItemSettings().fireproof())));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(MythicToolMaterials.SAPPHIRE, 1.5f, -3.0f,(new FabricItemSettings().fireproof())));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item RUBY_APPLE = registerItem("ruby_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.RUBY_APPLE)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(MythicToolMaterials.RUBY, 3, -1.8f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(MythicToolMaterials.RUBY, 5.0f, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(MythicToolMaterials.RUBY, 1, -2.2f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(MythicToolMaterials.RUBY, -4, 0.6f,(new FabricItemSettings().fireproof())));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(MythicToolMaterials.RUBY, 1.5f, -2.2f,(new FabricItemSettings().fireproof())));

    public static final Item JADE = registerItem("jade",
            new Item(new FabricItemSettings()));
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item JADE_APPLE = registerItem("jade_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.JADE_APPLE)));

    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof()));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(MythicArmorMaterials.JADE, EquipmentSlot.FEET, new FabricItemSettings().fireproof()));

    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings()));
    public static final Item TOPAZ_INGOT = registerItem("topaz_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_APPLE = registerItem("topaz_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.TOPAZ_APPLE)));

    public static final Item TOPAZ_SWORD = registerItem("topaz_sword",
            new SwordItem(MythicToolMaterials.TOPAZ, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_AXE = registerItem("topaz_axe",
            new AxeItem(MythicToolMaterials.TOPAZ, 5.0f, -3f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_PICKAXE = registerItem("topaz_pickaxe",
            new PickaxeItem(MythicToolMaterials.TOPAZ, 1, -2.8f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_HOE = registerItem("topaz_hoe",
            new HoeItem(MythicToolMaterials.TOPAZ, -4, 0.0f,(new FabricItemSettings().fireproof())));
    public static final Item TOPAZ_SHOVEL = registerItem("topaz_shovel",
            new ShovelItem(MythicToolMaterials.TOPAZ, 1.5f, -3.0f,(new FabricItemSettings().fireproof())));

    public static final Item TOPAZ_HELMET = registerItem("topaz_helmet",
            new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.HEAD, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.CHEST, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.LEGS, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(MythicArmorMaterials.TOPAZ, EquipmentSlot.FEET, new FabricItemSettings().fireproof()));

    public static final Item AMETRINE = registerItem("ametrine",
            new Item(new FabricItemSettings()));
    public static final Item AMETRINE_INGOT = registerItem("ametrine_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_APPLE = registerItem("ametrine_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.AMETRINE_APPLE)));

    public static final Item AMETRINE_HELMET = registerItem("ametrine_helmet",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof(), StatusEffects.SPEED));
    public static final Item AMETRINE_CHESTPLATE = registerItem("ametrine_chestplate",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof(), StatusEffects.JUMP_BOOST));
    public static final Item AMETRINE_LEGGINGS = registerItem("ametrine_leggings",
            new ArmorItem(MythicArmorMaterials.AMETRINE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_BOOTS = registerItem("ametrine_boots",
            new ArmorItem(MythicArmorMaterials.AMETRINE, EquipmentSlot.FEET, new FabricItemSettings().fireproof()));

    public static final Item AQUAMARINE = registerItem("aquamarine",
            new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE_INGOT = registerItem("aquamarine_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_FISH = registerItem("aquamarine_fish",
            new Item(new FabricItemSettings().food(MythicFoodComponents.AQUAMARINE_FISH)));

    public static final Item AQUAMARINE_HELMET = registerItem("aquamarine_helmet",
            new ArmorEffectItem(MythicArmorMaterials.AQUAMARINE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof(), StatusEffects.DOLPHINS_GRACE));
    public static final Item AQUAMARINE_CHESTPLATE = registerItem("aquamarine_chestplate",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_LEGGINGS = registerItem("aquamarine_leggings",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_BOOTS = registerItem("aquamarine_boots",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, EquipmentSlot.FEET, new FabricItemSettings().fireproof()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_AXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_PICKAXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_SHOVEL);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_HOE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_AXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_PICKAXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_SHOVEL);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_HOE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_AXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_PICKAXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_SHOVEL);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_HOE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_FISH);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_BOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerMythicItems() {
        MythicUpgrades.LOGGER.info("Registering Mythic Items for " + MythicUpgrades.MOD_ID);

        addItemsToItemGroup();
    }
}