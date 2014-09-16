package edu.cmich.minecraftexercise.util;

import org.apache.logging.log4j.Level;

import cpw.mods.fml.common.FMLLog;
import edu.cmich.minecraftexercise.MinecraftExercise;

public class Log {

	public static void log(Level level, String msg) {
		FMLLog.log(MinecraftExercise.MODID, level, msg);
	}

	public static void error(String msg) {
		log(Level.ERROR, msg);
	}

	public static void info(String msg) {
		if(MinecraftExercise.debug) log(Level.INFO, msg);
	}

	public static void warn(String msg) {
		log(Level.WARN, msg);
	}

	public static String coordToString(int x, int y, int z) {
		return x + " " + y + " " + z;
	}
}
