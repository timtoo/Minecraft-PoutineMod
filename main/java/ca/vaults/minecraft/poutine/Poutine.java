package ca.vaults.minecraft.poutine;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid=Poutine.MODID, name=Poutine.MODNAME, version=Poutine.VERSION)
public class Poutine {
	
		public static final String MODID = "poutinemod";
		public static final String MODNAME = "PoutineMod";
		public static final String VERSION = "1.0";
	
	    public static ItemFood iCheeseCurd;
	    public static ItemFood iFries;
	    public static ItemSoup iGravy;
	    public static ItemFood iPoutine;
	    public static ItemFood iSlicedPotatoes;
	    
	    //@Instance
	    //public static Poutine instance = new Poutine();

        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
        	// Item instances to be used in recipes
        	iCheeseCurd = new CheeseCurdItem(3, 0.6F, false);
        	iFries = new FriesItem(2, 0.6F, false);
        	iGravy = new GravyItem(2);        	
        	iPoutine = new PoutineItem(10, 0.9f, false);
        	iSlicedPotatoes = new SlicedPotatoesItem(1, 0.3F, false);
        	
        }	    
	    
        @EventHandler
        public void init(FMLInitializationEvent event) {
        	
        	// Sliced potatoes recipe
        	ItemStack potatoStack = new ItemStack(Items.potato);
        	GameRegistry.addShapelessRecipe(new ItemStack(iSlicedPotatoes), 
        			potatoStack, potatoStack);
        	
        	// Cheese Curd recipe
        	ItemStack milkStack = new ItemStack(Items.milk_bucket);
        	ItemStack vineStack = new ItemStack(Blocks.vine);
        	GameRegistry.addShapelessRecipe(new ItemStack(iCheeseCurd), 
        			milkStack, vineStack);
        	
        	// Gravy recipe
        	ItemStack brownMushroomStack = new ItemStack(Blocks.brown_mushroom);
        	ItemStack bowlStack = new ItemStack(Items.bowl);
        	GameRegistry.addShapelessRecipe(new ItemStack(iGravy), 
        			brownMushroomStack, brownMushroomStack, bowlStack);
        	
        	// Poutine recipe
        	ItemStack friesStack = new ItemStack(iFries);
        	ItemStack cheeseCurdStack = new ItemStack(iCheeseCurd);
        	ItemStack gravyStack = new ItemStack(iGravy);
        	GameRegistry.addRecipe(new ItemStack(iPoutine), "z", "y", "x",
                    'x', friesStack, 'y', cheeseCurdStack, 'z', gravyStack);
        	
        	// Fries smelting (cooking) recipe
        	GameRegistry.addSmelting(iSlicedPotatoes, new ItemStack(iFries), 0.1f);
        	
        	if(event.getSide() == Side.CLIENT)
        	{
        	    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        		
        	    	renderItem.getItemModelMesher().register(iCheeseCurd, 0, 
        	    			new ModelResourceLocation(Poutine.MODID + ":" + 
        	    					((CheeseCurdItem) iCheeseCurd).getName(), "inventory"));
        	    	
        	    	renderItem.getItemModelMesher().register(iFries, 0, 
        	    			new ModelResourceLocation(Poutine.MODID + ":" + 
        	    					((FriesItem) iFries).getName(), "inventory"));
        	    	
        	    	renderItem.getItemModelMesher().register(iGravy, 0, 
        	    			new ModelResourceLocation(Poutine.MODID + ":" + 
        	    					((GravyItem) iGravy).getName(), "inventory"));
        	    	
        	    	renderItem.getItemModelMesher().register(iPoutine, 0, 
        	    			new ModelResourceLocation(Poutine.MODID + ":" + 
        	    					((PoutineItem) iPoutine).getName(), "inventory"));
        	    	
        	    	renderItem.getItemModelMesher().register(iSlicedPotatoes, 0, 
        	    			new ModelResourceLocation(Poutine.MODID + ":" + 
        	    					((SlicedPotatoesItem) iSlicedPotatoes).getName(), "inventory"));
        	}
        	
        }
        
}