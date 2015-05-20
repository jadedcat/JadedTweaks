package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.jadedpacks.jctweaks.Main;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class FurnaceHelper {

	public static void preInit() {

	}

	public static void init ()

	{
		Item basiclog = GameRegistry.findItem("minecraft", "log");
		Item tier2log = GameRegistry.findItem("minecraft", "log2");
		Item coal = GameRegistry.findItem("minecraft", "coal");

		ItemStack birch = new ItemStack(basiclog, 1, 2);
		ItemStack oak = new ItemStack(basiclog, 1, 0);
		ItemStack spruce = new ItemStack(basiclog, 1, 1);
		ItemStack jungle = new ItemStack(basiclog, 1, 3);
		ItemStack special = new ItemStack(tier2log, 1, 0);
		ItemStack darkoak = new ItemStack(tier2log, 1, 1);


		ItemStack charcoal   = new ItemStack(coal, 1, 1);
		ItemStack charcoal2   = new ItemStack(coal, 2, 1);
		ItemStack charcoal3   = new ItemStack(coal, 3, 1);
		ItemStack charcoal4   = new ItemStack(coal, 4, 1);
		ItemStack charcoal5   = new ItemStack(coal, 5, 1);


		RecipeRemover.removeFurnaceRecipe(charcoal);

		GameRegistry.addSmelting(oak , (charcoal), 0.1F);
		GameRegistry.addSmelting(birch , (charcoal2), 0.1F);
		GameRegistry.addSmelting(jungle , (charcoal3), 0.1F);
		GameRegistry.addSmelting(spruce , (charcoal3), 0.1F);
		GameRegistry.addSmelting(special , (charcoal4), 0.1F);
		GameRegistry.addSmelting(darkoak , (charcoal4), 0.1F);

		if (Loader.isModLoaded("Forestry"))
		{
			ItemStack flog1 = GameRegistry.findItemStack("Forestry", "log1", 1);
			ItemStack flog2 = GameRegistry.findItemStack("Forestry", "log2", 1);
			ItemStack flog3 = GameRegistry.findItemStack("Forestry", "log3", 1);
			ItemStack flog4 = GameRegistry.findItemStack("Forestry", "log4", 1);
			ItemStack flog5 = GameRegistry.findItemStack("Forestry", "log5", 1);
			ItemStack flog6 = GameRegistry.findItemStack("Forestry", "log6", 1);
			ItemStack flog7 = GameRegistry.findItemStack("Forestry", "log7", 1);

			GameRegistry.addSmelting(flog1 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog2 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog3 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog4 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog5 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog6 , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog7 , (charcoal3), 0.1F);

			if (Loader.isModLoaded("ThermalExpansion"))
			{
				NBTTagCompound toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog1.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog2.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog3.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog4.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog5.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog6.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog7.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();


				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog1.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog2.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog3.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog4.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog5.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog6.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog7.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

			}
			Main.log.info("Jaded changed the charcoal output of Forestry logs");
		}

		if (Loader.isModLoaded("Natura"))
		{
			ItemStack nlog1 = GameRegistry.findItemStack("Natura", "redwood", 1);
			ItemStack nlog2 = GameRegistry.findItemStack("Natura", "willow", 1);
			ItemStack nlog3 = GameRegistry.findItemStack("Natura", "tree", 1);
			ItemStack nlog4 = GameRegistry.findItemStack("Natura", "Rare Tree", 1);
			ItemStack nlog5 = GameRegistry.findItemStack("Natura", "Dark Tree", 1);

			GameRegistry.addSmelting(nlog1 , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog2 , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog3 , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog4 , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog5 , (charcoal3), 0.1F);

			if (Loader.isModLoaded("ThermalExpansion"))
			{
				NBTTagCompound toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog1.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog2.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog3.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog4.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog5.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog1.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog2.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog3.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog4.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				nlog5.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

			}
			Main.log.info("Jaded changed the charcoal output of Natura logs");

		}




		Main.log.info("Jaded made logs require different axes and give more charcoal");

		if (Loader.isModLoaded("ThermalExpansion"))
		{
			//RecipeFurnace(ItemStack input, ItemStack output, int energy) {

			//this.input = input;
			//this.output = output;
			//this.energy = energy;

			//oak
			NBTTagCompound toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			oak.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			birch.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			jungle.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			spruce.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			special.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			darkoak.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();


			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal.writeToNBT(toSend.getCompoundTag("output"));
			oak.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//birch = 2
			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			birch.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//jungle = 3
			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			jungle.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//spruce = 3
			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			spruce.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//special = 4
			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal4.writeToNBT(toSend.getCompoundTag("output"));
			special.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//darkoak = 4
			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal4.writeToNBT(toSend.getCompoundTag("output"));
			darkoak.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();
			Main.log.info("JadedTweaks Furnace tweaks loaded");

		}


	}

	public static void postInit() {

	}

}
