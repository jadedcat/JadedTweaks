package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class ThermalExpansionHelper {
	public static void preInit(){}

	public static void init()
	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			Main.log.info("Jaded is now fiddling with ThermalExpansion, do not blame TeamCoFH for unexpected explosions");
			removeRecipes();
			addRecipes();
		}
	}

	public static void postInit(){

	}

	private static void removeRecipes() {

		if (Loader.isModLoaded("Forestry"))
		{
			RecipeRemover.removeAnyRecipe(Parts.copperBlock);
			RecipeRemover.removeAnyRecipe(Parts.tinBlock);
			Main.log.info("Jaded is removing Forestry storage blocks because people wanted the other textures");
		}

	}
	private static void addRecipes() {



		//IMC Recipes
		NBTTagCompound toSend = new NBTTagCompound();

		//mithril ore
		toSend.setInteger("energy", 2000);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		toSend.setTag("fluid", new NBTTagCompound());
		Parts.tfOre.writeToNBT(toSend.getCompoundTag("input"));
		Parts.mithrilOre.writeToNBT(toSend.getCompoundTag("output"));
		Parts.temana.writeToNBT(toSend.getCompoundTag("fluid"));
		FMLInterModComms.sendMessage("ThermalExpansion", "TransposerFillRecipe", toSend);
		toSend = new NBTTagCompound();

		if (Parts.mirror !=null)
		{
			RecipeRemover.removeAnyRecipe(Parts.mirror);
			GameRegistry.addRecipe(new ShapedOreRecipe(Parts.mirror,
					"III",
					"XSX",
					'I', "blockGlass",
					'S', "ingotSilver"
					));
			Main.log.info("Jaded is rearranging solar panels for maximum sunlight or pain, one or the other, possibly both");

		}
		else
		{
			Main.log.info("Mirror is missing");
		}

		if (Loader.isModLoaded("exnihilo"))
		{

			toSend.setTag("primaryInput", new NBTTagCompound());
			toSend.setTag("secondaryInput", new NBTTagCompound());
			toSend.setTag("primaryOutput", new NBTTagCompound());
			toSend.setTag("secondaryOutput", new NBTTagCompound());
			toSend.setInteger("secondaryChance", 10);
			toSend.setInteger("energy", 2000);
			Parts.silverOre.writeToNBT(toSend.getCompoundTag("primaryInput"));
			Parts.platDust.writeToNBT(toSend.getCompoundTag("secondaryInput"));
			Parts.platinumIngot.writeToNBT(toSend.getCompoundTag("primaryOutput"));
			Parts.mithrilOre.writeToNBT(toSend.getCompoundTag("secondaryOutput"));
			FMLInterModComms.sendMessage("ThermalExpansion", "SmelterRecipe", toSend);
			toSend = new NBTTagCompound();
		}

		Main.log.info("Jaded is adding mystical metals");
		Main.log.info("JadedTweaks Thermal Expansion tweaks loaded");

	}

	public static void loadComplete() {

		if (Loader.isModLoaded("TConstruct"))
		{
			RecipeRemover.removeAnyRecipe(Parts.gearCopper);
			RecipeRemover.removeAnyRecipe(Parts.gearIron);
			RecipeRemover.removeAnyRecipe(Parts.gearTin);
			RecipeRemover.removeAnyRecipe(Parts.gearGold);
			RecipeRemover.removeAnyRecipe(Parts.gearSilver);
			RecipeRemover.removeAnyRecipe(Parts.gearBronze);
			RecipeRemover.removeAnyRecipe(Parts.gearNickel);
			RecipeRemover.removeAnyRecipe(Parts.gearPlatinum);
			RecipeRemover.removeAnyRecipe(Parts.gearMithril);
			RecipeRemover.removeAnyRecipe(Parts.gearElectrum);
			RecipeRemover.removeAnyRecipe(Parts.gearInvar);
			RecipeRemover.removeAnyRecipe(Parts.gearSignalum);
			RecipeRemover.removeAnyRecipe(Parts.gearLumium);
			RecipeRemover.removeAnyRecipe(Parts.gearEnderium);
			Main.log.info("Jaded says use the smeltery for gear making");
		}


	}



}


