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
		addRecipes();
	}

	private static void addRecipes() {

		//remove exnihilo seeds replace with AgriCraft versions
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.carrot, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.sugarcane, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.cactus, 0);
		SieveRegistry.unregisterReward(Parts.dirt, 0, Parts.potato, 0);
		SieveRegistry.register(Parts.dirt, 0, Parts.carrot1, 0, 15);
		SieveRegistry.register(Parts.dirt, 0, Parts.sugarcane1, 0, 32);
		SieveRegistry.register(Parts.dirt, 0, Parts.cactus1, 0, 32);
		SieveRegistry.register(Parts.dirt, 0, Parts.potato1, 0, 15);
		//add sieve recipes podzol - botania seeds
		if (Parts.bwhite !=null)
		{
			SieveRegistry.register(Parts.dirt, 2, Parts.bwhite, 0, 15);
			SieveRegistry.register(Parts.dirt, 2, Parts.bmagenta, 0, 15);
			SieveRegistry.register(Parts.dirt, 2, Parts.blightblue, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.byellow, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.blime, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpink, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgray, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.blightgray, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bpurple, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblue, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bbrown, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bgreen, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bred, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.bblack, 0, 15);
			SieveRegistry.register(Parts.podzol, 2, Parts.borange, 0, 15);
		}
		else
		{
			Main.log.info("Botania Seeds are missing");
		}
		//add ghast tears from soulsand sieving
		SieveRegistry.register(Parts.soulsand, Parts.ghast, 0, 20);
		SieveRegistry.register(Parts.soulsand, Parts.sulfur, 16, 15);
		SieveRegistry.register(Parts.soulsand, Parts.weakblood, 0, 32);
		SieveRegistry.register(Parts.snow, Parts.blizz, 1025, 64);
		SieveRegistry.register(Parts.crnether, Parts.sulfur, 16, 8);
		SieveRegistry.register(Parts.crnether, Parts.ghast, 0, 15);
		SieveRegistry.register(Parts.crnether, Parts.glowstone, 0, 32);
		SieveRegistry.register(Parts.heatsand, Parts.sulfur, 16, 15);
		SieveRegistry.register(Parts.heatsand, Parts.yellorium, 4, 32);
		SieveRegistry.register(Parts.heatsand, Parts.weakblood, 0, 32);
		SieveRegistry.register(Parts.gravel, Parts.lapis, 4, 15);
		SieveRegistry.register(Parts.gravel, Parts.gemDiamond, 0, 90);
		SieveRegistry.register(Parts.gravel, Parts.gemEmerald, 0, 90);



	}

}


