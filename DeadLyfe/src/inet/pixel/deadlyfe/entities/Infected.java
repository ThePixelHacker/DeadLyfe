package inet.pixel.deadlyfe.entities;

public class Infected {

	private String name;
	private int kills, deaths;
	private int level, prestige;
	private InfectedType type;

	// For creating zambies muhahahaha.
	public Infected(String name, int level, int prestige, InfectedType type) {
		this.name = name;
		this.level = level;
		this.prestige = prestige;
		this.type = type;
		this.kills = 0;
		this.deaths = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPrestige() {
		return prestige;
	}

	public void setPrestige(int prestige) {
		this.prestige = prestige;
	}

	public InfectedType getType() {
		return type;
	}

	public void setType(InfectedType type) {
		this.type = type;
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

	public enum InfectedType {
		ALPHA, REGULAR;
	}

}
