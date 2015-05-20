package com.jadedpacks.jctweaks.helpers;


import java.util.ArrayList;
import cpw.mods.fml.common.Loader;

import thaumcraft.api.*;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.ResourceLocation;


public class ThaumcraftHelper {


	public static void preInit(){
	}		
	
	public static void init()
	{
		if (Loader.isModLoaded("ThaumCraft"))
		{
			removeRecipes();
			getComponents();
			addRecipes();
			setupResearch();
		}
	}
	
	
	private static void setupResearch() {
		
		//ArrayList<Object> list;
		//ItemStack input;
		//IRecipe recipe;
		//String category = "AGRIMANCY";
		//ResearchCategories.registerCategory(category, new ResourceLocation("thermalfoundation", "textures/blocks/ore/Ore_Mithril.png"),
				//new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
		
	}
	private static void removeRecipes() {
		
		if (Loader.isModLoaded("recallstones"))
		{
			ItemStack recallStone = GameRegistry.findItemStack("recallstones", "recallStone", 1);
			ItemStack dimensionStone = GameRegistry.findItemStack("recallstones", "dimensionStone", 1);
			
			//RecipeRemover.removeAnyRecipe(recallStone);
			//RecipeRemover.removeAnyRecipe(dimensionStone);
		}
		
	}
	private static void getComponents() {
		
	}
	private static void addRecipes() {
		
		//ThaumcraftApi.addArcaneCraftingRecipe(null, null, null, null);
		
		
		
	}
	public static void postInit() {}
}