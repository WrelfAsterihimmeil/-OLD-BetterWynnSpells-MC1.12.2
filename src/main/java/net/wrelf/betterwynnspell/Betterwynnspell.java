package net.wrelf.betterwynnspell;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wrelf.betterwynnspell.Events.EventManager;
import net.wrelf.betterwynnspell.inputs.KeyInputHandler;
import net.wrelf.betterwynnspell.proxy.ClientProxy;
import net.wrelf.betterwynnspell.proxy.CommonProxy;

@Mod(
        modid = Betterwynnspell.MOD_ID,
        name = Betterwynnspell.MOD_NAME,
        version = Betterwynnspell.VERSION
)
public class Betterwynnspell {

    public static final String MOD_ID = "betterwynnspell";
    public static final String MOD_NAME = "BetterWynnSpell";
    public static final String VERSION = "1.0.0";

    @Mod.Instance(MOD_ID)
    public static Betterwynnspell INSTANCE;

    public static final String CLIENT_PROXY = "net.wrelf.betterwynnspell.proxy.ClientProxy";

    @SidedProxy(clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        //EventManager.registerHandler();
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
