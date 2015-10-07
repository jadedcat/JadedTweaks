package com.jadedpacks.jctweaks.helpers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry.ItemStackHolder;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryTweaks {

	public static void preInit(){
	}

	public static void init()
	{
		if (Parts.k !=null&&(Parts.kessentia !=null))
		{
			OreDictionary.registerOre("basestoragecell", Parts.k);
			OreDictionary.registerOre("essentiastorage", Parts.kessentia);
		}

		if (Loader.isModLoaded("AWWayofTime"))

		{
			OreDictionary.registerOre("fastmine", Parts.fastmine);
			OreDictionary.registerOre("divination", Parts.divination);
			OreDictionary.registerOre("teleposition", Parts.teleposition);
			OreDictionary.registerOre("transposition", Parts.transposition);
			OreDictionary.registerOre("blank", Parts.blank);
			OreDictionary.registerOre("reinforced", Parts.reinforced);
			OreDictionary.registerOre("imbued", Parts.imbued);
			OreDictionary.registerOre("waterSigil", Parts.waterSigil);
			OreDictionary.registerOre("harvestSigil", Parts.harvestSigil);
			OreDictionary.registerOre("holding", Parts.holding);
			OreDictionary.registerOre("magnetsigil", Parts.magnetsigil);
			OreDictionary.registerOre("growth", Parts.growth);
			OreDictionary.registerOre("bloodLamp", Parts.bloodLamp);
		}


		if (Loader.isModLoaded("TConstruct"))
		{
			OreDictionary.registerOre("stenciltable", Parts.stencil1);
			OreDictionary.registerOre("stenciltable", Parts.stencil2);
			OreDictionary.registerOre("stenciltable", Parts.stencil3);
			OreDictionary.registerOre("stenciltable", Parts.stencil4);

			OreDictionary.registerOre("toolstation", Parts.toolstation);

			OreDictionary.registerOre("partbuilder", Parts.partbuilder);
			OreDictionary.registerOre("partbuilder", Parts.partbuilder2);
			OreDictionary.registerOre("partbuilder", Parts.partbuilder3);
			OreDictionary.registerOre("partbuilder", Parts.partbuilder4);
		}

		if (Parts.dynamo !=null && (Parts.watergen !=null))
		{
			OreDictionary.registerOre("dynamo", Parts.dynamo);
			OreDictionary.registerOre("watergenTE", Parts.watergen);
		}

		if (Parts.barrel0 !=null)
		{
			OreDictionary.registerOre("ebarrel", Parts.barrel0);
			OreDictionary.registerOre("ebarrel", Parts.barrel1);
			OreDictionary.registerOre("ebarrel", Parts.barrel2);
			OreDictionary.registerOre("ebarrel", Parts.barrel3);
			OreDictionary.registerOre("ebarrel", Parts.barrel4);
			OreDictionary.registerOre("ebarrel", Parts.barrel5);
		}

		if (Parts.sieve0 !=null)
		{
			OreDictionary.registerOre("sieve", Parts.sieve0);
			OreDictionary.registerOre("sieve", Parts.sieve1);
			OreDictionary.registerOre("sieve", Parts.sieve2);
			OreDictionary.registerOre("sieve", Parts.sieve3);
			OreDictionary.registerOre("sieve", Parts.sieve4);
			OreDictionary.registerOre("sieve", Parts.sieve5);
		}

		if (Parts.basicchip !=null)
		{
			OreDictionary.registerOre("basicchip", Parts.basicchip);
		}

		if (Parts.arcaneassemble !=null)
		{
			OreDictionary.registerOre("jarcane", Parts.arcaneassemble);
		}
	}



	public static void postInit() {

	}

}
