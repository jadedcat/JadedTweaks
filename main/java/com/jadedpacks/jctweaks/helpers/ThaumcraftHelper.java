package com.jadedpacks.jctweaks.helpers;


import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApiHelper;
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
import com.jadedpacks.jctweaks.helpers.Parts;


public class ThaumcraftHelper {
	// not loading into game correctly... not sure why


	public static void preInit(){
	}

	public static void init()
	{
		if (Loader.isModLoaded("Thaumcraft"))
		{
			removeRecipes();
			setupResearch();
			initAspects();
			addAspects();
			addRecipes();
		}
	}

	public static Aspect PURPLE;
	public static void initAspects()
	{
		PURPLE = new Aspect("purpura", 0xB68CFF, new Aspect[]{Aspect.PLANT, Aspect.TREE}, new ResourceLocation("jctweaks", "textures/aspects/purpura.png"),1);

	}

	private static AspectList getAspectList(ItemStack stack){
		AspectList list = ThaumcraftApiHelper.getObjectAspects(stack);
		return list !=null ? list : new AspectList();
	}

	public static void addAspects(){
		AspectList list;

		list = getAspectList(Parts.amethyst);
		list.add(PURPLE, 4);
		ThaumcraftApi.registerObjectTag (Parts.amethyst, list);

		ThaumcraftApi.registerObjectTag("listAllseed", (new AspectList()).add(Aspect.CROP, 4).add(Aspect.HARVEST, 3));



	}

	private static void setupResearch() {

		//Categories

		ResearchCategories.registerCategory("AGRIMANCY", new ResourceLocation("jctweaks", "textures/aspects/purpura.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));

		(new ResearchItem("RECALLSTONE", "AGRIMANCY", (new AspectList()).add(Aspect.MAGIC, 3).add(Aspect.MOTION, 2), 2, 0, 2,
				(Parts.recallStone))).setPages(new ResearchPage[]
						{ new ResearchPage("jctweaks.research_page.RECALLSTONE"), new ResearchPage((IArcaneRecipe)
								ThaumcraftApi.addShapelessArcaneCraftingRecipe("Recall Stone", Parts.recallStone, (new AspectList()).add(Aspect.EARTH, 5).add(Aspect.ORDER, 3), "SES", "EDE", "SES", Character.valueOf('B'), Parts.stone, Character.valueOf('E'), Parts.epearl, Character.valueOf('R'), Parts.diamond)) }).setParents(new String[] { "RESEARCH" }).registerResearchItem();


		(new ResearchItem("DIMENSIONSTONE", "AGRIMANCY", (new AspectList()).add(Aspect.ELDRITCH, 3).add(Aspect.MOTION, 2), 2, -1, 2,
				(Parts.dimensionStone))).setPages(new ResearchPage[]
						{ new ResearchPage("jctweaks.research_page.DIMENSIONSTONE"), new ResearchPage((IArcaneRecipe)
								ThaumcraftApi.addShapelessArcaneCraftingRecipe("Dimension Stone", Parts.dimensionStone, (new AspectList()).add(Aspect.ELDRITCH, 5).add(Aspect.ORDER, 3), "BEB", "ERE", "BEB", Character.valueOf('B'), Parts.blazerod, Character.valueOf('E'), Parts.epearl, Character.valueOf('R'), Parts.recallStone)) }).setParents(new String[] { "RECALLSTONE" }).registerResearchItem();





	}
	private static void removeRecipes() {

		if (Loader.isModLoaded("recallstones"))
		{

			//RecipeRemover.removeAnyRecipe(Parts.recallStone);
			//RecipeRemover.removeAnyRecipe(Parts.dimensionStone);
		}

	}
	private static void addRecipes() {}
	public static void postInit() {


	}
}