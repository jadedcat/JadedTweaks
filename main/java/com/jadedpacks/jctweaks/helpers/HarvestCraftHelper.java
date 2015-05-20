package com.jadedpacks.jctweaks.helpers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import com.jadedpacks.jctweaks.helpers.*;

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
		//clay bucket fresh water
		ItemStack freshwater = GameRegistry.findItemStack("harvestcraft", "freshwaterItem", 4);
		ItemStack claywater = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketWater", 1);			
		GameRegistry.addRecipe(freshwater, new Object[]
				{
				"F", "F", "claywater"
				});
		
		if (Loader.isModLoaded("Botania"))
		{
			ItemStack woodmortar = GameRegistry.findItemStack("Botania", "pestleAndMortar", 1);
		}
		
		GameRegistry.addRecipe(flour, new Object[]
			//Flour from any mortar	
			{
			"MG", "M", "woodmortar", "G", "listAllgrains"			
			});
		GameRegistry.addRecipe(flour, new Object[]
			//Potato Flour	
			{
			"MG", "M", "toolMortarandpestle", "G", "cropPotato"			
			});
		
		if (Loader.isModLoaded("TConstruct"))
		{
			ItemStack pot = GameRegistry.findItemStack("harvestcraft", "potItem", 1);
			ItemStack saucepan = GameRegistry.findItemStack("harvestcraft", "saucepanItem", 1);
			//RecipeRemover.removeAnyRecipe(pot);
			//RecipeRemover.removeAnyRecipe(saucepan);	
			ItemStack raisins = GameRegistry.findItemStack("harvestcraft", "raisinsItem", 1);
		}}}