package dotblueshoes.coremod_sample.asm;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.*;
//import org.objectweb.asm.tree.*;

import org.apache.logging.log4j.LogManager;

public class Transformer implements IClassTransformer {
	
	@Override
	public byte[] transform(String name, String transformedName, byte[] basicClass) {

		final String blockLiquidPackage = "net/minecraft/block/BlockLiquid";

		// So we're giving the Reader the class to read from.
		ClassReader reader = new ClassReader(basicClass);

		LogManager.getLogger().info("\n\tclass: " + reader.getClassName() + "\n\tsuper: " + reader.getSuperName()
				+ "\n\tintefaces: " + reader.getInterfaces() + '\n');

		if (reader.getSuperName().equals(blockLiquidPackage)) {
			LogManager.getLogger().info("\n\tclass: " + reader.getClassName());
		}

		return basicClass;
	}

}
