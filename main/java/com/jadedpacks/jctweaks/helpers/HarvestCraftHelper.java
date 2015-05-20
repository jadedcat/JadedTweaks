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

		GameRegistry.addRecipe(Parts.freshwater,
				"F",
				'F', Parts.claywater
				);

		if (Loader.isModLoaded("Botania"))
		{
			if (OreDictionary.getOres("listAllgrain").size() > 0)
			{
				GameRegistry.addRecipe(new ShapelessOreRecipe(Parts.flour, Parts.woodmortar,"listAllgrain"));
			}
			else
			{
				GameRegistry.addRecipe(Parts.flour,
						"MG",
						'M', Parts.woodmortar,
						'G', Parts.wheat
						);
			}
		}

		if (OreDictionary.getOres("toolMortarandpestle").size() > 0)
		{
			GameRegistry.addRecipe(new ShapelessOreRecipe(Parts.flour,"toolMortarandpestle","cropPotato"));
		}
		Main.log.info("Harvestcraft Tweaks Loaded");
	}
}
