package inet.pixel.deadlyfe;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import inet.pixel.deadlyfe.entities.Human;
import inet.pixel.deadlyfe.entities.Infected;
import inet.pixel.deadlyfe.entities.Infected.InfectedType;
import inet.pixel.deadlyfe.listeners.PlayerJoin;

public class DeadLyfe extends JavaPlugin {

	public Map<String, Human> humans = new HashMap<>();
	public Map<String, Infected> zombies = new HashMap<>();

	public void onEnable() {
		this.loadPlayerStatData();

		System.out.println("Loading listeners...");
		this.getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);

		System.out.println("DeadLyfe Is Now Loaded.. Enjoy!");
	}

	public void onDisable() {
		this.humans.clear();
		this.zombies.clear();
	}

	private void loadPlayerStatData() {
		System.out.println("Loading previous player data...");
		// Get config values.
		// load into map and boomssdjngfsd.

		System.out.println("Loaded -> (amount here) files.");
		System.out.println("Done.");
	}

	public Human createPlayerStatData(Player player) {
		Human data = new Human(player.getName());
		humans.put(player.getName(), data);
		return data;
	}

	public Infected createInfectedStatData(Player player, int level, int prestige, InfectedType type) {
		Infected data = new Infected(player.getName(), level, prestige, type);
		zombies.put(player.getName(), data);
		return data;
	}

	public boolean hasPlayerStatData(Player player) {
		return humans.containsKey(player.getName());
	}

	public boolean hasInfectedStatData(Player player) {
		return zombies.containsKey(player.getName());
	}

	public boolean hasAnyData(Player player) {
		return humans.containsKey(player.getName()) || zombies.containsKey(player.getName());
	}

	public boolean removeInfectedData(Player player) {
		if (hasInfectedStatData(player)) {
			this.zombies.remove(player.getName());
			return true;
		}
		return false;
	}

	public boolean removePlayerData(Player player) {
		if (hasPlayerStatData(player)) {
			this.humans.remove(player.getName());
			return true;
		}
		return false;
	}

	public void removeData(Player player) {
		if (hasInfectedStatData(player)) {
			this.zombies.remove(player.getName());
		}

		if (hasPlayerStatData(player)) {
			this.humans.remove(player.getName());
		}
	}

}
