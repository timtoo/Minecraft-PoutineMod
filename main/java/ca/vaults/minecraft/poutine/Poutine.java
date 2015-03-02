package ca.vaults.minecraft.poutine;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="PoutineModID", name="Poutine", version="1.0")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Poutine {
	
        // The instance of your mod that Forge uses.
        @Instance(value = "PoutineModID")
        public static Poutine instance;
        
	    public static ItemFood iCheeseCurd;
	    public static ItemFood iFries;
	    public static ItemSoup iGravy;
	    public static ItemFood iPoutine;
	    public static ItemFood iSlicedPotatoes;

        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="ca.vaults.minecraft.poutine.client.ClientProxy", serverSide="ca.vaults.minecraft.poutine.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler // used in 1.6.2
        //@PreInit    // used in 1.5.2
        public void preInit(FMLPreInitializationEvent event) {
        	iCheeseCurd = new CheeseCurdItem(3, 0.6F, false);
        	iFries = new FriesItem(2, 0.6F, false);
        	iGravy = new GravyItem(2);        	
        	iPoutine = new PoutineItem(10, 0.9f, false);
        	iSlicedPotatoes = new SlicedPotatoesItem(1, 0.3F, false);
        	
        	ItemStack potatoStack = new ItemStack(Items.potato);
        	GameRegistry.addShapelessRecipe(new ItemStack(iSlicedPotatoes), 
        			potatoStack, potatoStack);
        	
        	ItemStack milkStack = new ItemStack(Items.milk_bucket);
        	ItemStack vineStack = new ItemStack(Blocks.vine);
        	GameRegistry.addShapelessRecipe(new ItemStack(iCheeseCurd), 
        			milkStack, vineStack);
        	
        	ItemStack brownMushroomStack = new ItemStack(Blocks.brown_mushroom);
        	ItemStack bowlStack = new ItemStack(Items.bowl);
        	GameRegistry.addShapelessRecipe(new ItemStack(iGravy), 
        			brownMushroomStack, brownMushroomStack, bowlStack);
        	
        	ItemStack friesStack = new ItemStack(iFries);
        	ItemStack cheeseCurdStack = new ItemStack(iCheeseCurd);
        	ItemStack gravyStack = new ItemStack(iGravy);
        	GameRegistry.addRecipe(new ItemStack(iPoutine), "z", "y", "x",
                    'x', friesStack, 'y', cheeseCurdStack, 'z', gravyStack);
        	
        	GameRegistry.addSmelting(iSlicedPotatoes, new ItemStack(iFries), 0.1f);

        	
        }
        
        @EventHandler // used in 1.6.2
        //@Init       // used in 1.5.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}