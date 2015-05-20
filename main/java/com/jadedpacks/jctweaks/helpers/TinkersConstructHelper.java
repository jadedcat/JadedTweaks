package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.LiquidCasting;
//import tconstruct.library.crafting.DryingRackRecipes.DryingRecipe;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class TinkersConstructHelper {


	public static void preInit(){		}

	public static void init(){
	}
	public static void postInit() {
		if (Loader.isModLoaded("TConstruct"))
		{
			addRecipes();
		}
	}

	private static void addRecipes() {

		Item ticMaterials = GameRegistry.findItem("TConstruct", "material");
		Item ticheartcanister = GameRegistry.findItem("TConstruct", "heartCanister");
		Item apple = GameRegistry.findItem("TConstruct", "diamondapple");
		ItemStack tincanister   = new ItemStack(ticMaterials, 1, 8);
		ItemStack heart  = new ItemStack(ticheartcanister, 1, 0);
		ItemStack heart1  = new ItemStack(ticheartcanister, 1, 1);
		ItemStack heart2  = new ItemStack(ticheartcanister, 1, 2);
		ItemStack heart3  = new ItemStack(ticheartcanister, 1, 3);
		ItemStack heart4  = new ItemStack(ticheartcanister, 1, 4);
		ItemStack heart5  = new ItemStack(ticheartcanister, 1, 5);
		ItemStack heart6  = new ItemStack(ticheartcanister, 1, 6);
		FluidStack emerald = FluidRegistry.getFluidStack("emerald.liquid", 288);
		ItemStack earthelement = GameRegistry.findItemStack("customnpcs", "npcEarthElement", 1);
		ItemStack earthrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 2);
		LiquidCasting tableCasting = TConstructRegistry.instance.getTableCasting();
		tableCasting.addCastingRecipe(earthelement, emerald, earthrune, 80);

		RecipeRemover.removeAnyRecipe(heart2);
		GameRegistry.addRecipe(new ShapedOreRecipe(heart6,
				"EH",
				"CX",

				'E', "gemEmerald",
				'H', heart5,
				'C', heart4
				));

		GameRegistry.addRecipe(new ShapedOreRecipe(heart2,
				"EH",
				"CX",

				'E', "tincanister",
				'H', heart1,
				'C', heart
				));

		GameRegistry.addRecipe(new ShapedOreRecipe(heart4,
				"EH",
				"CX",

				'E', "ingotGold",
				'H', heart3,
				'C', heart2
				));

		FluidStack iron = FluidRegistry.getFluidStack("iron.molten", 288);
		if (iron == null)
			throw new RuntimeException("No Iron fluid");
		FluidStack gold = FluidRegistry.getFluidStack("gold.molten", 720);
		if (gold == null)
			throw new RuntimeException("No gold fluid");
		FluidStack bronze = FluidRegistry.getFluidStack("bronze.molten", 144);
		if (bronze == null)
			throw new RuntimeException("No bronze fluid");
		FluidStack ardite = FluidRegistry.getFluidStack("ardite.molten", 144);
		if (ardite == null)
			throw new RuntimeException("No ardite fluid");

		if (Loader.isModLoaded("harvestcraft"))
		{
			ItemStack raisins = GameRegistry.findItemStack("harvestcraft", "raisinsItem", 1);
			//add listAllfruit to drying rack
		}

		if (Loader.isModLoaded("ExtraUtilities"))
		{
			ItemStack superwand = GameRegistry.findItemStack("ExtraUtilities", "creativebuilderswand", 1);
			if (superwand == null)
				throw new RuntimeException("No superwand");
			ItemStack builderswand = GameRegistry.findItemStack("ExtraUtilities", "builderswand", 1);
			if (builderswand == null)
				throw new RuntimeException("No builderswand ");
			ItemStack spikebase = GameRegistry.findItemStack("ExtraUtilities", "spike_base_wood", 1);
			if (spikebase == null)
				throw new RuntimeException("No wood spike");
			ItemStack spikediamond = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 1);
			if (spikediamond == null)
				throw new RuntimeException("No diamond spike");
			ItemStack spikegold = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 1);
			if (spikegold == null)
				throw new RuntimeException("No goldspike");
			ItemStack spikeiron = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 1);
			if (spikeiron == null)
				throw new RuntimeException("No Iron spike");
			//remove default spike recipes
			RecipeRemover.removeAnyRecipe(spikegold);
			RecipeRemover.removeAnyRecipe(spikediamond);
			RecipeRemover.removeAnyRecipe(spikeiron);
			//add smeltery spike recipes
			tableCasting.addCastingRecipe(superwand, ardite, builderswand, true, 80);
			tableCasting.addCastingRecipe(spikeiron, iron, spikebase, true, 80);
			tableCasting.addCastingRecipe(spikegold, gold, spikeiron, true, 80);
			tableCasting.addCastingRecipe(spikediamond, ardite, spikegold, true, 80);
			Main.log.info("Jaded made spikes need a smeltery");

		}

		if (!Loader.isModLoaded("harvestcraft") && (Loader.isModLoaded("IguanaTweaksTConstruct")))

		{
			ItemStack clayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketFired", 1);
			ItemStack rawclayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketUnfired", 1);
			ItemStack pot = GameRegistry.findItemStack("harvestcraft", "potItem", 1);
			ItemStack saucepan = GameRegistry.findItemStack("harvestcraft", "saucepanItem", 1);
			ItemStack gearCast = GameRegistry.findItemStack("TConstruct", "gearCast", 1);

			if (OreDictionary.getOres("oreAluminum").size() > 0)
			{
				FluidStack aluminumbrass = FluidRegistry.getFluidStack("aluminumbrass.molten", 288);
				FluidStack aluminum = FluidRegistry.getFluidStack("aluminum.molten", 288);
				tableCasting.addCastingRecipe(pot, aluminumbrass, clayBucket, true, 80);
				tableCasting.addCastingRecipe(saucepan, aluminumbrass, rawclayBucket, true, 80);

				if (OreDictionary.getOres("gearWood").size() > 0)
				{
					ItemStack gearWood = new ItemStack (GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1, 40);
					tableCasting.addCastingRecipe(gearCast, aluminumbrass, gearWood, true, 80);
				}
			}

			else if (OreDictionary.getOres("oreAluminium").size() > 0)
			{
				FluidStack aluminumbrass = FluidRegistry.getFluidStack("aluminiumbrass.molten", 288);
				FluidStack aluminum = FluidRegistry.getFluidStack("aluminium.molten", 288);
				tableCasting.addCastingRecipe(pot, aluminumbrass, clayBucket, true, 80);
				tableCasting.addCastingRecipe(saucepan, aluminumbrass, rawclayBucket, true, 80);

				if (OreDictionary.getOres("gearWood").size() > 0)
				{
					ItemStack gearWood = new ItemStack (GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1, 40);
					tableCasting.addCastingRecipe(gearCast, aluminumbrass, gearWood, true, 80);
				}
			}
		}
		Main.log.info("Jaded made harvestcraft tools require a smeltery");
		Main.log.info("JCTinker Tweaks Loaded");
	}
}


