package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import WayofTime.alchemicalWizardry.api.alchemy.AlchemyRecipeRegistry;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;


public class BloodMagicHelper {

	public static void preInit(){

	}

	public static void init()	{}

	public static void postInit()
	{	if (Loader.isModLoaded("AWWayofTime"))
	{		addRecipes();
	addAltarRecipe();
	AlchemyRecipe();
	System.out.println("JC Tweaks add BM recipes");
	}

	}

	public static void addAltarRecipe	()
	{
		Item spawn = GameRegistry.findItem("minecraft", "spawn_egg");

		ItemStack spawnSheep   = new ItemStack(spawn, 1, 91);
		ItemStack spawnPig   = new ItemStack(spawn, 1, 90);
		ItemStack spawnMCow   = new ItemStack(spawn, 1, 96);

		ItemStack mycelium = GameRegistry.findItemStack("minecraft", "mycelium", 1);
		ItemStack wool = new ItemStack(GameRegistry.findItem("minecraft", "wool"), 1, 0);
		ItemStack wool2 = new ItemStack(GameRegistry.findItem("minecraft", "wool"), 1, 6);
		ItemStack bucket = new ItemStack(GameRegistry.findItem("minecraft", "bucket"), 1, 0);
		ItemStack manabucket = new ItemStack(GameRegistry.findItem("ThermalFoundation", "bucket"), 1, 5);


		AltarRecipeRegistry.registerAltarRecipe(spawnSheep, wool, 2, 5000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(manabucket, bucket, 2, 3000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(spawnMCow, mycelium, 3, 7000, 2, 2, false);
		AltarRecipeRegistry.registerAltarRecipe(spawnPig, wool2, 2, 7000, 2, 2, false);
	}

	public static void AlchemyRecipe()
	{

		Item spawn = GameRegistry.findItem("minecraft", "spawn_egg");

		ItemStack spawnCow   = new ItemStack(spawn, 1, 92);
		ItemStack spawnChicken   = new ItemStack(spawn, 1, 93);

		ItemStack diamond = GameRegistry.findItemStack("minecraft", "diamond", 1);
		ItemStack feather = GameRegistry.findItemStack("minecraft", "feather", 1);
		ItemStack hearts = new ItemStack(GameRegistry.findItem("HardcoreQuesting", "hearts"), 1, 3);
		ItemStack leather = new ItemStack(GameRegistry.findItem("minecraft", "leather"), 1, 0);
		ItemStack flesh = new ItemStack(GameRegistry.findItem("minecraft", "rotten_flesh"), 1, 0);
		ItemStack bone = new ItemStack(GameRegistry.findItem("minecraft", "bone"), 1, 0);
		ItemStack blazepowder = new ItemStack(GameRegistry.findItem("minecraft", "blaze_powder"), 1, 0);
		ItemStack blazerod = new ItemStack(GameRegistry.findItem("minecraft", "blaze_rod"), 1, 0);
		ItemStack airelement = GameRegistry.findItemStack("customnpcs", "npcAirElement", 1);
		ItemStack earthelement = GameRegistry.findItemStack("customnpcs", "npcEarthElement", 1);
		ItemStack wrathrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 13);
		ItemStack airrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 3);
		ItemStack saphire = GameRegistry.findItemStack("customnpcs", "npcSaphire", 1);
		ItemStack amethyst = GameRegistry.findItemStack("customnpcs", "npcAmethyst", 1);
		ItemStack npcmana = GameRegistry.findItemStack("customnpcs", "npcMana", 1);
		ItemStack bluepetal = GameRegistry.findItemStack("Botania", "petalblue", 1);


		AlchemyRecipeRegistry.registerRecipe(spawnChicken, 2, new ItemStack[]{(flesh),(flesh), (diamond), (feather), (leather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(spawnCow, 2, new ItemStack[]{(leather),(leather), (diamond), (leather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(hearts, 2, new ItemStack[]{(flesh),(flesh), (bone), (diamond)}, 2);
		AlchemyRecipeRegistry.registerRecipe(blazerod, 2, new ItemStack[]{(blazepowder),(blazepowder), (blazepowder), (blazepowder)}, 2);
		AlchemyRecipeRegistry.registerRecipe(airelement, 2, new ItemStack[]{(airrune),(feather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(amethyst, 2, new ItemStack[]{(earthelement),(feather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(npcmana, 2, new ItemStack[]{(airelement),(feather)}, 2);
		AlchemyRecipeRegistry.registerRecipe(saphire, 2, new ItemStack[]{(airelement),(bluepetal)}, 2);

	}



	private static void addRecipes() {

		ItemStack knife = GameRegistry.findItemStack("AWWayofTime", "sacrificialKnife", 1);
		ItemStack flint = GameRegistry.findItemStack("minecraft", "flint", 1);
		ItemStack furnace = GameRegistry.findItemStack("minecraft", "furnace", 1);
		ItemStack altar = GameRegistry.findItemStack("AWWayofTime", "Altar", 1);
		ItemStack searedbrick = new ItemStack(GameRegistry.findItem("TConstruct", "Smeltery"), 1, 2);

		//RecipeRemover.removeAnyRecipe(knife);
		//RecipeRemover.removeAnyRecipe(altar);

		GameRegistry.addRecipe(new ShapedOreRecipe((knife),
				"GGG",
				"XFG",
				"FXG",
				'F', flint,
				'G', "blockGlass"
				));

		GameRegistry.addRecipe(new ShapedOreRecipe((altar),
				"SXS",
				"SFS",
				"TLT",
				'S', "stone",
				'F', furnace,
				'T', searedbrick,
				'L', flint
				));
		Main.log.info("BloodMagic Tweaks Loaded");
	}
}