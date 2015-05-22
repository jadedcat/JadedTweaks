package com.jadedpacks.jctweaks.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JCResearchItem extends ResearchItem {

    public JCResearchItem(String par1, String x) {
        super(par1, x);
    }

    public JCResearchItem(String par1, String x, AspectList tags, int y, int z, int par5, ResourceLocation icon) {
        super(par1, x, tags, y, z, par5, icon);
    }

    public JCResearchItem(String par1, String x, AspectList tags, int y, int z, int par5, ItemStack icon) {
        super(par1, x, tags, y, z, par5, icon);
    }

    @SideOnly(Side.CLIENT)
    public String getName() {
        return StatCollector.translateToLocal("jctweaks.research_name." + key);
    }

    @SideOnly(Side.CLIENT)
    public String getText() {
        return StatCollector.translateToLocal("jctwweaks.research_text." + key);
    }
}