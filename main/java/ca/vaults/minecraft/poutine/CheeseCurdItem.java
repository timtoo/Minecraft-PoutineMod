package ca.vaults.minecraft.poutine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCurdItem extends ItemFood {
	
	private String name = "cheeseCurdItem";
	
	public CheeseCurdItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		this.setMaxStackSize(64);
		this.setUnlocalizedName("cheese_curd");
		this.setTextureName("poutinemod:cheese_curd2");
		GameRegistry.registerItem(this, name);
		
	}

}
