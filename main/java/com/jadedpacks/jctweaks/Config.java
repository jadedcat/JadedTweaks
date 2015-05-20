package com.jadedpacks.jctweaks;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Config {
	
	public boolean Thaumcraft;
	public boolean ThermalExpansion;
	public boolean MFR;
	public boolean BloodMagic;
	public boolean Botania;
	public boolean HarvestCraft;
	public boolean SolarFlux;
	public boolean TinkersConstruct;
	public boolean Vanilla;
	



private Configuration configuration;

public Config(File configFile)

{
	this.configuration = new Configuration(configFile);
	this.configuration.load();
	this.genConfig();
}

public void saveConfigs()
{
	this.configuration.save();
}

private void genConfig()

{
	Property p;
	
	p=configuration.get("general", "ThermalExpansion", true);
	this.ThermalExpansion = p.getBoolean(true);
	
	p=configuration.get("general", "Thaumcraft", true);
	this.Thaumcraft = p.getBoolean(true);
	
	p=configuration.get("general", "MFR", true);
	this.MFR = p.getBoolean(true);
	
	p=configuration.get("general", "BloodMagic", true);
	this.BloodMagic = p.getBoolean(true);
	
	p=configuration.get("general", "Botania", true);
	this.Botania = p.getBoolean(true);
	
	p=configuration.get("general", "HarvestCraft", true);
	this.HarvestCraft = p.getBoolean(true);
	
	p=configuration.get("general", "SolarFlux", true);
	this.SolarFlux = p.getBoolean(true);
	
	p=configuration.get("general", "TinkersConstruct", true);
	this.TinkersConstruct = p.getBoolean(true);
	
	p=configuration.get("general", "Vanilla", true);
	this.Vanilla = p.getBoolean(true);
	
}
}