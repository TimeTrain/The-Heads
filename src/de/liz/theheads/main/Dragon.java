package de.liz.theheads.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Dragon extends JavaPlugin
{

	private static Dragon dragon = new Dragon();
	public Logger logger = Bukkit.getLogger();
	public PluginDescriptionFile config;
	
	public Dragon()
	{
		
	}
	
	public static Dragon getPlugin()
	{
		return dragon;
	}
	
	@Override
	public void onEnable()
	{
		logger.info("Finished Loading The Heads!");
		config = getDescription();
		
		this.getServer().getPluginManager().registerEvents(new DeathListener(), this);
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
}
