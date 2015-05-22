package com.jadedpacks.jctweaks.helpers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;


public class Parts {

	// items I use more than once that I don't want to have to re-reference
	public static void preInit(){}
	public static void init()
	{
		getItems();
		getFluids();
	}

	public static void postInit(){}

	public static void getFluids() {

		if (Loader.isModLoaded("TConstruct"))
		{
			tciron = FluidRegistry.getFluidStack("iron.molten", 288);
			tcgold = FluidRegistry.getFluidStack("gold.molten", 720);
			tcbronze = FluidRegistry.getFluidStack("bronze.molten", 144);
			tcardite = FluidRegistry.getFluidStack("ardite.molten", 144);
			tcemerald = FluidRegistry.getFluidStack("emerald.liquid", 288);

			if (OreDictionary.getOres("oreAluminum").size() > 0)
			{
				moltenaluminumbrass = FluidRegistry.getFluidStack("aluminumbrass.molten", 288);
				moltenaluminum = FluidRegistry.getFluidStack("aluminum.molten", 288);
			}
			else if (OreDictionary.getOres("oreAluminium").size() > 0)
			{
				moltenaluminumbrass = FluidRegistry.getFluidStack("aluminiumbrass.molten", 288);
				moltenaluminum = FluidRegistry.getFluidStack("aluminium.molten", 288);
			}
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			temana = FluidRegistry.getFluidStack("mana", 100);
		}



	}
	public static void getItems() {

		Item spawn = GameRegistry.findItem("minecraft", "spawn_egg");
		spawnCow   = new ItemStack(spawn, 1, 92);
		spawnChicken   = new ItemStack(spawn, 1, 93);
		spawnSheep   = new ItemStack(spawn, 1, 91);
		spawnPig   = new ItemStack(spawn, 1, 90);
		spawnMCow   = new ItemStack(spawn, 1, 96);

		diamond = GameRegistry.findItemStack("minecraft", "diamond", 1);
		feather = GameRegistry.findItemStack("minecraft", "feather", 1);
		leather = new ItemStack(GameRegistry.findItem("minecraft", "leather"), 1, 0);
		flesh = new ItemStack(GameRegistry.findItem("minecraft", "rotten_flesh"), 1, 0);
		bone = new ItemStack(GameRegistry.findItem("minecraft", "bone"), 1, 0);
		blazepowder = new ItemStack(GameRegistry.findItem("minecraft", "blaze_powder"), 1, 0);
		blazerod = new ItemStack(GameRegistry.findItem("minecraft", "blaze_rod"), 1, 0);
		mycelium = GameRegistry.findItemStack("minecraft", "mycelium", 1);
		wool = new ItemStack(GameRegistry.findItem("minecraft", "wool"), 1, 0);
		wool2 = new ItemStack(GameRegistry.findItem("minecraft", "wool"), 1, 6);
		bucket = new ItemStack(GameRegistry.findItem("minecraft", "bucket"), 1, 0);
		flint = GameRegistry.findItemStack("minecraft", "flint", 1);
		furnace = GameRegistry.findItemStack("minecraft", "furnace", 1);
		wheat = GameRegistry.findItemStack("minecraft", "wheat", 1);
		epearl = GameRegistry.findItemStack("minecraft", "ender_pearl", 1);
		stone = GameRegistry.findItemStack("minecraft", "stone", 0);
		emerald = GameRegistry.findItemStack("minecraft", "emerald", 0);
		blockDiamond = GameRegistry.findItemStack("minecraft", "diamond_block", 0);
		goldingot = GameRegistry.findItemStack("minecraft", "gold_ingot", 0);
		bed = GameRegistry.findItemStack("minecraft", "bed", 0);
		tnt = GameRegistry.findItemStack("minecraft", "tnt", 0);
		slimeball = GameRegistry.findItemStack("minecraft", "slime_ball", 0);

		if (Loader.isModLoaded("recallstones"))
		{
			recallStone = GameRegistry.findItemStack("recallstones", "recallStone", 1);
			dimensionStone = GameRegistry.findItemStack("recallstones", "dimensionStone", 1);

		}
		if (Loader.isModLoaded("ForbiddenMagic"))
		{
			Item fmShard = GameRegistry.findItem("ForbiddenMagic", "NetherShard");

			wrathShard   = new ItemStack(fmShard, 1, 0);
			envyShard   = new ItemStack(fmShard, 1, 1);
			taintShard   = new ItemStack(fmShard, 1, 2);
			prideShard   = new ItemStack(fmShard, 1, 3);
			lustShard   = new ItemStack(fmShard, 1, 4);
			slothShard   = new ItemStack(fmShard, 1, 5);
			greedShard   = new ItemStack(fmShard, 1, 6);
			gluttonShard = GameRegistry.findItemStack("ForbiddenMagic", "GluttonyShard", 1);
		}

		if (Loader.isModLoaded("MineFactoryReloaded"))
		{
			Item mfrUpgrade = GameRegistry.findItem("MineFactoryReloaded", "upgrade.radius");

			upgradeEFlux   = new ItemStack(mfrUpgrade, 1, 6);
			upgradeEnder = new ItemStack(mfrUpgrade, 1, 7);
			upgradeMany   = new ItemStack(mfrUpgrade, 1, 8);
			upgradeThaum   = new ItemStack(mfrUpgrade, 1, 9);
			upgradeMSteel   = new ItemStack(mfrUpgrade, 1, 10);
		}

		if (Loader.isModLoaded("HardcoreQuesting"))
		{
			hearts = new ItemStack(GameRegistry.findItem("HardcoreQuesting", "hearts"), 1, 3);
		}

		if (Loader.isModLoaded("ExtraUtilities"))
		{
			superwand = GameRegistry.findItemStack("ExtraUtilities", "creativebuilderswand", 1);
			builderswand = GameRegistry.findItemStack("ExtraUtilities", "builderswand", 1);;
			spikebase = GameRegistry.findItemStack("ExtraUtilities", "spike_base_wood", 1);
			spikediamond = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 4);
			spikediamond1 = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 1);
			spikegold = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 4);
			spikegold1 = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 1);
			spikeiron = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 4);
			spikeiron1 = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 1);
			magnumtorch = GameRegistry.findItemStack("ExtraUtilities", "magnumTorch", 1);

		}
		if (Loader.isModLoaded("harvestcraft"))
			//for (ItemStack seeds : OreDictionary.getOres("listAllseeds"))
		{
			raisins = GameRegistry.findItemStack("harvestcraft", "raisinsItem", 1);
			flour = GameRegistry.findItemStack("harvestcraft", "flourItem", 1);
			freshwater = GameRegistry.findItemStack("harvestcraft", "freshwaterItem", 4);
			claywater = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketWater", 1);
			pot = GameRegistry.findItemStack("harvestcraft", "potItem", 1);
			saucepan = GameRegistry.findItemStack("harvestcraft", "saucepanItem", 1);
			beefwellington = GameRegistry.findItemStack("harvestcraft", "beefwellingtonItem", 0);

		}

		if (Loader.isModLoaded("Botania"))
		{
			earthrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 2);
			woodmortar = new ItemStack (GameRegistry.findItem("Botania", "pestleAndMortar"), 1, 0);
			firerune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 1);
			waterrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 0);
			wrathrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 13);
			bluepetal = GameRegistry.findItemStack("Botania", "petalblue", 1);
			airrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 3);

		}
		if (Loader.isModLoaded("TConstruct"))
		{
			Item ticMaterials = GameRegistry.findItem("TConstruct", "material");
			Item ticheartcanister = GameRegistry.findItem("TConstruct", "heartCanister");
			dapple = GameRegistry.findItemStack("TConstruct", "diamondapple", 1);
			tincanister   = new ItemStack(ticMaterials, 1, 8);
			heart  = new ItemStack(ticheartcanister, 1, 0);
			heart1  = new ItemStack(ticheartcanister, 1, 1);
			heart2  = new ItemStack(ticheartcanister, 1, 2);
			heart3  = new ItemStack(ticheartcanister, 1, 3);
			heart4  = new ItemStack(ticheartcanister, 1, 4);
			heart5  = new ItemStack(ticheartcanister, 1, 5);
			heart6  = new ItemStack(ticheartcanister, 1, 6);
			gearCast = GameRegistry.findItemStack("TConstruct", "gearCast", 1);
			searedbrick = new ItemStack(GameRegistry.findItem("TConstruct", "Smeltery"), 1, 2);
			necrotic = new ItemStack(GameRegistry.findItem("TConstruct", "materials"), 1, 8);
		}
		if (Loader.isModLoaded("IguanaTweaksTConstruct"))
		{
			clayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketFired", 1);
			rawclayBucket = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketUnfired", 1);
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			Item teMaterial = GameRegistry.findItem("ThermalFoundation", "material");
			if (teMaterial == null)
				throw new RuntimeException("HOLY SHIT SOMETHING IS WRONG WHERE IS TF!?!?!?!");

			gearCopper   = new ItemStack(teMaterial, 1, 128);
			gearIron     = new ItemStack(teMaterial, 1, 12);
			gearTin      = new ItemStack(teMaterial, 1, 129);
			gearGold     = new ItemStack(teMaterial, 1, 13);
			gearSilver   = new ItemStack(teMaterial, 1, 130);
			gearBronze   = new ItemStack(teMaterial, 1, 137);
			gearNickel   = new ItemStack(teMaterial, 1, 132);
			gearPlatinum = new ItemStack(teMaterial, 1, 133);
			gearMithril  = new ItemStack(teMaterial, 1, 134);
			gearElectrum = new ItemStack(teMaterial, 1, 135);
			gearInvar    = new ItemStack(teMaterial, 1, 136);
			gearSignalum = new ItemStack(teMaterial, 1, 138);
			gearLumium   = new ItemStack(teMaterial, 1, 139);
			gearEnderium = new ItemStack(teMaterial, 1, 140);
			platinumIngot = new ItemStack(teMaterial,2, 69);

			Item teOre = GameRegistry.findItem("ThermalFoundation", "Ore");

			mithrilOre  = new ItemStack(teOre, 1, 6);
			tfOre  = new ItemStack(teOre, 1, 5); //platinum
			tinOre  = new ItemStack(teOre, 1, 1);
			silverOre  = new ItemStack(teOre, 1, 2);

			richslag = new ItemStack(GameRegistry.findItem("ThermalExpansion", "material"), 1, 515);
			manabucket = new ItemStack(GameRegistry.findItem("ThermalFoundation", "bucket"), 1, 5);
			dynamo = new ItemStack(GameRegistry.findItem("ThermalExpansion", "Dynamo"), 1, 0);
			OreDictionary.registerOre("dynamo", Parts.dynamo);

		}
		if (Loader.isModLoaded("SolarFlux"))
		{
			mirror = GameRegistry.findItemStack("SolarFlux", "mirror", 2);
		}

		if (Loader.isModLoaded("Thaumcraft"))
		{
			Item tcOre = GameRegistry.findItem("Thaumcraft", "blockCustomOre");

			airOre   = new ItemStack(tcOre, 1, 1);
			fireOre   = new ItemStack(tcOre, 1, 2);
			waterOre   = new ItemStack(tcOre, 1, 3);
			earthOre   = new ItemStack(tcOre, 1, 4);
			orderOre   = new ItemStack(tcOre, 1, 5);
			chaosOre   = new ItemStack(tcOre, 1, 6);
		}

		if (Loader.isModLoaded("Forestry"))
		{
			copperBlock = new ItemStack (GameRegistry.findItem("Forestry", "resourceStorage"), 1, 1);
			tinBlock = new ItemStack (GameRegistry.findItem("Forestry", "resourceStorage"), 1, 2);
		}

		if (Loader.isModLoaded("exnihilo"))
		{
			platDust = new ItemStack(GameRegistry.findItem("exnihilo", "platinum_dust"), 1, 2);
		}
		if (Loader.isModLoaded("customnpcs"))
		{
			fireelement = GameRegistry.findItemStack("customnpcs", "npcFireElement", 1);
			waterelement = GameRegistry.findItemStack("customnpcs", "npcWaterElement", 1);
			bloodblock = GameRegistry.findItemStack("customnpcs", "npcBloodBlock", 1);
			demoningot = GameRegistry.findItemStack("customnpcs", "npcDemonicIngot", 1);
			airelement = GameRegistry.findItemStack("customnpcs", "npcAirElement", 1);
			saphire = GameRegistry.findItemStack("customnpcs", "npcSaphire", 1);
			amethyst = GameRegistry.findItemStack("customnpcs", "npcAmethyst", 1);
			npcmana = GameRegistry.findItemStack("customnpcs", "npcMana", 1);
			earthelement = GameRegistry.findItemStack("customnpcs", "npcEarthElement", 1);
			ruby = GameRegistry.findItemStack("customnpcs", "npcRuby", 1);
			goldcoin = GameRegistry.findItemStack("customnpcs", "npcCoinGold", 1);
			artifact = GameRegistry.findItemStack("customnpcs", "npcArtifact", 1);
			ocarina = GameRegistry.findItemStack("customnpcs", "npcOcarina", 1);

		}
		if (Loader.isModLoaded("AWWayofTime"))
		{
			knife = GameRegistry.findItemStack("AWWayofTime", "sacrificialKnife", 1);
			altar = GameRegistry.findItemStack("AWWayofTime", "Altar", 1);


		}
	}
	//-------Test------------
	public static ItemStack dynamo;
	//---------Recall Stones--------
	public static ItemStack recallStone;
	public static ItemStack dimensionStone;
	//----------ForbiddenMagic--------
	public static ItemStack wrathShard;
	public static ItemStack envyShard;
	public static ItemStack taintShard;
	public static ItemStack prideShard;
	public static ItemStack lustShard;
	public static ItemStack slothShard;
	public static ItemStack greedShard;
	public static ItemStack gluttonShard;
	//------Thaumcraft-------------
	public static ItemStack airOre;
	public static ItemStack fireOre;
	public static ItemStack waterOre;
	public static ItemStack earthOre;
	public static ItemStack orderOre;
	public static ItemStack chaosOre;
	//------------MFR-----------
	public static ItemStack upgradeEFlux;
	public static ItemStack upgradeEnder;
	public static ItemStack upgradeMany;
	public static ItemStack upgradeThaum;
	public static ItemStack upgradeMSteel;
	//--------Vanilla---------------
	public static ItemStack spawnCow;
	public static ItemStack spawnChicken;
	public static ItemStack spawnSheep;
	public static ItemStack spawnPig;
	public static ItemStack spawnMCow;
	public static ItemStack diamond;
	public static ItemStack feather;
	public static ItemStack leather;
	public static ItemStack flesh;
	public static ItemStack bone;
	public static ItemStack blazepowder;
	public static ItemStack blazerod;
	public static ItemStack mycelium;
	public static ItemStack wool;
	public static ItemStack wool2;
	public static ItemStack bucket;
	public static ItemStack hearts;
	public static ItemStack wheat;
	public static ItemStack epearl;
	public static ItemStack stone;
	public static ItemStack goldingot;
	public static ItemStack emerald;
	public static ItemStack blockDiamond;
	public static ItemStack bed;
	public static ItemStack tnt;
	public static ItemStack slimeball;
	//----------BloodMagic---------
	public static ItemStack knife;
	public static ItemStack flint;
	public static ItemStack furnace;
	public static ItemStack altar;
	public static ItemStack searedbrick;
	//-----------CustomNPCs---------
	public static ItemStack fireelement;
	public static ItemStack waterelement;
	public static ItemStack bloodblock;
	public static ItemStack demoningot;
	public static ItemStack earthelement;
	public static ItemStack airelement;
	public static ItemStack wrathrune;
	public static ItemStack airrune;
	public static ItemStack saphire;
	public static ItemStack amethyst;
	public static ItemStack npcmana;
	public static ItemStack bluepetal;
	public static ItemStack waterrune;
	public static ItemStack firerune;
	public static ItemStack earthrune;
	public static ItemStack woodmortar;
	public static ItemStack ruby;
	public static ItemStack goldcoin;
	public static ItemStack artifact;
	public static ItemStack ocarina;
	//---------ThermalExpansion----------
	public static ItemStack mithrilOre;
	public static ItemStack platDust;
	public static ItemStack tfOre;
	public static ItemStack silverOre;
	public static ItemStack richslag;
	public static ItemStack platinumIngot;
	public static ItemStack gearCopper;
	public static ItemStack gearIron;
	public static ItemStack gearTin;
	public static ItemStack gearGold;
	public static ItemStack gearSilver;
	public static ItemStack gearBronze;
	public static ItemStack gearNickel;
	public static ItemStack gearPlatinum;
	public static ItemStack gearMithril;
	public static ItemStack gearElectrum;
	public static ItemStack gearInvar;
	public static ItemStack gearSignalum;
	public static ItemStack gearLumium;
	public static ItemStack gearEnderium;
	public static ItemStack mirror;
	public static ItemStack manabucket;
	public static ItemStack tinOre;
	//------------Forestry---------
	public static ItemStack copperBlock;
	public static ItemStack tinBlock;
	//--------TTweaks------
	public static ItemStack clayBucket;
	public static ItemStack rawclayBucket;
	//----------HarvestCraft-------
	public static ItemStack pot;
	public static ItemStack saucepan;
	public static ItemStack raisins;
	public static ItemStack flour;
	public static ItemStack freshwater;
	public static ItemStack claywater;
	public static ItemStack beefwellington;
	//-------TiCOn---------------
	public static ItemStack heart;
	public static ItemStack heart1;
	public static ItemStack heart2;
	public static ItemStack heart3;
	public static ItemStack heart4;
	public static ItemStack heart5;
	public static ItemStack heart6;
	public static ItemStack tincanister;
	public static ItemStack dapple;
	public static ItemStack gearCast;
	public static ItemStack necrotic;
	//----------ExU Items------
	public static ItemStack superwand;
	public static ItemStack builderswand;
	public static ItemStack spikebase;
	public static ItemStack spikediamond;
	public static ItemStack spikediamond1;
	public static ItemStack spikegold;
	public static ItemStack spikegold1;
	public static ItemStack spikeiron;
	public static ItemStack spikeiron1;
	public static ItemStack magnumtorch;
	//----------Fluids -------------
	public static FluidStack moltenaluminum;
	public static FluidStack moltenaluminumbrass;
	public static FluidStack tciron;
	public static FluidStack tcgold;
	public static FluidStack tcardite;
	public static FluidStack tcbronze;
	public static FluidStack tcemerald;
	public static FluidStack temana;

}


