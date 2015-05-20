package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class HarvestCraftHelper {




	public static void preInit(){}

	public static void init()
	{
		if (Loader.isModLoaded("harvestcraft"))
		{
			addRecipes();
		}
	}

	public static void postInit() {}

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
			//if (OreDictionary.getOres("listAllgrain").size() > 0)
			//{	ItemStack woodmortar = GameRegistry.findItemStack("Botania", "pestleAndMortar", 1);

			//GameRegistry.addRecipe(new ShapelessOreRecipe(flour,
			//"MG",
			//'M', woodmortar,
			//'G', "listAllgrain"
			//));
			//}
			//else
			//{
			ItemStack woodmortar = GameRegistry.findItemStack("Botania", "pestleAndMortar", 1);
			ItemStack wheat = GameRegistry.findItemStack("minecraft", "wheat", 1);

			GameRegistry.addRecipe(flour,
					"MG",
					'M', woodmortar,
					'G', wheat
					);
			//}
		}

		if (OreDictionary.getOres("toolMortarandpestle").size() > 0)
		{
			GameRegistry.addRecipe(new ShapelessOreRecipe(flour,
					"MG",
					'M', "toolMortarandpestle",
					'G', "cropPotato"
					));
		}

		if (Loader.isModLoaded("TConstruct"))
		{
			ItemStack pot = GameRegistry.findItemStack("harvestcraft", "potItem", 1);
			ItemStack saucepan = GameRegistry.findItemStack("harvestcraft", "saucepanItem", 1);
			RecipeRemover.removeAnyRecipe(pot);
			RecipeRemover.removeAnyRecipe(saucepan);
			ItemStack raisins = GameRegistry.findItemStack("harvestcraft", "raisinsItem", 1);
		}
	}
}
