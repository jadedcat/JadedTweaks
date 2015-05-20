package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import WayofTime.alchemicalWizardry.api.alchemy.AlchemyRecipeRegistry;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;

import com.jadedpacks.jctweaks.Main;
import com.jadedpacks.jctweaks.helpers.Parts;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;


public class BloodMagicHelper {

	public static void preInit(){

	}

	public static void init()	{}

	public static void postInit()
	{	if (Loader.isModLoaded("AWWayofTime"))
	{
		addRecipes();
		addAltarRecipe();
		AlchemyRecipe();
	}

	}

	public static void addAltarRecipe	()
	{
		AltarRecipeRegistry.registerAltarRecipe(Parts.spawnSheep, Parts.wool, 2, 5000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(Parts.manabucket, Parts.bucket, 2, 3000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(Parts.spawnMCow, Parts.mycelium, 3, 7000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(Parts.spawnPig, Parts.wool2, 2, 7000, 2, 2, false);
		Main.log.info("Jaded added spawn recipes");
	}

	public static void AlchemyRecipe()
	{
		AlchemyRecipeRegistry.registerRecipe(Parts.spawnChicken, 2, new ItemStack[]{(Parts.flesh),(Parts.flesh), (Parts.diamond), (Parts.feather), (Parts.leather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(Parts.spawnCow, 2, new ItemStack[]{(Parts.leather),(Parts.leather), (Parts.diamond), (Parts.leather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(Parts.hearts, 2, new ItemStack[]{(Parts.flesh),(Parts.flesh), (Parts.bone), (Parts.diamond)}, 2);
		AlchemyRecipeRegistry.registerRecipe(Parts.blazerod, 2, new ItemStack[]{(Parts.blazepowder),(Parts.blazepowder), (Parts.blazepowder), (Parts.blazepowder)}, 2);

		Main.log.info("Jaded made an alchemy lab");
	}

	private static void addRecipes() {
		RecipeRemover.removeAnyRecipe(Parts.knife);
		RecipeRemover.removeAnyRecipe(Parts.altar);

		GameRegistry.addRecipe(new ShapedOreRecipe((Parts.knife),
				"GGG",
				"XFG",
				"FXG",
				'F', Parts.flint,
				'G', "blockGlass"
				));

		GameRegistry.addRecipe(new ShapedOreRecipe((Parts.altar),
				"SXS",
				"SFS",
				"TLT",
				'S', "stone",
				'F', Parts.furnace,
				'T', Parts.searedbrick,
				'L', Parts.flint
				));
		Main.log.info("BloodMagic Tweaks Loaded");
	}
}