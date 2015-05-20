package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
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
		FluidStack emerald = FluidRegistry.getFluidStack("emerald", 288);
		ItemStack earthelement = GameRegistry.findItemStack("customnpcs", "npcEarthElement", 1);
		ItemStack earthrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 2);
		LiquidCasting tableCasting = TConstructRegistry.instance.getTableCasting();
		tableCasting.addCastingRecipe(earthelement, (emerald), earthrune, 80);

		RecipeRemover.removeAnyRecipe(heart2);
		GameRegistry.addRecipe(new ShapelessOreRecipe((heart6),
				"EH",
				"CX",

				'E', "gemEmerald",
				'H', heart5,
				'C', heart4
				));

		GameRegistry.addRecipe(new ShapelessOreRecipe((heart2),
				"EH",
				"CX",

				'E', "tincanister",
				'H', heart1,
				'C', heart
				));

		GameRegistry.addRecipe(new ShapelessOreRecipe((heart4),
				"EH",
				"CX",

				'E', "ingotGold",
				'H', heart3,
				'C', heart2
				));

		FluidStack iron = FluidRegistry.getFluidStack("iron", 288);
		FluidStack gold = FluidRegistry.getFluidStack("gold", 720);
		FluidStack bronze = FluidRegistry.getFluidStack("bronze", 144);
		FluidStack platinum = FluidRegistry.getFluidStack("platinum", 288);

		if (Loader.isModLoaded("harvestcraft"))
		{
			ItemStack raisins = GameRegistry.findItemStack("harvestcraft", "raisinsItem", 1);
			//add listAllfruit to drying rack
		}

		if (Loader.isModLoaded("ExtraUtilities"))
		{
			ItemStack superwand = GameRegistry.findItemStack("ExtraUtilities", "creativebuilderswand", 1);
			ItemStack builderswand = GameRegistry.findItemStack("ExtraUtilities", "builderswand", 1);
			ItemStack spikebase = GameRegistry.findItemStack("ExtraUtilities", "spike_base_wood", 1);
			ItemStack spikediamond = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 1);
			ItemStack spikegold = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 1);
			ItemStack spikeiron = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 1);
			//remove default spike recipes
			RecipeRemover.removeAnyRecipe(spikegold);
			RecipeRemover.removeAnyRecipe(spikediamond);
			RecipeRemover.removeAnyRecipe(spikeiron);
			//add smeltery spike recipes
			tableCasting.addCastingRecipe(superwand, (platinum), builderswand, 80);
			tableCasting.addCastingRecipe(spikeiron, (iron), spikebase, 80);
			tableCasting.addCastingRecipe(spikegold, (gold), spikeiron, 80);
			tableCasting.addCastingRecipe(spikediamond, (platinum), spikegold, 80);
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
				FluidStack aluminumbrass = FluidRegistry.getFluidStack("aluminumbrass", 288);
				FluidStack aluminum = FluidRegistry.getFluidStack("aluminum", 288);
				tableCasting.addCastingRecipe(pot, (aluminumbrass), clayBucket, 80);
				tableCasting.addCastingRecipe(saucepan, (aluminumbrass), rawclayBucket, 80);

				if (OreDictionary.getOres("gearWood").size() > 0)
				{
					ItemStack gearWood = new ItemStack (GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1, 40);
					tableCasting.addCastingRecipe(gearCast, (aluminumbrass), gearWood, 80);
				}
			}
		}
		else if (OreDictionary.getOres("oreAluminium").size() > 0)
		{

			ItemStack clayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketFired", 1);
			ItemStack rawclayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketUnfired", 1);
			ItemStack pot = GameRegistry.findItemStack("harvestcraft", "potItem", 1);
			ItemStack saucepan = GameRegistry.findItemStack("harvestcraft", "saucepanItem", 1);
			ItemStack gearCast = GameRegistry.findItemStack("TConstruct", "gearCast", 1);
			FluidStack aluminumbrass = FluidRegistry.getFluidStack("aluminiumbrass", 288);
			FluidStack aluminum = FluidRegistry.getFluidStack("aluminium", 288);
			tableCasting.addCastingRecipe(pot, (aluminumbrass), clayBucket, 80);
			tableCasting.addCastingRecipe(saucepan, (aluminumbrass), rawclayBucket, 80);

			if (OreDictionary.getOres("gearWood").size() > 0)
			{
				ItemStack gearWood = new ItemStack (GameRegistry.findItem("appliedenergistics2", "item.ItemMultiMaterial"), 1, 40);
				tableCasting.addCastingRecipe(gearCast, (aluminumbrass), gearWood, 80);
			}
		}
		Main.log.info("Jaded made harvestcraft tools require a smeltery");
	}
}


