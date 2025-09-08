package me.lagbug.emailer.spigot.api;

import jakarta.mail.Session;
import me.lagbug.emailer.spigot.Emailer;
import org.bukkit.OfflinePlayer;

import java.util.Map;

public class EmailerAPI {

	private final Emailer plugin = Emailer.getPlugin(Emailer.class);
	
	public Map<OfflinePlayer, String> getPending() {
		return plugin.getPending();
	}
	
	public Session getSession() {
		return plugin.getSession();
	}
}
