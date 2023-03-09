package net.trique.mythicupgrades.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;

public class MythicItemGroup {
    public static ItemGroup MYTHICITEMGROUP;

    public static void registerMythicGroups() {
        MYTHICITEMGROUP = FabricItemGroup.builder(new Identifier(MythicUpgrades.MOD_ID, "mythicitemgroup"))
                .displayName(Text.literal("Mythic Upgrades"))
                .icon(() -> new ItemStack(MythicItems.RUBY)).build();
    }
}
