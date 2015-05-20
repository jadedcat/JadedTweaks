package com.jadedpacks.jctweaks;



import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jadedpacks.jctweaks.helpers.BloodMagicHelper;
import com.jadedpacks.jctweaks.helpers.BotaniaHelper;
import com.jadedpacks.jctweaks.helpers.HarvestCraftHelper;
import com.jadedpacks.jctweaks.helpers.MFRHelper;
import com.jadedpacks.jctweaks.helpers.ThaumcraftHelper;
import com.jadedpacks.jctweaks.helpers.ThermalExpansionHelper;
import com.jadedpacks.jctweaks.helpers.TinkersConstructHelper;
import com.jadedpacks.jctweaks.helpers.FurnaceHelper;
import com.jadedpacks.jctweaks.helpers.RecipeRemover;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME,  dependencies = "required-after:Forge@[10.13.3.1384,11.14);" +
        "required-after:TConstruct;" +
        "after:MineFactoryReloaded;" +
        "after:SolarFLux;" +
        "after:Forestry;" +
        "after:harvestcraft;" +
        "after:ThermalExpansion;")

public class Main {
	public static final String MODID = "JCTweaks";
	public static final String NAME = "JCTweaks";
	public static final String VERSION = "1.0.2";
	public static final Logger log = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ThermalExpansionHelper.preInit();		
		ThaumcraftHelper.preInit();
		TinkersConstructHelper.preInit();
		MFRHelper.preInit();
		BotaniaHelper.preInit();
		BloodMagicHelper.preInit();
		HarvestCraftHelper.preInit();
		FurnaceHelper.preInit();
	}
	
	public void init (FMLInitializationEvent event)
	
	{			
		ThermalExpansionHelper.init();		
		ThaumcraftHelper.init();		
		TinkersConstructHelper.init();		
		MFRHelper.init();		
		BotaniaHelper.init();		
		BloodMagicHelper.init();		
		HarvestCraftHelper.init();		
		FurnaceHelper.init();		
		
		if (OreDictionary.getOres("oreTin").size() > 0)
			System.out.println("ALternative Bucket Tin");
		{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket), new Object[]
		
			{"IXI",	"XIX", "XXX", "I", "ingotTin"
		
			}));
		}
	
	if (OreDictionary.getOres("oreAluminum").size() > 0)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket), new Object[]
				{"I I",	" I ", "I", "ingotAluminum"			
				}));
	}
	
	else if (OreDictionary.getOres("oreAluminium").size() > 0)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket), new Object[]
				{"IXI",	"XIX", "XXX", "I", "ingotAluminium"
			
				}));
	}
	if (OreDictionary.getOres("oreCopper").size() > 0)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket), new Object[]
				{"IXI",	"XIX", "XXX", "I", "ingotCopper"
			
				}));
	}
	
	if (Loader.isModLoaded("Botania"))
	{
		//remove terraformRod
		ItemStack terraformRod = GameRegistry.findItemStack("Botania", "terraformRod", 1);
		RecipeRemover.removeAnyRecipe(terraformRod);
	}
	if (Loader.isModLoaded("ExtraUtilities"))
	{
		ItemStack builderswand = GameRegistry.findItemStack("ExtraUtilities", "builderswand", 1);
		
		GameRegistry.addRecipe(new ShapedOreRecipe((builderswand), new Object[]
				{
				"XXD", 
				"XDX", 
				"OXX", 
				"D", "gemDiamond", 
				"O", "obsidian"
				}));
	}
	if (Loader.isModLoaded("Natura"))
	{
		ItemStack wartbag = GameRegistry.findItemStack("Natura", "wartbag", 1);
		RecipeRemover.removeAnyRecipe(wartbag);
	}
	
	if (Loader.isModLoaded("AgriCraft"))
	{
		//Cheaper Journal Recipe
		ItemStack journal = GameRegistry.findItemStack("AgriCraft", "journal", 1);
		ItemStack cropsticks = GameRegistry.findItemStack("AgriCraft", "cropsItem", 1);
		RecipeRemover.removeAnyRecipe(journal);
		GameRegistry.addRecipe(new ShapedOreRecipe((journal), new Object[]
			{
			"CSC", 
			"SWS", 
			"CSC", 
			"C", cropsticks, 
			"S", "listAllseed", 
			"W", "plankWood"
			}));
		if (Loader.isModLoaded("progressiveautomation"))
				{
			//Cheaper CobbleGen
					ItemStack cobblegen = GameRegistry.findItemStack("progressiveautomation", "CobbleUpgrade", 1);
					ItemStack miner = GameRegistry.findItemStack("progressiveautomation", "MinerStone", 1);
					ItemStack lava = GameRegistry.findItemStack("IguanaTweaksTConstruct", "clayBucketLava", 1);
					GameRegistry.addRecipe(new ShapedOreRecipe((cobblegen), new Object[]
							{
							"SSS",
							"LMW",
							"SSS",
							"S", "stone",
							"L", "lava",
							"M", "miner",
							"W", "listAllwater"
							}));
				}}
	}
	
	public void postInit (FMLPostInitializationEvent event)
	
	{
		ThermalExpansionHelper.postInit();		
		ThaumcraftHelper.postInit();
		TinkersConstructHelper.postInit();		
		MFRHelper.postInit();		
		BotaniaHelper.postInit();		
		BloodMagicHelper.postInit();		
		HarvestCraftHelper.postInit();		
		FurnaceHelper.postInit();
	}
}


