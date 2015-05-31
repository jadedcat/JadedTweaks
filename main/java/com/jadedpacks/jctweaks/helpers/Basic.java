package com.jadedpacks.jctweaks.helpers;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class Basic {


	public static void preInit(){


	}

	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(Parts.topiary,
				"XSX",
				"SDS",
				"XSX",
				'D', Parts.dirt,
				'S', "listAllseed"
				));

		if (OreDictionary.getOres("oreTin").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotTin"
					));
			Main.log.info("Alternative Bucket Recipe tin loaded");
			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
					"PPP",
					"CIC",
					"CRC",
					'I', "ingotTin",
					'P', "plankWood",
					'C', "cobblestone",
					'R', "dustRedstone"
					));
		}

		if (OreDictionary.getOres("oreAluminum").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotAluminum"
					));
			Main.log.info("Alternative Bucket Recipe aluminum loaded");

			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
					"PPP",
					"CIC",
					"CRC",
					'I', "ingotAluminum",
					'P', "plankWood",
					'C', "cobblestone",
					'R', "dustRedstone"
					));
		}

		else if (OreDictionary.getOres("oreAluminium").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket),
					"IXI",
					"XIX",
					'I', "ingotAluminium"
					));
			Main.log.info("Alternative Bucket aluminium Recipe loaded");

			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
					"PPP",
					"CIC",
					"CRC",
					'I', "ingotAluminium",
					'P', "plankWood",
					'C', "cobblestone",
					'R', "dustRedstone"
					));
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

		if (Loader.isModLoaded("Botania") && (Loader.isModLoaded("exnihilo")))
		{
			//remove terraformRod
			ItemStack terraformRod = GameRegistry.findItemStack("Botania", "terraformRod", 1);
			RecipeRemover.removeAnyRecipe(terraformRod);
		}
		if (Loader.isModLoaded("ExtraUtilities")&& (Loader.isModLoaded("exnihilo")))
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

		if (Loader.isModLoaded("customnpcs")&& (Loader.isModLoaded("Thaumcraft")))
		{

			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.artifact,
					"DXG",
					"ASR",
					'D', Parts.demoningot,
					'G', Parts.goldcoin,
					'A', Parts.amethyst,
					'S', Parts.saphire,
					'R', Parts.ruby
					));
		}
		if (Loader.isModLoaded("Natura") && (Loader.isModLoaded("exnihilo")))
		{
			ItemStack wartbag = GameRegistry.findItemStack("Natura", "wartbag", 1);
			RecipeRemover.removeAnyRecipe(wartbag);
			Main.log.info("Jaded removed wart bags, they were creepy");
		}


		if (Loader.isModLoaded("progressiveautomation") && (Loader.isModLoaded("exnihilo")))
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
					'L', lava,
					'M', miner,
					'W', "listAllwater"
					));
			Main.log.info("cheaper cobble gen for the miner");
		}
	}


	public static void postInit() {

		if (Loader.isModLoaded("AgriCraft") && (Loader.isModLoaded("exnihilo")))
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
		if (OreDictionary.getOres("treeLeaves").size() > 0)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.podzolitem,
					"LLL",
					"LDL",
					"LLL",
					'D', Parts.dirt,
					'L', "treeLeaves"
					));
		}

	}

}
