package packedice;

import net.minecraft.block.Block;
import net.minecraft.block.BlockIce;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import packedice.proxy.ClientProxy;
import packedice.proxy.CommonProxy;

@Mod(modid = PackedIce.MODID,version = PackedIce.VERSION)
public class PackedIce {
	public static final String MODID = "packedice";
	public static final String VERSION = "alpha 0.2";
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event){
		proxy.init(event);
		GameRegistry.addShapedRecipe(new ResourceLocation("icy"),new ResourceLocation("recipes"),new ItemStack(Blocks.PACKED_ICE,3),
		 new Object[]{"SSS","SSS","SSS",'S',Blocks.ICE});
		GameRegistry.addShapelessRecipe(new ResourceLocation("ice"),new ResourceLocation("recipes"), new ItemStack(Blocks.ICE,3),new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(Blocks.PACKED_ICE))});
			
		}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
		
	}
	
	
	

}
