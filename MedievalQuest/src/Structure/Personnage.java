package Structure;

import affichage.Hud;
import interaction.AsciiArt;
import interaction.Saisie;
import util.EStat;
import util.Effet;
import util.Statistique;

public abstract class Personnage {
	private Hud hud;
	private boolean attaque = false;
	
	public Personnage(int vie, int atk, int def, int arg) {
		this.hud = new Hud(vie, atk, def, arg);
	}
	
	public Personnage() {
		this.hud = new Hud();
	}
	
	public int getVie() {
		return this.hud.getStats()[0].getValue();
	}
	
	public int getAtk() {
		return this.hud.getStats()[1].getValue();
	}
	
	public int getDef() {
		return this.hud.getStats()[2].getValue();
	}
	
	public int getArg() {
		return this.hud.getStats()[3].getValue();
	}
	
	public void setVie(int vie) {
		hud.setVie(vie);
	}
	
	public void setAttaque(int attaque) {
		hud.setAttaque(attaque);
	}
	
	public void setDefense(int defense) {
		hud.setDefense(defense);
	}
	
	public void setArgent(int argent) {
		hud.setArgent(argent);
	}
	
	public Statistique getStatValue(EStat stat) {
		for(int i = 0; i < hud.getStats().length; i++) {
			if(hud.getStats()[i].getStat() == stat) return hud.getStats()[i];
		}
		return null;
	}
	
	public void doEffet(Effet effet) {
		if(!isAttaque()) {
			
			if(getDef() < effet.getVal()) {
				getStatValue(effet.getStat()).add(-(effet.getVal()-getDef()));
			}
		}else {
			getStatValue(effet.getStat()).add(-effet.getVal());
		}
	}
	
	
	public Hud getHud() {
		return hud;
	}

	public void setHud(Hud hud) {
		this.hud = hud;
	}

	public void choseClasse() {
		Saisie.clearScreenOpti();
		System.out.println("Quelle classe voulez-vous incarner ?");
		System.out.println("   1 - Chevalier : 30 "+EStat.VIE.getSymbole()+", 5  "+ EStat.ATK.getSymbole() +", 5  "+ EStat.DEF.getSymbole() +", 20 "+EStat.ARG.getSymbole()+".");
		System.out.println("   2 - Assasin   : 20 "+EStat.VIE.getSymbole()+", 15 "+ EStat.ATK.getSymbole() +", 5  "+ EStat.DEF.getSymbole() +", 20 "+EStat.ARG.getSymbole()+".");
		System.out.println("   3 - Tank      : 20 "+EStat.VIE.getSymbole()+", 5  "+ EStat.ATK.getSymbole() +", 15 "+ EStat.DEF.getSymbole() +", 20 "+EStat.ARG.getSymbole()+".");
		System.out.println("   4 - Noble     : 5  "+EStat.VIE.getSymbole()+", 5  "+ EStat.ATK.getSymbole() +", 20 "+ EStat.DEF.getSymbole()+", 30 "+EStat.ARG.getSymbole()+".");
		String saisie = Saisie.saisie("", 4);
		int saisieToString = Saisie.stringToInt(saisie);
		String nomClasse = "";
		 
		if(saisieToString == 1) {
			this.setHud(new Hud(30, 5, 5, 20));
			nomClasse = "Chevalier";
		}else if(saisieToString == 2) {
			this.setHud(new Hud(20, 15, 5, 20));
			nomClasse = "Assassin";
		}else if(saisieToString == 3) {
			this.setHud(new Hud(20, 5, 15, 20));
			nomClasse = "Tank";
		}else if(saisieToString == 4) {
			this.setHud(new Hud(5, 5, 20, 30));
			nomClasse = "Noble";
		}
		
		Personnage.afficherPersonnageDebut(nomClasse);
	}
	
	private static void afficherPersonnageDebut(String nomClasse) {
		// TODO Auto-generated method stub
		Saisie.clearScreenOpti();
		AsciiArt.hero();
		Saisie.pressEnter("\n     Voici votre " + nomClasse + " ! ", false);
		
	}

	public boolean isAttaque() {
		return attaque;
	}

	public void setAttaqueBool(boolean attaque) {
		this.attaque = attaque;
	}
	
}
