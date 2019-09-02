package affichage;

import util.EStat;
import util.Statistique;

public class Hud {
	private Statistique[] stats = new Statistique[4];	
	
	public Hud(int vie, int attaque, int defense, int argent) {
		this.stats[0] = new Statistique(vie, EStat.VIE);
		this.stats[1] = new Statistique(attaque, EStat.ATK);
		this.stats[2] = new Statistique(defense, EStat.DEF);
		this.stats[3] = new Statistique(argent, EStat.ARG);
	}
	
	public Hud() {
		this(10, 10, 10, 10);
	}
	
	public Statistique[] getStats() {
		return stats;
	}

	public String toString() {
		return stats[0].toString() + "          |          "
	+ stats[1].toString() + "          |          "
				+ stats[2].toString() + "          |          "
	+ stats[3].toString() + "\n\n----------------------------------------------------------------------------";
	}
}
