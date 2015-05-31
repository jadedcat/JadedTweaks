package com.jadedpacks.jctweaks;



import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jctweaks.helpers.BloodMagicHelper;
import com.jadedpacks.jctweaks.helpers.BotaniaHelper;
import com.jadedpacks.jctweaks.helpers.ExNihiloHelper;
import com.jadedpacks.jctweaks.helpers.FurnaceHelper;
import com.jadedpacks.jctweaks.helpers.HarvestCraftHelper;
import com.jadedpacks.jctweaks.helpers.MFRHelper;
import com.jadedpacks.jctweaks.helpers.RecipeRemover;
import com.jadedpacks.jctweaks.helpers.ThaumcraftHelper;
import com.jadedpacks.jctweaks.helpers.ThermalExpansionHelper;
import com.jadedpacks.jctweaks.helpers.TinkersConstructHelper;
import com.jadedpacks.jctweaks.helpers.Parts;
import com.jadedpacks.jctweaks.helpers.CustomNpcsHelper;
import com.jadedpacks.jctweaks.helpers.Basic;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME,  dependencies = "required-after:Forge@[10.13.3.1384,11.14);" +
		"after:TConstruct;" +
		"after:MineFactoryReloaded;" +
		"after:ExtraUtilities;" +
		"after:SolarFLux;" +
		"after:Forestry;" +
		"after:harvestcraft;" +
		"after:AWWayofTime;" +
		"after:customnpcs;" +
		"after:AgriCraft;" +
		"after:Botania;" +
		"after:exnihilo;" +
		"after:ThermalFoundation;" +
		"after:Thaumcraft;" +
		"after:ThermalExpansion;")

public class Main {
	public static final String MODID = "JCTweaks";
	public static final String NAME = "JCTweaks";
	public static final String VERSION = "1.6";
	public static final Logger log = LogManager.getLogger(MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Parts.preInit();
		ThermalExpansionHelper.preInit();
		ThaumcraftHelper.preInit();
		TinkersConstructHelper.preInit();
		MFRHelper.preInit();
		BotaniaHelper.preInit();
		BloodMagicHelper.preInit();
		HarvestCraftHelper.preInit();
		FurnaceHelper.preInit();
		CustomNpcsHelper.preInit();
		ExNihiloHelper.preInit();
		Basic.preInit();
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)

	{
		Parts.init();
		Main.log.info("parts");
		ThermalExpansionHelper.init();
		Main.log.info("TE");
		ThaumcraftHelper.init();
		TinkersConstructHelper.init();
		MFRHelper.init();
		//BotaniaHelper.init();
		BloodMagicHelper.init();
		HarvestCraftHelper.init();
		FurnaceHelper.init();
		CustomNpcsHelper.init();
		ExNihiloHelper.init();
		Basic.init();

	}

	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)

	{
		Parts.postInit();
		ThermalExpansionHelper.postInit();
		ThaumcraftHelper.postInit();
		TinkersConstructHelper.postInit();
		MFRHelper.postInit();
		//BotaniaHelper.postInit();
		BloodMagicHelper.postInit();
		HarvestCraftHelper.postInit();
		FurnaceHelper.postInit();
		CustomNpcsHelper.postInit();
		ExNihiloHelper.postInit();
		Basic.postInit();
	}

	@Mod.EventHandler
	public void loadComplete(FMLLoadCompleteEvent event)
	{
		ThermalExpansionHelper.loadComplete();

	}
}


