package edu.cmich.minecraftexercise;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = MinecraftExercise.MODID, name = MinecraftExercise.NAME, version = MinecraftExercise.VERSION)
public class MinecraftExercise
{
	public static final String MODID = "MCEX";
	public static final String NAME = "Minecraft Exercise";
	public static final String VERSION = "0.0.1";

	public static boolean debug = true;


	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void serverStarted(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new Command());
	}
}
