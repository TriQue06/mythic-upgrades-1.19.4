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
import net.trique.mythicupgrades.effect.MythicEffects;
import net.trique.mythicupgrades.item.custom.*;
import org.objectweb.asm.Type;

public class MythicItems {

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_INGOT = registerItem("sapphire_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_CHARM = registerItem("sapphire_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
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
    
    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ThornsArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(MythicArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item RUBY_CHARM = registerItem("ruby_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
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

    
    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorEffectItem(MythicArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.HASTE));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(MythicArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(MythicArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(MythicArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item JADE = registerItem("jade",
            new Item(new FabricItemSettings()));
    public static final Item JADE_INGOT = registerItem("jade_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item JADE_CHARM = registerItem("jade_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
    public static final Item JADE_APPLE = registerItem("jade_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.JADE_APPLE)));


    public static final Item JADE_SWORD = registerItem("jade_sword",
            new PoisonWeaponItem(MythicToolMaterials.JADE, 3, -2.4f,(new FabricItemSettings().fireproof())));
    public static final Item JADE_BATTLE_AXE = registerItem("jade_battle_axe",
            new PoisonWeaponItem(MythicToolMaterials.JADE, 7, -3.5f,(new FabricItemSettings().fireproof())));

    public static final Item JADE_HELMET = registerItem("jade_helmet",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item JADE_CHESTPLATE = registerItem("jade_chestplate",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item JADE_LEGGINGS = registerItem("jade_leggings",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item JADE_BOOTS = registerItem("jade_boots",
            new ArmorItem(MythicArmorMaterials.JADE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item TOPAZ = registerItem("topaz",
            new Item(new FabricItemSettings()));
    public static final Item TOPAZ_INGOT = registerItem("topaz_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_CHARM = registerItem("topaz_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
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
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_CHESTPLATE = registerItem("topaz_chestplate",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_LEGGINGS = registerItem("topaz_leggings",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item TOPAZ_BOOTS = registerItem("topaz_boots",
            new ArmorItem(MythicArmorMaterials.TOPAZ, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item AMETRINE = registerItem("ametrine",
            new Item(new FabricItemSettings()));
    public static final Item AMETRINE_INGOT = registerItem("ametrine_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_CHARM = registerItem("ametrine_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
    public static final Item AMETRINE_APPLE = registerItem("ametrine_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.AMETRINE_APPLE)));


    public static final Item AMETRINE_HELMET = registerItem("ametrine_helmet",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.SPEED));
    public static final Item AMETRINE_CHESTPLATE = registerItem("ametrine_chestplate",
            new PowerfulArmorEffectItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof(), StatusEffects.JUMP_BOOST));
    public static final Item AMETRINE_LEGGINGS = registerItem("ametrine_leggings",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AMETRINE_BOOTS = registerItem("ametrine_boots",
            new ArmorItem(MythicArmorMaterials.AMETRINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item AQUAMARINE = registerItem("aquamarine",
            new Item(new FabricItemSettings()));
    public static final Item AQUAMARINE_INGOT = registerItem("aquamarine_ingot",
            new Item(new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_CHARM = registerItem("aquamarine_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
    public static final Item AQUAMARINE_FISH = registerItem("aquamarine_fish",
            new Item(new FabricItemSettings().food(MythicFoodComponents.AQUAMARINE_FISH)));


    public static final Item AQUAMARINE_HELMET = registerItem("aquamarine_helmet",
            new ArmorEffectItem(MythicArmorMaterials.AQUAMARINE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.DOLPHINS_GRACE));
    public static final Item AQUAMARINE_CHESTPLATE = registerItem("aquamarine_chestplate",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_LEGGINGS = registerItem("aquamarine_leggings",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item AQUAMARINE_BOOTS = registerItem("aquamarine_boots",
            new ArmorItem(MythicArmorMaterials.AQUAMARINE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    public static final Item KUNZITE = registerItem("kunzite",
            new Item(new FabricItemSettings()));
    public static final Item KUNZITE_INGOT = registerItem("kunzite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item KUNZITE_CHARM = registerItem("kunzite_charm",
            new Item(new FabricItemSettings().fireproof().maxCount(1)));
    public static final Item KUNZITE_APPLE = registerItem("kunzite_apple",
            new Item(new FabricItemSettings().food(MythicFoodComponents.KUNZITE_APPLE)));


    public static final Item KUNZITE_HELMET = registerItem("kunzite_helmet",
            new ArmorEffectItem(MythicArmorMaterials.KUNZITE, ArmorItem.Type.HELMET, new FabricItemSettings().fireproof(), StatusEffects.ABSORPTION));
    public static final Item KUNZITE_CHESTPLATE = registerItem("kunzite_chestplate",
            new ArmorItem(MythicArmorMaterials.KUNZITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().fireproof()));
    public static final Item KUNZITE_LEGGINGS = registerItem("kunzite_leggings",
            new ArmorItem(MythicArmorMaterials.KUNZITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings().fireproof()));
    public static final Item KUNZITE_BOOTS = registerItem("kunzite_boots",
            new ArmorItem(MythicArmorMaterials.KUNZITE, ArmorItem.Type.BOOTS, new FabricItemSettings().fireproof()));

    private static Item registerItem (String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MythicUpgrades.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_AXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_PICKAXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_SHOVEL);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_HOE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, SAPPHIRE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_AXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_PICKAXE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_SHOVEL);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_HOE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, RUBY_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_SWORD);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_BATTLE_AXE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, JADE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, TOPAZ_CHARM);

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

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AMETRINE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_FISH);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, AQUAMARINE_BOOTS);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_INGOT);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_APPLE);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_CHARM);

        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_HELMET);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_CHESTPLATE);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_LEGGINGS);
        addToItemGroup(MythicItemGroup.MYTHICITEMGROUP, KUNZITE_BOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerMythicItems() {
        MythicUpgrades.LOGGER.info("Registering Mythic Items for " + MythicUpgrades.MOD_ID);

        addItemsToItemGroup();
    }
}