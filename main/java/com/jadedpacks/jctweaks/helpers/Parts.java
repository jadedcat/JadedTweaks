package com.jadedpacks.jctweaks.helpers;

import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ItemStackHolder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;


public class Parts {

	//spawn eggs
	@ItemStackHolder(value="minecraft:spawn_egg", meta=92)
	public static final ItemStack spawnCow = null;

	@ItemStackHolder(value="minecraft:spawn_egg", meta=93)
	public static final ItemStack spawnChicken = null;

	@ItemStackHolder(value="minecraft:spawn_egg", meta=91)
	public static final ItemStack spawnSheep = null;

	@ItemStackHolder(value="minecraft:spawn_egg", meta=90)
	public static final ItemStack spawnPig = null;

	@ItemStackHolder(value="minecraft:spawn_egg", meta=96)
	public static final ItemStack spawnMCow = null;

	//vanilla materials

	@ItemStackHolder(value="minecraft:diamond")
	public static final ItemStack diamond = null;

	@ItemStackHolder(value="minecraft:feather")
	public static final ItemStack feather = null;

	@ItemStackHolder(value="minecraft:leather")
	public static final ItemStack leather = null;

	@ItemStackHolder(value="minecraft:rotten_flesh")
	public static final ItemStack flesh = null;

	@ItemStackHolder(value="minecraft:bone")
	public static final ItemStack bone = null;

	@ItemStackHolder(value="minecraft:blaze_powder")
	public static final ItemStack blazepowder = null;

	@ItemStackHolder(value="minecraft:blaze_rod")
	public static final ItemStack blazerod = null;

	@ItemStackHolder(value="minecraft:mycelium")
	public static final ItemStack mycelium = null;

	@ItemStackHolder(value="minecraft:wool", meta=0)
	public static final ItemStack wool = null;

	@ItemStackHolder(value="minecraft:wool", meta=6)
	public static final ItemStack wool2 = null;

	@ItemStackHolder(value="minecraft:bucket", meta=0)
	public static final ItemStack bucket = null;

	@ItemStackHolder(value="minecraft:flint")
	public static final ItemStack flint = null;

	@ItemStackHolder(value="minecraft:furnace")
	public static final ItemStack furnace = null;

	@ItemStackHolder(value="minecraft:wheat")
	public static final ItemStack wheat = null;

	@ItemStackHolder(value="minecraft:ender_pearl")
	public static final ItemStack epearl = null;

	@ItemStackHolder(value="minecraft:stone", meta=0)
	public static final ItemStack stone = null;

	@ItemStackHolder(value="minecraft:emerald")
	public static final ItemStack emerald = null;

	@ItemStackHolder(value="minecraft:diamond_block")
	public static final ItemStack blockDiamond = null;

	@ItemStackHolder(value="minecraft:gold_ingot")
	public static final ItemStack goldingot = null;

	@ItemStackHolder(value="minecraft:bed", meta=0)
	public static final ItemStack bed = null;

	@ItemStackHolder(value="minecraft:tnt", meta=0)
	public static final ItemStack tnt = null;

	@ItemStackHolder(value="minecraft:slime_ball", meta=0)
	public static final ItemStack slimeball = null;


	@ItemStackHolder(value="minecraft:water_bucket")
	public static final ItemStack bucketwater = null;

	@ItemStackHolder(value="minecraft:stone_slab", meta=3)
	public static final ItemStack cobbleslab = null;


	@ItemStackHolder(value="minecraft:dirt", meta=2)
	public static final ItemStack podzolitem = null;

	@ItemStackHolder(value="minecraft:piston")
	public static final ItemStack piston = null;

	//recall stones items

	@ItemStackHolder(value="recallstones:recallStone")
	public static final ItemStack recallStone = null;

	@ItemStackHolder(value="recallstones:dimensionStone")
	public static final ItemStack dimensionStone = null;

	//Forbidden Magic Items

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=0)
	public static final ItemStack wrathShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=1)
	public static final ItemStack envyShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=2)
	public static final ItemStack taintShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=3)
	public static final ItemStack prideShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=4)
	public static final ItemStack lustShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=5)
	public static final ItemStack slothShard = null;

	@ItemStackHolder(value="ForbiddenMagic:NetherShard", meta=6)
	public static final ItemStack greedShard = null;

	@ItemStackHolder(value="ForbiddenMagic:GluttonyShard", meta=0)
	public static final ItemStack gluttonShard = null;

	//MFR items

	@ItemStackHolder(value="MineFactoryReloaded:upgrade.radius", meta=6)
	public static final ItemStack upgradeEFlux = null;

	@ItemStackHolder(value="MineFactoryReloaded:upgrade.radius", meta=7)
	public static final ItemStack upgradeEnder = null;

	@ItemStackHolder(value="MineFactoryReloaded:upgrade.radius", meta=8)
	public static final ItemStack upgradeMany = null;

	@ItemStackHolder(value="MineFactoryReloaded:upgrade.radius", meta=9)
	public static final ItemStack upgradeThaum = null;

	@ItemStackHolder(value="MineFactoryReloaded:upgrade.radius", meta=10)
	public static final ItemStack upgradeMSteel = null;

	//AE2 Items
	@ItemStackHolder(value="appliedenergistics2:item.ItemBasicStorageCell.1k")
	public static final ItemStack k = null;

	@ItemStackHolder(value="thaumicenergistics:storage.essentia")
	public static final ItemStack kessentia = null;

	@ItemStackHolder(value="appliedenergistics2:item.ItemMultiMaterial", meta= 13)
	public static final ItemStack press1 = null;

	@ItemStackHolder(value="appliedenergistics2:item.ItemMultiMaterial", meta= 14)
	public static final ItemStack press2 = null;

	@ItemStackHolder(value="appliedenergistics2:item.ItemMultiMaterial", meta= 15)
	public static final ItemStack press3 = null;

	@ItemStackHolder(value="appliedenergistics2:item.ItemMultiMaterial", meta= 19)
	public static final ItemStack press4 = null;

	//Thaumic Energistics Items

	@ItemStackHolder(value="thaumicenergistics:thaumicenergistics.block.arcane.assembler")
	public static final ItemStack arcaneassemble = null;

	//hqm items

	@ItemStackHolder(value="HardcoreQuesting:hearts", meta= 3)
	public static final ItemStack hearts = null;

	//ExU Items

	@ItemStackHolder(value="ExtraUtilities:creativebuilderswand")
	public static final ItemStack superwand = null;

	@ItemStackHolder(value="ExtraUtilities:builderswand")
	public static final ItemStack builderswand = null;

	@ItemStackHolder(value="ExtraUtilities:spike_base_wood")
	public static final ItemStack spikebase = null;

	@ItemStackHolder(value="ExtraUtilities:spike_base_diamond")
	public static final ItemStack spikediamond1 = null;

	@ItemStackHolder(value="ExtraUtilities:spike_base_gold")
	public static final ItemStack spikegold1 = null;

	@ItemStackHolder(value="ExtraUtilities:spike_base")
	public static final ItemStack spikeiron1 = null;

	@ItemStackHolder(value="ExtraUtilities:magnumTorch")
	public static final ItemStack magnumtorch = null;

	//Harvestcraft items

	@ItemStackHolder(value="harvestcraft:raisinsItem")
	public static final ItemStack raisins = null;

	@ItemStackHolder(value="harvestcraft:freshwaterItem")
	public static final ItemStack fwater = null;

	@ItemStackHolder(value="IguanaTweaksTConstruct:clayBucketWater")
	public static final ItemStack claywater = null;

	@ItemStackHolder(value="harvestcraft:potItem")
	public static final ItemStack pot = null;

	@ItemStackHolder(value="harvestcraft:saucepanItem")
	public static final ItemStack saucepan = null;

	@ItemStackHolder(value="harvestcraft:beefwellingtonItem")
	public static final ItemStack beefwellington = null;

	@ItemStackHolder(value="harvestcraft:grapeItem")
	public static final ItemStack grapes = null;

	@ItemStackHolder(value="harvestcraft:flourItem")
	public static final ItemStack flour = null;
	//Botania Items

	@ItemStackHolder(value="Botania:rune", meta=2)
	public static final ItemStack earthrune = null;

	@ItemStackHolder(value="Botania:pestleAndMortar", meta=0)
	public static final ItemStack woodmortar = null;

	@ItemStackHolder(value="Botania:rune", meta=1)
	public static final ItemStack firerune = null;

	@ItemStackHolder(value="Botania:rune", meta=0)
	public static final ItemStack waterrune = null;

	@ItemStackHolder(value="Botania:rune", meta=13)
	public static final ItemStack wrathrune = null;

	@ItemStackHolder(value="Botania:petal", meta=11)
	public static final ItemStack bluepetal = null;

	@ItemStackHolder(value="Botania:rune", meta=3)
	public static final ItemStack airrune = null;

	//TCon Items

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 10)
	public static final ItemStack stencil1 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 11)
	public static final ItemStack stencil2 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 12)
	public static final ItemStack stencil3 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 13)
	public static final ItemStack stencil4 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 0)
	public static final ItemStack toolstation = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 1)
	public static final ItemStack partbuilder = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 2)
	public static final ItemStack partbuilder2 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 3)
	public static final ItemStack partbuilder3 = null;

	@ItemStackHolder(value="TConstruct:ToolStationBlock", meta= 4)
	public static final ItemStack partbuilder4 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 0)
	public static final ItemStack tincanister = null;

	@ItemStackHolder(value="TConstruct:diamondapple", meta= 0)
	public static final ItemStack dapple = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 0)
	public static final ItemStack heart = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 1)
	public static final ItemStack heart1 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 2)
	public static final ItemStack heart2 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 3)
	public static final ItemStack heart3 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 4)
	public static final ItemStack heart4 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 5)
	public static final ItemStack heart5 = null;

	@ItemStackHolder(value="TConstruct:heartCanister", meta= 6)
	public static final ItemStack heart6 = null;

	@ItemStackHolder(value="TConstruct:gearCast", meta= 0)
	public static final ItemStack gearCast = null;

	@ItemStackHolder(value="TConstruct:Smeltery", meta= 2)
	public static final ItemStack searedbrick = null;

	@ItemStackHolder(value="TConstruct:materials", meta= 8)
	public static final ItemStack necrotic = null;

	//ITT Items

	@ItemStackHolder(value="IguanaTweaksTConstruct:clayBucketFired", meta= 0)
	public static final ItemStack clayBucket = null;

	@ItemStackHolder(value="IguanaTweaksTConstruct:clayBucketUnfired", meta= 0)
	public static final ItemStack rawclayBucket = null;

	//CoFH Items

	@ItemStackHolder(value="ThermalFoundation:material", meta= 128)
	public static final ItemStack gearCopper = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 12)
	public static final ItemStack gearIron = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 129)
	public static final ItemStack gearTin = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 13)
	public static final ItemStack gearGold = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 130)
	public static final ItemStack gearSilver = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 137)
	public static final ItemStack gearBronze = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 132)
	public static final ItemStack gearNickel = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 133)
	public static final ItemStack gearPlatinum = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 134)
	public static final ItemStack gearMithril = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 135)
	public static final ItemStack gearElectrum = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 136)
	public static final ItemStack gearInvar = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 138)
	public static final ItemStack gearSignalum = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 139)
	public static final ItemStack gearLumium = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 140)
	public static final ItemStack gearEnderium = null;

	@ItemStackHolder(value="ThermalFoundation:material", meta= 69)
	public static final ItemStack platinumIngot = null;

	@ItemStackHolder(value="ThermalFoundation:tool.swordSilver", meta= 0)
	public static final ItemStack silversword2 = null;

	@ItemStackHolder(value="ThermalFoundation:Ore", meta= 6)
	public static final ItemStack mithrilOre = null;

	@ItemStackHolder(value="ThermalFoundation:Ore", meta= 5)
	public static final ItemStack platinumOre = null;

	@ItemStackHolder(value="ThermalFoundation:Ore", meta= 1)
	public static final ItemStack tinOre = null;

	@ItemStackHolder(value="ThermalFoundation:Ore", meta= 2)
	public static final ItemStack silverOre = null;

	@ItemStackHolder(value="ThermalExpansion:material", meta= 515)
	public static final ItemStack richslag = null;

	@ItemStackHolder(value="ThermalFoundation:bucket", meta= 5)
	public static final ItemStack manabucket = null;

	@ItemStackHolder(value="ThermalExpansion:Dynamo", meta= 0)
	public static final ItemStack dynamo = null;

	@ItemStackHolder(value="ThermalExpansion:Machine", meta= 8)
	public static final ItemStack watergen = null;

	//SolarFlux Items

	@ItemStackHolder(value="SolarFlux:mirror", meta= 0)
	public static final ItemStack mirror2 = null;

	//Thaumcraft Items

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 1)
	public static final ItemStack airOre = null;

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 2)
	public static final ItemStack fireOre = null;

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 3)
	public static final ItemStack waterOre = null;

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 4)
	public static final ItemStack earthOre = null;

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 5)
	public static final ItemStack orderOre = null;

	@ItemStackHolder(value="Thaumcraft:blockCustomOre", meta= 6)
	public static final ItemStack chaosOre = null;

	//MoCreatures Items

	@ItemStackHolder(value="MoCreatures:silversword", meta= 0)
	public static final ItemStack silversword1 = null;

	//Forestry Items

	@ItemStackHolder(value="Forestry:resourceStorage", meta= 1)
	public static final ItemStack copperBlock = null;

	@ItemStackHolder(value="Forestry:resourceStorage", meta= 2)
	public static final ItemStack tinBlock = null;

	@ItemStackHolder(value="Forestry:chipsets", meta= 0)
	public static final ItemStack basicchip = null;

	//exnihilo items

	@ItemStackHolder(value="exnihilo:barrel", meta= 0)
	public static final ItemStack barrel0 = null;

	@ItemStackHolder(value="exnihilo:barrel", meta= 1)
	public static final ItemStack barrel1 = null;

	@ItemStackHolder(value="exnihilo:barrel", meta= 2)
	public static final ItemStack barrel2 = null;

	@ItemStackHolder(value="exnihilo:barrel", meta= 3)
	public static final ItemStack barrel3 = null;

	@ItemStackHolder(value="exnihilo:barrel", meta= 4)
	public static final ItemStack barrel4 = null;

	@ItemStackHolder(value="exnihilo:barrel", meta= 5)
	public static final ItemStack barrel5 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 0)
	public static final ItemStack sieve0 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 1)
	public static final ItemStack sieve1 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 2)
	public static final ItemStack sieve2 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 3)
	public static final ItemStack sieve3 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 4)
	public static final ItemStack sieve4 = null;

	@ItemStackHolder(value="exnihilo:sifting_table", meta= 5)
	public static final ItemStack sieve5 = null;

	@ItemStackHolder(value="exnihilo:platinum_dust")
	public static final ItemStack platDust = null;

	//Natura Items

	@ItemStackHolder(value="Natura:GrassBlock", meta= 0)
	public static final ItemStack topiary = null;

	//CustomNPCs Items

	@ItemStackHolder(value="customnpcs:npcFireElement", meta= 0)
	public static final ItemStack fireelement = null;

	@ItemStackHolder(value="customnpcs:npcWaterElement", meta= 0)
	public static final ItemStack waterelement = null;

	@ItemStackHolder(value="customnpcs:npcEarthElement", meta= 0)
	public static final ItemStack earthelement = null;

	@ItemStackHolder(value="customnpcs:npcAirElement", meta= 0)
	public static final ItemStack airelement = null;

	@ItemStackHolder(value="customnpcs:npcBloodBlock", meta= 0)
	public static final ItemStack bloodblock = null;

	@ItemStackHolder(value="customnpcs:npcDemonicIngot", meta= 0)
	public static final ItemStack demoningot = null;

	@ItemStackHolder(value="customnpcs:npcSaphire", meta= 0)
	public static final ItemStack saphire = null;

	@ItemStackHolder(value="customnpcs:npcAmethyst", meta= 0)
	public static final ItemStack amethyst = null;

	@ItemStackHolder(value="customnpcs:npcMana", meta= 0)
	public static final ItemStack npcmana = null;

	@ItemStackHolder(value="customnpcs:npcRuby", meta= 0)
	public static final ItemStack ruby = null;

	@ItemStackHolder(value="customnpcs:npcCoinGold", meta= 0)
	public static final ItemStack goldcoin = null;

	@ItemStackHolder(value="customnpcs:npcArtifact", meta= 0)
	public static final ItemStack artifact = null;

	@ItemStackHolder(value="customnpcs:npcOcarina", meta= 0)
	public static final ItemStack ocarina = null;

	//Blood Magic stuff...Way uses silly name

	@ItemStackHolder(value="AWWayofTime:sacrificialKnife", meta= 0)
	public static final ItemStack knife = null;

	@ItemStackHolder(value="AWWayofTime:Altar", meta= 0)
	public static final ItemStack altar = null;

	@ItemStackHolder(value="AWWayofTime:bucketLife", meta= 0)
	public static final ItemStack lifebucket = null;

	@ItemStackHolder(value="AWWayofTime:bloodMagicBaseItems", meta= 28)
	public static final ItemStack lifeshard = null;

	@ItemStackHolder(value="AWWayofTime:bloodMagicBaseItems", meta= 29)
	public static final ItemStack soulshard = null;

	@ItemStackHolder(value="AWWayofTime:weakBloodShard", meta= 0)
	public static final ItemStack bloodshard = null;


	public static void preInit(){}
	public static void init()
	{
		getItems();
		getFluids();
	}

	public static void postInit(){

		getBotaniaseeds();

	}

	public static void getItems() {


		redstone = GameRegistry.findItem("minecraft", "redstone");
		glowstone = GameRegistry.findItem("minecraft", "glowstone_dust");
		lapis = GameRegistry.findItem("minecraft", "dye");
		gemDiamond = GameRegistry.findItem("minecraft", "diamond");
		gemEmerald = GameRegistry.findItem("minecraft", "emerald");
		ghast = GameRegistry.findItem("minecraft", "ghast_tear");
		dirt = GameRegistry.findBlock("minecraft", "dirt");
		podzol = GameRegistry.findBlock("minecraft", "dirt");
		snow = GameRegistry.findBlock("minecraft", "snow");
		gravel = GameRegistry.findBlock("minecraft", "gravel");
		sand = GameRegistry.findBlock("minecraft", "sand");
		soulsand = GameRegistry.findBlock("minecraft", "soul_sand");



		if (Loader.isModLoaded("ExtraUtilities"))
		{
			spikediamond = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 4);
			spikegold = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 4);
			spikeiron = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 4);

		}

		if (Loader.isModLoaded("AWWayofTime"))
		{
			weakblood = GameRegistry.findItem("AWWayofTime", "weakBloodShard");
		}

		if (Loader.isModLoaded("harvestcraft"))

		{
			freshwater = GameRegistry.findItemStack("harvestcraft", "freshwaterItem", 4);
			apple = GameRegistry.findItem("minecraft", "apple");
			lemon = GameRegistry.findItem("harvestcraft", "lemonItem");
			grape = GameRegistry.findItem("harvestcraft", "grapeItem");
			strawberry = GameRegistry.findItem("harvestcraft", "strawberryItem");


		}

		if (Loader.isModLoaded("ThermalFoundation"))
		{
			sulfur = GameRegistry.findItem("ThermalFoundation", "material");
			blizz = GameRegistry.findItem("ThermalFoundation", "material");
		}

		if (Loader.isModLoaded("SolarFlux"))
		{
			mirror = GameRegistry.findItemStack("SolarFlux", "mirror", 2);
		}

		if (Loader.isModLoaded("BigReactors"))
		{
			yellorium = GameRegistry.findItem("BigReactors", "BRIngot");
		}
		if (Loader.isModLoaded("exnihilo"))
		{
			crnether = GameRegistry.findBlock("exnihilo", "exnihilo.gravel_nether");


			if (Loader.isModLoaded("AgriCraft"))
			{


				cactus1 = GameRegistry.findItem("AgriCraft", "seedCactus");
				sugarcane1 = GameRegistry.findItem("AgriCraft", "seedSugarcane");
				carrot1 = GameRegistry.findItem("AgriCraft", "seedCarrot");
				potato1 = GameRegistry.findItem("AgriCraft", "seedPotato");

				cactus = GameRegistry.findItem("exnihilo", "seed_cactus");
				sugarcane = GameRegistry.findItem("exnihilo", "seed_sugar_cane");
				carrot = GameRegistry.findItem("exnihilo", "seed_carrot");
				potato = GameRegistry.findItem("exnihilo", "seed_potato");
			}
		}

		if (Loader.isModLoaded("Natura"))
		{
			heatsand = GameRegistry.findBlock("Natura", "heatsand");
		}
	}


	public static void getFluids() {

		if (Loader.isModLoaded("TConstruct"))
		{
			tciron = FluidRegistry.getFluidStack("iron.molten", 288);
			tcgold = FluidRegistry.getFluidStack("gold.molten", 720);
			tcbronze = FluidRegistry.getFluidStack("bronze.molten", 144);
			tcardite = FluidRegistry.getFluidStack("ardite.molten", 144);
			tclead = FluidRegistry.getFluidStack("lead.molten", 144);
			tctin = FluidRegistry.getFluidStack("tin.molten", 144);
			tccopper = FluidRegistry.getFluidStack("copper.molten", 144);
			tcnickel = FluidRegistry.getFluidStack("nickel.molten", 144);
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

	private static void getBotaniaseeds() {



		if (Loader.isModLoaded("AgriCraft")&& (Loader.isModLoaded("Botania")))
		{
			bwhite = GameRegistry.findItem("AgriCraft", "seedBotaniaWhite");
			bmagenta = GameRegistry.findItem("AgriCraft", "seedBotaniaMagenta");
			blightblue = GameRegistry.findItem("AgriCraft", "seedBotaniaLightBlue");
			byellow = GameRegistry.findItem("AgriCraft", "seedBotaniaYellow");
			blime = GameRegistry.findItem("AgriCraft", "seedBotaniaLime");
			bpink = GameRegistry.findItem("AgriCraft", "seedBotaniaPink");
			bgray = GameRegistry.findItem("AgriCraft", "seedBotaniaGray");
			blightgray = GameRegistry.findItem("AgriCraft", "seedBotaniaLightGray");
			bcyan = GameRegistry.findItem("AgriCraft", "seedBotaniaCyan");
			bpurple = GameRegistry.findItem("AgriCraft", "seedBotaniaPurple");
			bblue = GameRegistry.findItem("AgriCraft", "seedBotaniaBlue");
			bbrown = GameRegistry.findItem("AgriCraft", "seedBotaniaBrown");
			bgreen = GameRegistry.findItem("AgriCraft", "seedBotaniaGreen");
			bred = GameRegistry.findItem("AgriCraft", "seedBotaniaRed");
			bblack = GameRegistry.findItem("AgriCraft", "seedBotaniaBlack");
			borange = GameRegistry.findItem("AgriCraft", "seedBotaniaOrange");
		}

	}




	//-------AgSkies------------
	public static Item lemon;
	public static Item grape;
	public static Item strawberry;
	public static Item yellorium;
	public static Block dirt;
	public static Block podzol;
	public static Block soulsand;
	public static Block sand;
	public static Block gravel;
	public static Item lapis;
	public static Item ghast;
	public static Item gemDiamond;
	public static Item gemEmerald;
	public static Item bwhite;
	public static Item bmagenta;
	public static Item blightblue;
	public static Item byellow;
	public static Item blime;
	public static Item bpink;
	public static Item bgray;
	public static Item blightgray;
	public static Item borange;
	public static Item bcyan;
	public static Item bpurple;
	public static Item bblue;
	public static Item bbrown;
	public static Item bgreen;
	public static Item bred;
	public static Item bblack;
	public static Item cactus1;
	public static Item sugarcane1;
	public static Item carrot1;
	public static Item potato1;
	public static Item sulfur;
	public static Item blizz;
	public static Item redstone;
	public static Item glowstone;
	public static Item weakblood;
	public static Block snow;
	public static Block heatsand;
	public static Block crnether;
	public static Item apple;
	public static Item cactus;
	public static Item sugarcane;
	public static Item carrot;
	public static Item potato;
	//Stacks greater than 1
	public static ItemStack mirror;
	public static ItemStack spikediamond;
	public static ItemStack spikegold;
	public static ItemStack spikeiron;
	public static ItemStack freshwater;
	//----------Fluids -------------
	public static FluidStack moltenaluminum;
	public static FluidStack moltenaluminumbrass;
	public static FluidStack tciron;
	public static FluidStack tcgold;
	public static FluidStack tcardite;
	public static FluidStack tcbronze;
	public static FluidStack tcemerald;
	public static FluidStack temana;
	public static FluidStack tclead;
	public static FluidStack tctin;
	public static FluidStack tccopper;
	public static FluidStack tcnickel;
	public static Object fruit2;


}





