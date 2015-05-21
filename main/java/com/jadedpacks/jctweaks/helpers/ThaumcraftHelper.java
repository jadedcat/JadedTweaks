package com.jadedpacks.jctweaks.helpers;


import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
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
import net.minecraftforge.oredict.OreDictionary;


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

			//RecipeRemover.removeAnyRecipe(Parts.recallStone);
			//RecipeRemover.removeAnyRecipe(Parts.dimensionStone);
		}

	}
	private static void getComponents() {

	}
	private static void addRecipes() {

		//ThaumcraftApi.addArcaneCraftingRecipe(null, null, null, null);
		//for (ItemStack seeds : OreDictionary.getOres("listAllSeeds"){ Aspects.add(seeds, ...) }



	}
	public static void postInit() {
		//Aspect purple = new Aspect("purpura", 0xB68CFF, new Aspect[] { Aspect.BEAST, Aspect.SENSES },
		//new ResourceLocation("jctweaks", "textures/aspects/purpura.png"), 1);

	}
}