package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class HarvestCraftHelper {




	public static void preInit(){}

	public static void init()
	{
		if (Loader.isModLoaded("harvestcraft"))
		{

		}
	}

	public static void postInit() {
		addRecipes();
	}

	private static void addRecipes()

	{
		ItemStack flour = GameRegistry.findItemStack("harvestcraft", "flourItem", 1);
		ItemStack freshwater = GameRegistry.findItemStack("harvestcraft", "freshwaterItem", 4);
		ItemStack claywater = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketWater", 1);
		GameRegistry.addRecipe(freshwater,
				"F",
				'F', claywater
				);

		if (Loader.isModLoaded("Botania"))
		{
			if (OreDictionary.getOres("listAllgrain").size() > 0)
			{	Item woodmortar = GameRegistry.findItem("Botania", "pestleAndMortar");

			GameRegistry.addRecipe(new ShapelessOreRecipe(flour, woodmortar,"listAllgrain"));
			}
			else
			{
				Item woodmortar = GameRegistry.findItem("Botania", "pestleAndMortar");
				ItemStack wheat = GameRegistry.findItemStack("minecraft", "wheat", 1);

				GameRegistry.addRecipe(flour,
						"MG",
						'M', woodmortar,
						'G', wheat
						);
			}
		}

		if (OreDictionary.getOres("toolMortarandpestle").size() > 0)
		{
			GameRegistry.addRecipe(new ShapelessOreRecipe(flour,"toolMortarandpestle","cropPotato"));
		}
		Main.log.info("Harvestcraft Tweaks Loaded");
	}
}
