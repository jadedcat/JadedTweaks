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


		if (charcoal !=null)
		{
			RecipeRemover.removeFurnaceRecipe(charcoal);
		}

		GameRegistry.addSmelting(oak , (charcoal), 0.1F);
		GameRegistry.addSmelting(birch , (charcoal2), 0.1F);
		GameRegistry.addSmelting(jungle , (charcoal3), 0.1F);
		GameRegistry.addSmelting(spruce , (charcoal3), 0.1F);
		GameRegistry.addSmelting(special , (charcoal4), 0.1F);
		GameRegistry.addSmelting(darkoak , (charcoal4), 0.1F);

		if (Loader.isModLoaded("Forestry"))
		{
			Item flog1 = GameRegistry.findItem("Forestry", "log1");
			ItemStack flog1a = new ItemStack(flog1, 1, 0);
			ItemStack flog1b = new ItemStack(flog1, 1, 1);
			ItemStack flog1c = new ItemStack(flog1, 1, 2);
			ItemStack flog1d = new ItemStack(flog1, 1, 3);

			Item flog2 = GameRegistry.findItem("Forestry", "log2");
			ItemStack flog2a = new ItemStack(flog2, 1, 0);
			ItemStack flog2b = new ItemStack(flog2, 1, 1);
			ItemStack flog2c = new ItemStack(flog2, 1, 2);
			ItemStack flog2d = new ItemStack(flog2, 1, 3);

			Item flog3 = GameRegistry.findItem("Forestry", "log3");
			ItemStack flog3a = new ItemStack(flog3, 1, 0);
			ItemStack flog3b = new ItemStack(flog3, 1, 1);
			ItemStack flog3c = new ItemStack(flog3, 1, 2);
			ItemStack flog3d = new ItemStack(flog3, 1, 3);

			Item flog4 = GameRegistry.findItem("Forestry", "log4");
			ItemStack flog4a = new ItemStack(flog4, 1, 0);
			ItemStack flog4b = new ItemStack(flog4, 1, 1);
			ItemStack flog4c = new ItemStack(flog4, 1, 2);
			ItemStack flog4d = new ItemStack(flog4, 1, 3);

			Item flog5 = GameRegistry.findItem("Forestry", "log5");
			ItemStack flog5a = new ItemStack(flog5, 1, 0);
			ItemStack flog5b = new ItemStack(flog5, 1, 1);
			ItemStack flog5c = new ItemStack(flog5, 1, 2);
			ItemStack flog5d = new ItemStack(flog5, 1, 3);

			Item flog6 = GameRegistry.findItem("Forestry", "log6");
			ItemStack flog6a = new ItemStack(flog6, 1, 0);
			ItemStack flog6b = new ItemStack(flog6, 1, 1);
			ItemStack flog6c = new ItemStack(flog6, 1, 2);
			ItemStack flog6d = new ItemStack(flog6, 1, 3);

			Item flog7 = GameRegistry.findItem("Forestry", "log7");
			ItemStack flog7a = new ItemStack(flog7, 1, 0);
			ItemStack flog7b = new ItemStack(flog7, 1, 1);
			ItemStack flog7c = new ItemStack(flog7, 1, 2);
			ItemStack flog7d = new ItemStack(flog7, 1, 3);

			GameRegistry.addSmelting(flog1a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog1b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog1c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog1d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog2a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog2b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog2c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog2d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog3a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog3b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog3c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog3d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog4a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog4b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog4c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog4d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog5a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog5b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog5c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog5d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(flog6a , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog6b , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog6c , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog6d , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog7a , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog7b , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog7c , (charcoal3), 0.1F);
			GameRegistry.addSmelting(flog7d , (charcoal3), 0.1F);

			if (Loader.isModLoaded("ThermalExpansion"))
			{
				NBTTagCompound toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog1a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog1b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog1c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog1d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog2a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog2b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog2c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog2d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog3a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog3b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog3c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog3d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog4a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog4b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog4c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog4d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog5a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog5b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog5c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog5d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog6a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog6b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog6c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog6d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog7a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog7b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog7c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				flog7d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//add recipes

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog1a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog1b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog1c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog1d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog2a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog2b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog2c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog2d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog3a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog3b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog3c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog3d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();


				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog4a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog4b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog4c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog4d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog5a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog5b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog5c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				flog5d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog6a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog6b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog6c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog6d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog7a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog7b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog7c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				flog7d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

			}
			Main.log.info("Jaded changed the charcoal output of Forestry logs");
		}

		if (Loader.isModLoaded("Natura"))
		{
			Item nlog1 = GameRegistry.findItem("Natura", "redwood");
			ItemStack nlog1a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog1b = new ItemStack(nlog1, 1, 1);

			ItemStack nlog2 = GameRegistry.findItemStack("Natura", "willow", 1);

			Item nlog3 = GameRegistry.findItem("Natura", "tree");
			ItemStack nlog3a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog3b = new ItemStack(nlog1, 1, 1);
			ItemStack nlog3c = new ItemStack(nlog1, 1, 2);
			ItemStack nlog3d = new ItemStack(nlog1, 1, 3);

			Item nlog4 = GameRegistry.findItem("Natura", "Rare Tree");
			ItemStack nlog4a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog4b = new ItemStack(nlog1, 1, 1);
			ItemStack nlog4c = new ItemStack(nlog1, 1, 2);
			ItemStack nlog4d = new ItemStack(nlog1, 1, 3);

			ItemStack nlog5 = GameRegistry.findItemStack("Natura", "Dark Tree", 1);

			GameRegistry.addSmelting(nlog1a , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog1b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog2 , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog3a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog4a , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4b , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4c , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4d , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog5 , (charcoal3), 0.1F);

			if (Loader.isModLoaded("ThermalExpansion"))
			{
				NBTTagCompound toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog1a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog1b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog2.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog3a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog3b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog3c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog3d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog4a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog4b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog4c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog4d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				nlog5.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//add natura log-charcoal
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog1a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				nlog1b.writeToNBT(toSend.getCompoundTag("input"));
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
				nlog3a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog3b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog3c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog3d.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog4a.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog4b.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog4c.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				nlog4d.writeToNBT(toSend.getCompoundTag("input"));
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
