package com.jadedpacks.jctweaks.helpers;

import com.jadedpacks.jctweaks.Main;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class MFRHelper {


	public static void preInit(){
		
		if (Loader.isModLoaded("MineFactoryReloaded"))
	{ 
		
				
	}
		
	}
	
	public static void init()
	{
		if (Loader.isModLoaded("MineFactoryReloaded"))
		{
			
			addRecipes();
		}
	}
	
	public static void postInit() {
		
	}
	private static void addRecipes() {
		
		Item mfrUpgrade = GameRegistry.findItem("MineFactoryReloaded", "upgrade.radius");
		
		ItemStack upgradeEFlux   = new ItemStack(mfrUpgrade, 1, 6);
		ItemStack upgradeEnder = new ItemStack(mfrUpgrade, 1, 7);
		ItemStack upgradeMany   = new ItemStack(mfrUpgrade, 1, 8);
		ItemStack upgradeThaum   = new ItemStack(mfrUpgrade, 1, 9);
		ItemStack upgradeMSteel   = new ItemStack(mfrUpgrade, 1, 10);
		
		RecipeRemover.removeAnyRecipe(upgradeEFlux);
		RecipeRemover.removeAnyRecipe(upgradeEnder);
		RecipeRemover.removeAnyRecipe(upgradeMany);
		RecipeRemover.removeAnyRecipe(upgradeThaum);
		RecipeRemover.removeAnyRecipe(upgradeMSteel);
		
		GameRegistry.addRecipe(new ShapedOreRecipe((upgradeEFlux), new Object[]
				{
				"FFF", 
				"PPP", 
				"RGR", 
				"F", "ingotElectrumFlux", 
				"P", "dustPlastic",
				"R", "dustRedstone",
				"G", "nuggetGold"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe((upgradeEnder), new Object[]
				{
				"FFF", 
				"PPP", 
				"RGR", 
				"F", "ingotEnderium", 
				"P", "dustPlastic",
				"R", "dustRedstone",
				"G", "nuggetGold"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe((upgradeMany), new Object[]
				{
				"FFF", 
				"PPP", 
				"RGR", 
				"F", "ingotManyullyn", 
				"P", "dustPlastic",
				"R", "dustRedstone",
				"G", "nuggetGold"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe((upgradeThaum), new Object[]
				{
				"FFF", 
				"PPP", 
				"RGR", 
				"F", "ingotThaumium", 
				"P", "dustPlastic",
				"R", "dustRedstone",
				"G", "nuggetGold"
				}));
		GameRegistry.addRecipe(new ShapedOreRecipe((upgradeMSteel), new Object[]
				{
				"FFF", 
				"PPP", 
				"RGR", 
				"F", "ingotManasteel", 
				"P", "dustPlastic",
				"R", "dustRedstone",
				"G", "nuggetGold"
				}));
		Main.log.info("Jaded has changed the MFR upgrade recipes.. for... reasons");
		
	}
	
	
}