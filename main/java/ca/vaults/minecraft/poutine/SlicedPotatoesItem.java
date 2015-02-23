package ca.vaults.minecraft.poutine;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class SlicedPotatoesItem extends ItemFood {
	
	private String name = "slicedPotatesItem";
	
	public SlicedPotatoesItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setMaxStackSize(64);
		setUnlocalizedName("sliced_potatoes");		
		setTextureName("poutinemod:raw_french_fries");
		GameRegistry.registerItem(this, name);

	}

}
