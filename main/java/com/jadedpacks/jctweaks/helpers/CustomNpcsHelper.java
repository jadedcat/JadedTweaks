package com.jadedpacks.jctweaks.helpers;

import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.LiquidCasting;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import WayofTime.alchemicalWizardry.api.alchemy.AlchemyRecipeRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

import com.jadedpacks.jctweaks.helpers.Parts;

import tconstruct.library.TConstructRegistry;
import tconstruct.library.crafting.LiquidCasting;

public class CustomNpcsHelper {

	public static void preInit(){}

	public static void init()
	{

		if (Loader.isModLoaded("ThermalExpansion"))
		{
			sendIMCrecipes();
		}
	}

	public static void postInit() {

		addRecipes();
	}

	private static void addRecipes() {

		if ((Parts.tcemerald !=null)&&(Parts.earthrune !=null))
		{
			LiquidCasting tableCasting = TConstructRegistry.instance.getTableCasting();
			tableCasting.addCastingRecipe(Parts.earthelement, Parts.tcemerald, Parts.earthrune, 80);
		}

		if ((Parts.npcmana !=null)&&(Parts.airrune !=null))
		{
			AlchemyRecipeRegistry.registerRecipe(Parts.airelement, 2, new ItemStack[]{(Parts.airrune),(Parts.feather)}, 2);
			AlchemyRecipeRegistry.registerRecipe(Parts.amethyst, 2, new ItemStack[]{(Parts.earthelement),(Parts.feather)}, 2);
			AlchemyRecipeRegistry.registerRecipe(Parts.npcmana, 2, new ItemStack[]{(Parts.airelement),(Parts.feather)}, 2);
			AlchemyRecipeRegistry.registerRecipe(Parts.saphire, 2, new ItemStack[]{(Parts.airelement),(Parts.bluepetal)}, 2);
		}
	}

	private static void sendIMCrecipes() {
		// adds ultimate recipes for AgSkies 2
		NBTTagCompound toSend = new NBTTagCompound();


		//demonic ingot
		if ((Parts.bloodblock !=null)&&(Parts.richslag !=null))
		{
			toSend.setTag("primaryInput", new NBTTagCompound());
			toSend.setTag("secondaryInput", new NBTTagCompound());
			toSend.setTag("primaryOutput", new NBTTagCompound());
			toSend.setInteger("energy", 2000);
			Parts.bloodblock.writeToNBT(toSend.getCompoundTag("primaryInput"));
			Parts.richslag.writeToNBT(toSend.getCompoundTag("secondaryInput"));
			Parts.demoningot.writeToNBT(toSend.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "SmelterRecipe", toSend);
			toSend = new NBTTagCompound();
		}
		//check that the customnpc and botania items exist
		if ((Parts.firerune !=null)&&(Parts.fireelement !=null))
		{
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("primaryOutput", new NBTTagCompound());
			toSend.setInteger("energy", 3000);
			Parts.firerune.writeToNBT(toSend.getCompoundTag("input"));
			Parts.fireelement.writeToNBT(toSend.getCompoundTag("primaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend);
			toSend = new NBTTagCompound();
		}

		//check that the items exist from Botania, TE and customnpcs
		if ((Parts.waterrune !=null)&&(Parts.waterelement !=null)&&(Parts.temana !=null))
		{
			toSend.setInteger("energy", 2000);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			toSend.setTag("fluid", new NBTTagCompound());
			Parts.waterrune.writeToNBT(toSend.getCompoundTag("input"));
			Parts.waterelement.writeToNBT(toSend.getCompoundTag("output"));
			Parts.temana.writeToNBT(toSend.getCompoundTag("fluid"));
			FMLInterModComms.sendMessage("ThermalExpansion", "TransposerFillRecipe", toSend);
			toSend = new NBTTagCompound();
		}


	}

}
