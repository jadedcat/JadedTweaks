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
		"after:*;")

public class Main {
	public static final String MODID = "JCTweaks";
	public static final String NAME = "JCTweaks";
	public static final String VERSION = "1.10";
	public static final Logger log = LogManager.getLogger(MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Parts.preInit();
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			ThermalExpansionHelper.preInit();
		}
		if (Loader.isModLoaded("Thaumcraft"))
		{
			ThaumcraftHelper.preInit();
		}
		if (Loader.isModLoaded("TConstruct"))
		{
			TinkersConstructHelper.preInit();
		}
		if (Loader.isModLoaded("MineFactoryReloaded"))
		{
			MFRHelper.preInit();
		}
		if (Loader.isModLoaded("Botania"))
		{
			BotaniaHelper.preInit();
		}
		if (Loader.isModLoaded("AWWayofTime"))
		{
			BloodMagicHelper.preInit();
		}
		if (Loader.isModLoaded("harvestcraft"))
		{
			HarvestCraftHelper.preInit();
		}
		FurnaceHelper.preInit();
		if (Loader.isModLoaded("customnpcs"))
		{
			CustomNpcsHelper.preInit();
		}
		if(Loader.isModLoaded("exnihilo"))
		{
			ExNihiloHelper.preInit();
		}
		Basic.preInit();
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)

	{
		Parts.init();
		Main.log.info("parts");
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			ThermalExpansionHelper.init();
		}
		if (Loader.isModLoaded("Thaumcraft"))
		{
			ThaumcraftHelper.init();
		}
		if (Loader.isModLoaded("TConstruct"))
		{
			TinkersConstructHelper.init();
		}
		if (Loader.isModLoaded("MineFactoryReloaded"))
		{
			MFRHelper.init();
		}
		if (Loader.isModLoaded("Botania"))
		{
			BotaniaHelper.init();
		}
		if (Loader.isModLoaded("AWWayofTime"))
		{
			BloodMagicHelper.init();
		}
		if (Loader.isModLoaded("harvestcraft"))
		{
			HarvestCraftHelper.init();
		}
		FurnaceHelper.init();
		if (Loader.isModLoaded("customnpcs"))
		{
			CustomNpcsHelper.init();
		}
		if(Loader.isModLoaded("exnihilo"))
		{
			ExNihiloHelper.init();
		}
		Basic.init();

	}

	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)

	{
		Parts.postInit();
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			ThermalExpansionHelper.postInit();
		}
		if (Loader.isModLoaded("Thaumcraft"))
		{
			ThaumcraftHelper.postInit();
		}
		if (Loader.isModLoaded("TConstruct"))
		{
			TinkersConstructHelper.postInit();
		}
		if (Loader.isModLoaded("MineFactoryReloaded"))
		{
			MFRHelper.postInit();
		}
		if (Loader.isModLoaded("Botania"))
		{
			BotaniaHelper.postInit();
		}
		if (Loader.isModLoaded("AWWayofTime"))
		{
			BloodMagicHelper.postInit();
		}
		if (Loader.isModLoaded("harvestcraft"))
		{
			HarvestCraftHelper.postInit();
		}
		FurnaceHelper.postInit();
		if (Loader.isModLoaded("customnpcs"))
		{
			CustomNpcsHelper.postInit();
		}
		if(Loader.isModLoaded("exnihilo"))
		{
			ExNihiloHelper.postInit();
		}
		Basic.preInit();
	}

	@Mod.EventHandler
	public void loadComplete(FMLLoadCompleteEvent event)

	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			ThermalExpansionHelper.loadComplete();
		}

	}
}


