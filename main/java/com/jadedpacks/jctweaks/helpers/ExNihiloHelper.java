package com.jadedpacks.jctweaks.helpers;

import com.jadedpacks.jctweaks.Main;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import exnihilo.registries.SieveRegistry;

public class ExNihiloHelper {
	public static void preInit(){


	}

	public static void init()
	{


	}


	public static void postInit() {

		if (Loader.isModLoaded("exnihilo"))

		{

			addRecipes();
		}
	}

	private static void addRecipes() {

		//remove exnihilo seeds replace with AgriCraft versions
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.carrot, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.sugarcane, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.cactus, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.potato, 0);
		SieveRegistry.register(Parts.dirt, 0, Parts.carrot1, 0, 2);
		SieveRegistry.register(Parts.dirt, 0, Parts.sugarcane1, 0, 2);
		SieveRegistry.register(Parts.dirt, 0, Parts.cactus1, 0, 2);
		SieveRegistry.register(Parts.dirt, 0, Parts.potato1, 0, 2);
		//add sieve recipes podzol - botania seeds
		if (Parts.bwhite !=null)
		{
			SieveRegistry.register(Parts.dirt, 2, Parts.bwhite, 0, 5);
			SieveRegistry.register(Parts.dirt, 2, Parts.bmagenta, 0, 5);
			SieveRegistry.register(Parts.dirt, 2, Parts.blightblue, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.byellow, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.blime, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpink, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgray, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.blightgray, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpurple, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblue, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bbrown, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgreen, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bred, 0, 5);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblack, 0, 5);
		}
		else
		{
			Main.log.info("Botania Seeds are missing");
		}
		//add ghast tears from soulsand sieving
		SieveRegistry.register(Parts.soulsand, 0, Parts.ghast, 0, 5);
		SieveRegistry.register(Parts.soulsand, 0, Parts.sulfur, 16, 2);
		SieveRegistry.register(Parts.snow, 0, Parts.blizz, 1025, 2);
		SieveRegistry.register(Parts.crnether, 0, Parts.sulfur, 16, 4);
		SieveRegistry.register(Parts.crnether, 0, Parts.ghast, 0, 3);
		SieveRegistry.register(Parts.crnether, 0, Parts.glowstone, 0, 2);
		SieveRegistry.register(Parts.heatsand, 0, Parts.sulfur, 0, 2);
		SieveRegistry.register(Parts.heatsand, 0, Parts.yellorium, 4, 2);



	}

}


