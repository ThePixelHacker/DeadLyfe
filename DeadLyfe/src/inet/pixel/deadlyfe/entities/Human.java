package inet.pixel.deadlyfe.entities;

public class Human {

	private String name;
	private int level;
	private int kills, deaths;
	private int prestige;

	public Human(String name) {
		this.name = name;
		this.level = 1;
		this.prestige = 0;
		this.kills = 0;
		this.deaths = 0;
	}

	// For loading previous players.
	public Human(String name, int level, int prestige, int kills, int deaths) {
		this.name = name;
		this.level = level;
		this.prestige = prestige;
		this.kills = kills;
		this.deaths = deaths;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLevel(int lvl) {
		this.level = lvl;
	}

	public void setPrestige(int pres) {
		this.prestige = pres;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getPrestige() {
		return prestige;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
}
