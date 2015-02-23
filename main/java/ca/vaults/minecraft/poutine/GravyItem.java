package ca.vaults.minecraft.poutine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;

public class GravyItem extends ItemSoup {
	
	private String name = "gravyItem";
	
	public GravyItem(int heal) {
		super(heal);
		setUnlocalizedName("gravy");
		setTextureName("poutinemod:mushroom_gravy");
		GameRegistry.registerItem(this, name);
		
	}

}
