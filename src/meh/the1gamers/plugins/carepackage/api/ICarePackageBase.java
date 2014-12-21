package meh.the1gamers.plugins.carepackage.api;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public abstract interface ICarePackageBase
{
	public String carePackageName = null;
	
	public List<ItemStack> items = null;
	
	public abstract void randomize();
	
	public void createCarePackage(Location loc);
}
