package meh.the1gamers.plugins.carepackage;

import meh.the1gamers.plugins.carepackage.api.CarePackageAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class CarePackagePlugin extends JavaPlugin
{	
	public StringBuilder b = new StringBuilder();
	public static boolean example = true;
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
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("carepkg"))
		{
			if(args[0].equalsIgnoreCase("give"))
			{
				if(args.length==1)
				{
					
				}
				
			} else if (args[0].equalsIgnoreCase("list")){
				sender.sendMessage(ChatColor.YELLOW + "List of carepackages:" + CarePackageAPI.carepackages.toString());
				return true;
			}
			sender.sendMessage(ChatColor.RED + "---HELP---");
			sender.sendMessage(ChatColor.YELLOW + "/carepkg give <carepackagename> [player] -- " + ChatColor.GREEN + "Gives a carepackage to the sender of name");
			sender.sendMessage(ChatColor.YELLOW + "/carepkg list -- " + ChatColor.GREEN + "Shows a list of Care Packages");
		}
		return false;
		
	}
	
}
