package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class MFRHelper {


	public static void preInit(){}

	public static void init()
	{
		if (Loader.isModLoaded("MineFactoryReloaded"))
		{

			addRecipes();
		}
	}

	public static void postInit() {}

	private static void addRecipes() {
		RecipeRemover.removeAnyRecipe(Parts.upgradeThaum);
		RecipeRemover.removeAnyRecipe(Parts.upgradeMSteel);


		if (Loader.isModLoaded("RedstoneArsenal"))
		{
			RecipeRemover.removeAnyRecipe(Parts.upgradeEFlux);
			GameRegistry.addRecipe(new ShapedOreRecipe((Parts.upgradeEFlux),
					"FFF",
					"PPP",
					"RGR",
					'F', "ingotElectrumFlux",
					'P', "dustPlastic",
					'R', "dustRedstone",
					'G', "nuggetGold"
					));
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			RecipeRemover.removeAnyRecipe(Parts.upgradeEnder);
			GameRegistry.addRecipe(new ShapedOreRecipe((Parts.upgradeEnder),
					"FFF",
					"PPP",
					"RGR",
					'F', "ingotEnderium",
					'P', "dustPlastic",
					'R', "dustRedstone",
					'G', "nuggetGold"
					));
		}
		if (Loader.isModLoaded("TConstruct"))
		{
			RecipeRemover.removeAnyRecipe(Parts.upgradeMany);
			GameRegistry.addRecipe(new ShapedOreRecipe((Parts.upgradeMany),
					"FFF",
					"PPP",
					"RGR",
					'F', "ingotManyullyn",
					'P', "dustPlastic",
					'R', "dustRedstone",
					'G', "nuggetGold"
					));
		}
		if (Loader.isModLoaded("Thaumcraft"))
		{
			RecipeRemover.removeAnyRecipe(Parts.upgradeThaum);
			GameRegistry.addRecipe(new ShapedOreRecipe((Parts.upgradeThaum),
					"FFF",
					"PPP",
					"RGR",
					'F', "ingotThaumium",
					'P', "dustPlastic",
					'R', "dustRedstone",
					'G', "nuggetGold"
					));
		}
		if (Loader.isModLoaded("Botania"))
		{

			RecipeRemover.removeAnyRecipe(Parts.upgradeMSteel);
			GameRegistry.addRecipe(new ShapedOreRecipe((Parts.upgradeMSteel),
					"FFF",
					"PPP",
					"RGR",
					'F', "ingotManasteel",
					'P', "dustPlastic",
					'R', "dustRedstone",
					'G', "nuggetGold"
					));
		}
		Main.log.info("Jaded has changed the MFR upgrade recipes.. for... reasons");
		Main.log.info("MFR Tweaks Loaded");

	}


}