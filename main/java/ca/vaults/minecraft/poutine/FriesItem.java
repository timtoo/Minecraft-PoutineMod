package ca.vaults.minecraft.poutine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FriesItem extends ItemFood {
	
	private String name = "friesItem";
	
	public FriesItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setMaxStackSize(64);
		setUnlocalizedName("fries");
		setTextureName("poutinemod:french_fries");
		GameRegistry.registerItem(this, name);

	}

}
