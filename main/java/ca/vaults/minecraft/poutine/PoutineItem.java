package ca.vaults.minecraft.poutine;

import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PoutineItem extends ItemFood {
	
	private final String name = "poutineItem";
	
	public PoutineItem(int heal, float saturation, boolean wolfMeat) {
		super(heal, saturation, wolfMeat);
		setMaxStackSize(64);
		setUnlocalizedName(Poutine.MODID + "_" + name);
//		setTextureName("poutinemod:poutine");
		GameRegistry.registerItem(this, name);
		
	}
	
	public String getName() {
		return name;
	}

}
