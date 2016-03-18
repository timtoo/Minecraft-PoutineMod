package ca.vaults.minecraft.poutine;

import net.minecraft.item.ItemSoup;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GravyItem extends ItemSoup {
	
	private final String name = "gravyItem";
	
	public GravyItem(int heal) {
		super(heal);
		setUnlocalizedName(Poutine.MODID + "_" + name);
		//setTextureName("poutinemod:mushroom_gravy");
		GameRegistry.registerItem(this, name);
		
	}
	
	public String getName() {
		return name;
	}

}
