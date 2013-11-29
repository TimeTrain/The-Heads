package de.liz.theheads.main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class DeathListener implements Listener
{

	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event)
	{
		Player victim = event.getEntity();
		
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
		SkullMeta meta = (SkullMeta) skull.getItemMeta();
		meta.setOwner(victim.getName());
		meta.setDisplayName(victim.getName());
		skull.setItemMeta(meta);
		
		victim.getWorld().dropItemNaturally(victim.getLocation(), skull);
	}
	
}
