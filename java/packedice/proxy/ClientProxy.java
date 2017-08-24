package packedice.proxy;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import packedice.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy
{
	
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
	}
	
	public void init(FMLInitializationEvent event){
		super.init(event);
		RegistryHandler.Client();
		}
	
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}

}
