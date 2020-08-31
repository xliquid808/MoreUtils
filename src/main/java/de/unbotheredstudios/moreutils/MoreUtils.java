package de.unbotheredstudios.moreutils;

import de.unbotheredstudios.moreutils.proxy.CommonProxy;
import de.unbotheredstudios.moreutils.util.REF;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = REF.MODID, name = REF.NAME, version = REF.VERSION)
public class MoreUtils {

    @Mod.Instance
    public static MoreUtils instance;

    @SidedProxy(clientSide = REF.CLIENT, serverSide = REF.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }
    @Mod.EventHandler
    public static void Init(FMLInitializationEvent event) {

    }
    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
