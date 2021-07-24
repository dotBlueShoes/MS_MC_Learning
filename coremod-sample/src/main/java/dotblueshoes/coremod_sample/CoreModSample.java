package dotblueshoes.coremod_sample;

//import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = CoreModSample.MODID, version = CoreModSample.VERSION, useMetadata = true, clientSideOnly = true)
public class CoreModSample {

    public static final String MODID = "coremod_sample";
    public static final String VERSION = "1";

    public static final Logger logger = LogManager.getLogger(MODID);

    private final String debug = "Info: Main: ";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LogManager.getLogger().info(debug + "PreInit!");
        //logger = event.getModLog();r
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LogManager.getLogger().info(debug + "Init!");
    }
}
