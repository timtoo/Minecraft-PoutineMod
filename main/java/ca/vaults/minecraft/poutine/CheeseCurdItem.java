package ca.vaults.minecraft.poutine;

import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class CheeseCurdItem extends ItemFood {
	
	private final String name = "cheeseCurdItem";
	
	public CheeseCurdItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		this.setMaxStackSize(64);
		this.setUnlocalizedName(Poutine.MODID + "_" + name);
		//this.setTextureName("poutinemod:cheese_curd2");
		GameRegistry.registerItem(this, name);
		
	}
	
	public String getName() {
		return name;
	}

}
