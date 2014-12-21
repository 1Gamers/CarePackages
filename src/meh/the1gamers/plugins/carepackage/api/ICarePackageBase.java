package meh.the1gamers.plugins.carepackage.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract interface ICarePackageBase
{
	public String carePackageName = null;
	
	public List<ItemStack> items = null;
	
	public abstract void randomize(Player p);
	
	public void createCarePackage(Location loc, Player p);
	
	public void createItems();
	
	public void load();
}
