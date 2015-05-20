package com.jadedpacks.jctweaks;



import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jctweaks.helpers.BloodMagicHelper;
import com.jadedpacks.jctweaks.helpers.BotaniaHelper;
import com.jadedpacks.jctweaks.helpers.FurnaceHelper;
import com.jadedpacks.jctweaks.helpers.HarvestCraftHelper;
import com.jadedpacks.jctweaks.helpers.MFRHelper;
import com.jadedpacks.jctweaks.helpers.RecipeRemover;
import com.jadedpacks.jctweaks.helpers.ThaumcraftHelper;
import com.jadedpacks.jctweaks.helpers.ThermalExpansionHelper;
import com.jadedpacks.jctweaks.helpers.TinkersConstructHelper;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME,  dependencies = "required-after:Forge@[10.13.3.1384,11.14);" +
		"after:TConstruct;" +
		"after:MineFactoryReloaded;" +
		"after:SolarFLux;" +
		"after:Forestry;" +
		"after:harvestcraft;" +
		"after:ThermalExpansion;")

public class Main {
	public static final String MODID = "JCTweaks";
	public static final String NAME = "JCTweaks";
	public static final String VERSION = "1.19";
	public static final Logger log = LogManager.getLogger(MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ThermalExpansionHelper.preInit();
		ThaumcraftHelper.preInit();
		TinkersConstructHelper.preInit();
		MFRHelper.preInit();
		BotaniaHelper.preInit();
		BloodMagicHelper.preInit();
		HarvestCraftHelper.preInit();
		FurnaceHelper.preInit();
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)

	{
		ThermalExpansionHelper.init();
		ThaumcraftHelper.init();
		TinkersConstructHelper.init();
		MFRHelper.init();
		BotaniaHelper.init();
		BloodMagicHelper.init();
		HarvestCraftHelper.init();
		FurnaceHelper.init();

		if (OreDictionary.getOres("oreTin").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotTin"
					));
			Main.log.info("Alternative Bucket Recipe tin loaded");
		}

		if (OreDictionary.getOres("oreAluminum").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotAluminum"
					));
			Main.log.info("Alternative Bucket Recipe aluminum loaded");
		}

		else if (OreDictionary.getOres("oreAluminium").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotAluminium"
					));
			Main.log.info("Alternative Bucket aluminium Recipe loaded");
		}
		if (OreDictionary.getOres("oreCopper").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotCopper"
					));
			Main.log.info("Alternative Bucket Recipe copper loaded");
		}

		if (Loader.isModLoaded("Botania"))
		{
			//remove terraformRod
			ItemStack terraformRod = GameRegistry.findItemStack("Botania", "terraformRod", 1);
			RecipeRemover.removeAnyRecipe(terraformRod);
		}
		if (Loader.isModLoaded("ExtraUtilities"))
		{
			ItemStack builderswand = GameRegistry.findItemStack("ExtraUtilities", "builderswand", 1);

			GameRegistry.addRecipe(new ShapedOreRecipe(builderswand,
					"XXD",
					"XDX",
					"OXX",
					'D', "gemDiamond",
					'O', "obsidian"
					));
			Main.log.info("Jaded added a recipe for the builders wand");
		}
		if (Loader.isModLoaded("Natura"))
		{
			ItemStack wartbag = GameRegistry.findItemStack("Natura", "wartbag", 1);
			RecipeRemover.removeAnyRecipe(wartbag);
			Main.log.info("Jaded removed wart bags, they were creepy");
		}

		if (Loader.isModLoaded("AgriCraft"))
		{
			//Cheaper Journal Recipe
			ItemStack journal = GameRegistry.findItemStack("AgriCraft", "journal", 1);
			ItemStack cropsticks = GameRegistry.findItemStack("AgriCraft", "cropsItem", 1);
			RecipeRemover.removeAnyRecipe(journal);
			GameRegistry.addRecipe(new ShapedOreRecipe(journal,
					"CSC",
					"SWS",
					"CSC",
					'C', cropsticks,
					'S', "listAllseed",
					'W', "plankWood"
					));
			Main.log.info("Alternative journal recipe loaded");
		}
		if (Loader.isModLoaded("progressiveautomation"))
		{
			//Cheaper CobbleGen
			ItemStack cobblegen = GameRegistry.findItemStack("progressiveautomation", "CobbleUpgrade", 1);
			ItemStack miner = GameRegistry.findItemStack("progressiveautomation", "MinerStone", 1);
			ItemStack lava = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketLava", 1);
			GameRegistry.addRecipe(new ShapedOreRecipe((cobblegen),

					"SSS",
					"LMW",
					"SSS",
					'S', "stone",
					'L', "lava",
					'M', "miner",
					'W', "listAllwater"
					));
			Main.log.info("cheaper cobble gen for the miner");
		}}

	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)

	{
		ThermalExpansionHelper.postInit();
		ThaumcraftHelper.postInit();
		TinkersConstructHelper.postInit();
		MFRHelper.postInit();
		BotaniaHelper.postInit();
		BloodMagicHelper.postInit();
		HarvestCraftHelper.postInit();
		FurnaceHelper.postInit();
	}
}


