package dotblueshoes.coremod_sample.asm;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import java.util.Map;

import javax.annotation.Nullable;

//import org.apache.logging.log4j.LogManager;

@IFMLLoadingPlugin.Name("Sample Coremod")
@IFMLLoadingPlugin.MCVersion("1.12.2")
public class FMLPlugin implements IFMLLoadingPlugin {

    private final String debug = "Info: Core: ";
    
    public FMLPlugin() {
        //throw new RuntimeException();
        //LogManager.getLogger().info(debug + "Constructor!");
        System.out.println(debug + "CONSTRUCTOR");
    }

    @Override
    public String[] getASMTransformerClass() {
        System.out.println(debug + "getASMTransformerClass");
        //LogManager.getLogger().info(debug + "getASMTransformerClass!");
        return new String[]{"dotblueshoes.coremod_sample.asm.Transformer"};
        //return new String[0];
    }

    @Override 
    public String getModContainerClass() {
        System.out.println(debug + "getModContainerClass");
        //LogManager.getLogger().info(debug + "getModContainerClass!");
        return null;
    }

    @Nullable @Override
    public String getSetupClass() {
        System.out.println(debug + "getSetupClass");
        //LogManager.getLogger().info(debug + "getSetupClass!");
        return null;
    }

    @Override 
    public void injectData(Map<String, Object> data) {
        System.out.println(debug + "injectData");
        //LogManager.getLogger().info(debug + "injectData!");
    }

    @Override
    public String getAccessTransformerClass() {
        System.out.println(debug + "getAccessTransformerClass");
        //LogManager.getLogger().info(debug + "getAccessTransformerClass!");
        return null;
    }

}
