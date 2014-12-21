package meh.the1gamers.plugins.carepackage.api;

import java.util.List;
import java.util.Random;

import meh.the1gamers.plugins.carepackage.CarePackagePlugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class CarePackageBase implements ICarePackageBase, Listener{

	public String carePackageName = "Example";
	public List<ItemStack> items;
	public ItemStack item1 = new ItemStack(Material.BOW);
	public ItemStack item2 = new ItemStack(Material.IRON_AXE);
	public ItemStack item3 = new ItemStack(Material.APPLE, 5);
	public ItemStack item4 = new ItemStack(Material.COAL_BLOCK);
	public ItemStack item5 = new ItemStack(Material.ENDER_PEARL, 4);
	public ItemStack item6 = new ItemStack(Material.COBBLESTONE, 8);
	
	public int num1;
	public int num2;
	public int num3;
	
	public CarePackageBase()
	{
		load();
	}
	
	/**
	 * <strong>Randomizes a Care Package and returns an ID to the console</strong>
	 * The ID will be 1 number less than the amount of items ex: 032, 530 
	 * 
	 * @param Player p
	 * @author The_1_gamers
	 */	
	@Override
	public void randomize(Player p)
	{
		//Do one number less then your items that can be obtained in the care package
		Random r = new Random();
		
		num1 = r.nextInt(5);
		num2 = r.nextInt(5);
		num1 = r.nextInt(5);
		
		Bukkit.getLogger().info("[CarePackageAPI]" + carePackageName +" Care Package ID: "+ num1 + "," + num2 + "," + num3 + " Created By Player :" + p.getName());
	}

	@Override
	public void createCarePackage(Location loc, Player p)
	{
		randomize(p);
		
	}

	
	/**
	 * <strong>This method is for enchanting items and adding metadata</strong>
	 * 
	 * @author The_1_gamers
	 */
	@Override
	public void createItems()
	{
		//Nothing to enchant
		
	}

	@Override
	public void load()
	{
		if(CarePackagePlugin.example=true)
		{
		CarePackageAPI.carepackages.add(carePackageName);
		createItems();
		Bukkit.getLogger().info("[CarePackageAPI] Added Care Package Example");
		}
		
	}

}
