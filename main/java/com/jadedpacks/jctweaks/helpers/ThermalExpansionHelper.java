package com.jadedpacks.jctweaks.helpers;

import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Loader;

import com.jadedpacks.jctweaks.Main;
import com.jadedpacks.jctweaks.helpers.RecipeRemover;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ThermalExpansionHelper {	
	public static void preInit(){
		
		if (Loader.isModLoaded("ThermalExpansion"))
	{ 			
		Main.log.info("Jaded is now fiddling with ThermalExpansion, do not blame TeamCoFH for unexpected explosions");
	}
		
		if (Loader.isModLoaded("SolarFLux"))		{ 
			
			Main.log.info("Jaded is rearranging solar panels for maximum sunlight or pain, one or the other, possibly both");					
		}
		
	}
	public static void init()
	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			removeRecipes();
			addRecipes();
		}
	}
	public static void postInit()
	
	{
	 
	}
	private static void removeRecipes() {
		Item teMaterial = GameRegistry.findItem("ThermalFoundation", "material");
		if (teMaterial == null)
		  throw new RuntimeException("HOLY SHIT SOMETHING IS WRONG WHERE IS TF!?!?!?!");
		  
		ItemStack gearCopper   = new ItemStack(teMaterial, 1, 128);
		ItemStack gearIron     = new ItemStack(teMaterial, 1, 12);
		ItemStack gearTin      = new ItemStack(teMaterial, 1, 129);
		ItemStack gearGold     = new ItemStack(teMaterial, 1, 13);
		ItemStack gearSilver   = new ItemStack(teMaterial, 1, 130);
		ItemStack gearBronze   = new ItemStack(teMaterial, 1, 137);
		ItemStack gearNickel   = new ItemStack(teMaterial, 1, 132);
		ItemStack gearPlatinum = new ItemStack(teMaterial, 1, 133);
		ItemStack gearMithril  = new ItemStack(teMaterial, 1, 134);
		ItemStack gearElectrum = new ItemStack(teMaterial, 1, 135);
		ItemStack gearInvar    = new ItemStack(teMaterial, 1, 136);
		ItemStack gearSignalum = new ItemStack(teMaterial, 1, 138);
		ItemStack gearLumium   = new ItemStack(teMaterial, 1, 139);
		ItemStack gearEnderium = new ItemStack(teMaterial, 1, 140);
		
		if (Loader.isModLoaded("TConstruct"))
		{
			RecipeRemover.removeAnyRecipe(gearCopper);
			RecipeRemover.removeAnyRecipe(gearIron);
			RecipeRemover.removeAnyRecipe(gearTin);
			RecipeRemover.removeAnyRecipe(gearGold);
			RecipeRemover.removeAnyRecipe(gearSilver);
			RecipeRemover.removeAnyRecipe(gearBronze);
			RecipeRemover.removeAnyRecipe(gearNickel);
			RecipeRemover.removeAnyRecipe(gearPlatinum);
			RecipeRemover.removeAnyRecipe(gearMithril);
			RecipeRemover.removeAnyRecipe(gearElectrum);
			RecipeRemover.removeAnyRecipe(gearInvar);
			RecipeRemover.removeAnyRecipe(gearSignalum);
			RecipeRemover.removeAnyRecipe(gearLumium);
			RecipeRemover.removeAnyRecipe(gearEnderium);
			Main.log.info("Jaded says use the smeltery for gear making");
			
		}
		
		if (Loader.isModLoaded("SolarFlux"))
		{
			ItemStack mirror = GameRegistry.findItemStack("SolarFlux", "mirror", 1);			
			RecipeRemover.removeAnyRecipe(mirror);			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.bucket), new Object[]
					
					{"III",	"XSX", "XXX", "I", "blockGlass", "S", "ingotSilver"
				
					}));
				
			Main.log.info("Jaded has changed the SolarCell recipes");
			
		}
		if (Loader.isModLoaded("Forestry"))
			Main.log.info("Jaded is removing Forestry storage blocks because people wanted the other textures");
		{
			ItemStack copperBlock = new ItemStack (GameRegistry.findItem("Forestry", "resourceStorage"), 1, 1);
			ItemStack tinBlock = new ItemStack (GameRegistry.findItem("Forestry", "resourceStorage"), 1, 2);
			RecipeRemover.removeAnyRecipe(copperBlock);
			RecipeRemover.removeAnyRecipe(tinBlock);
		}
		
	}
	private static void addRecipes() {		
			
		ItemStack mithrilOre = new ItemStack(GameRegistry.findItem("ThermalFoundation", "ore"), 1, 6);
		ItemStack tfOre = new ItemStack(GameRegistry.findItem("ThermalFoundation", "ore"), 1, 5);
		ItemStack platinumIngot = new ItemStack(GameRegistry.findItem("ThermalFoundation", "material"), 2, 69);
		ItemStack silverOre = new ItemStack(GameRegistry.findItem("ThermalFoundation", "Ore"), 1, 2);
		ItemStack platDust = new ItemStack(GameRegistry.findItem("exnihilo", "platinum_dust"), 1, 2);
		FluidStack mana = FluidRegistry.getFluidStack("mana", 100);			
		
		ItemStack fireelement = GameRegistry.findItemStack("customnpcs", "npcFireElement", 1);
		ItemStack waterelement = GameRegistry.findItemStack("customnpcs", "npcWaterElement", 1);
		ItemStack firerune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 1);
		ItemStack waterrune = new ItemStack(GameRegistry.findItem("Botania", "rune"), 1, 0);
		ItemStack bloodblock = GameRegistry.findItemStack("customnpcs", "npcBloodBlock", 1);
		ItemStack demoningot = GameRegistry.findItemStack("customnpcs", "npcDemonicIngot", 1);
		ItemStack richslag = new ItemStack(GameRegistry.findItem("ThermalExpansion", "material"), 1, 515);
		
		//platinum mithril
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setInteger("energy", 2000);
		toSend.setTag("primaryInput", new NBTTagCompound());
		toSend.setTag("secondaryInput", new NBTTagCompound());
		toSend.setTag("primaryOutput", new NBTTagCompound());
		toSend.setTag("secondaryOutput", new NBTTagCompound());
		toSend.setInteger("secondaryChance", 10);
		silverOre.writeToNBT(toSend.getCompoundTag("primaryInput"));
		platDust.writeToNBT(toSend.getCompoundTag("secondaryInput"));
		platinumIngot.writeToNBT(toSend.getCompoundTag("primaryOutput"));
		mithrilOre.writeToNBT(toSend.getCompoundTag("secondaryOutput"));
		toSend.setInteger("secondaryChance", 15);
		FMLInterModComms.sendMessage("ThermalExpansion", "SmelterRecipe", toSend);
		//demonic ingot
		toSend.setInteger("energy", 2000);
		toSend.setTag("primaryInput", new NBTTagCompound());
		toSend.setTag("secondaryInput", new NBTTagCompound());
		toSend.setTag("primaryOutput", new NBTTagCompound());
		bloodblock.writeToNBT(toSend.getCompoundTag("primaryInput"));
		richslag.writeToNBT(toSend.getCompoundTag("secondaryInput"));
		demoningot.writeToNBT(toSend.getCompoundTag("primaryOutput"));
		FMLInterModComms.sendMessage("ThermalExpansion", "SmelterRecipe", toSend);		
		
		//fire element
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("primaryOutput", new NBTTagCompound());
		toSend.setInteger("energy", 3000);
		firerune.writeToNBT(toSend.getCompoundTag("input"));
		fireelement.writeToNBT(toSend.getCompoundTag("output"));
		FMLInterModComms.sendMessage("ThermalExpansion", "PulverizerRecipe", toSend);
		
		//Transposer Recipes
		//NBTTagCompound toSend = new NBTTagCompound();
		//toSend.setTag("input", new NBTTagCompound());
		//toSend.setTag("output", new NBTTagCompound());
		//toSend.setTag("fluid", new NBTTagCompound());
		//toSend.setInteger("energy", 2000);
		//writeToNBT(toSend.getCompoundTag("input"));
		//writeToNBT(toSend.getCompoundTag("output"));
		//FMLInterModComms.sendMessage("ThermalExpansion", "TransposerRecipe", toSend);
		
		//mithril ore
		toSend.setInteger("energy", 2000);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		toSend.setTag("fluid", new NBTTagCompound());		
		tfOre.writeToNBT(toSend.getCompoundTag("input"));
		mithrilOre.writeToNBT(toSend.getCompoundTag("output"));
		mana.writeToNBT(toSend.getCompoundTag("fluid"));
		FMLInterModComms.sendMessage("ThermalExpansion", "TransposerRecipe", toSend);
		//water element
		toSend.setInteger("energy", 2000);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		toSend.setTag("fluid", new NBTTagCompound());		
		waterrune.writeToNBT(toSend.getCompoundTag("input"));
		waterelement.writeToNBT(toSend.getCompoundTag("output"));
		mana.writeToNBT(toSend.getCompoundTag("fluid"));
		FMLInterModComms.sendMessage("ThermalExpansion", "TransposerRecipe", toSend);
		
		Main.log.info("Jaded is adding mystical metals");
		Main.log.info("JadedTweaks Thermal Expansion tweaks loaded");
		
	}
	
	
	
}


