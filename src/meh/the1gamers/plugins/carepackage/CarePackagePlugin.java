package meh.the1gamers.plugins.carepackage;

import meh.the1gamers.plugins.carepackage.api.CarePackageAPI;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CarePackagePlugin extends JavaPlugin
{	
	@Override
	public void onEnable()
	{
		Bukkit.getLogger().info("[CarePackageAPI] Starting API v1.0");
		Bukkit.getLogger().info("[CarePackageAPI] Checking for Custom CarePackages");
		CarePackageAPI.init();
	}
	
	@Override
	public void onDisable()
	{
		
	}
}
