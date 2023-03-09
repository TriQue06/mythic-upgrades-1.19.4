package net.trique.mythicupgrades;

import net.fabricmc.api.ModInitializer;

import net.trique.mythicupgrades.block.MythicBlocks;
import net.trique.mythicupgrades.item.MythicItemGroup;
import net.trique.mythicupgrades.item.MythicItems;
import net.trique.mythicupgrades.world.gen.MythicWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythicUpgrades implements ModInitializer {
	public static final String MOD_ID = "mythicupgrades";
	public static final Logger LOGGER = LoggerFactory.getLogger("mythicupgrades");

	@Override
	public void onInitialize() {
		MythicItemGroup.registerMythicGroups();
		MythicItems.registerMythicItems();
		MythicBlocks.registerMythicBlocks();
		MythicWorldGeneration.generateModWorldGen();


		LOGGER.info("Mythic Upgrades PROBABLY works properly!");
	}
}