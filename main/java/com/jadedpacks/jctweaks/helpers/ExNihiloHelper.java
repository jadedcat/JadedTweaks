package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Loader;
import exnihilo.registries.SieveRegistry;

public class ExNihiloHelper {
	public static void preInit(){


	}

	public static void init()
	{

		if (Loader.isModLoaded("exnihilo"))

		{

			addRecipes();
		}
	}


	public static void postInit() {

	}

	private static void addRecipes() {

		//remove exnihilo seeds replace with AgriCraft versions
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.carrot, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.sugarcane, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.cactus, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.potato, 0);
		SieveRegistry.register(Parts.dirt, 0, Parts.carrot1, 0, 5);
		SieveRegistry.register(Parts.dirt, 0, Parts.sugarcane1, 0, 5);
		SieveRegistry.register(Parts.dirt, 0, Parts.cactus1, 0, 5);
		SieveRegistry.register(Parts.dirt, 0, Parts.potato1, 0, 5);
		//add sieve recipes podzol - botania seeds
		SieveRegistry.register(Parts.podzol, 2, Parts.bwhite, 0, 5);
		SieveRegistry.register(Parts.podzol, 2, Parts.bmagenta, 0, 5);
		SieveRegistry.register(Parts.podzol, 2, Parts.blightblue, 0, 5);
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
		//add ghast tears from soulsand sieving
		SieveRegistry.register(Parts.soulsand, 2, Parts.ghast, 0, 5);

	}

}


