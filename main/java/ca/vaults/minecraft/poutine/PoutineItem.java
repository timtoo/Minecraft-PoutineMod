package ca.vaults.minecraft.poutine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class PoutineItem extends ItemFood {
	
	private String name = "poutineItem";
	
	public PoutineItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setMaxStackSize(64);
		setUnlocalizedName("poutine");
		setTextureName("poutinemod:poutine");
		GameRegistry.registerItem(this, name);
		
	}

}
