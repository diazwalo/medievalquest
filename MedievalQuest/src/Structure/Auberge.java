package Structure;

import java.util.Random;

import interaction.AsciiArt;

public class Auberge {
	public static int gainVieDormir = 20;
	
	public static final Random R = new Random();
	
	
	
	
	
	public void getImage() {
		AsciiArt.auberge();
	}
	
	public static void dormirAuberge(Personnage p) {
		int pv = p.getVie();
		p.getHud().setVie(pv + gainVieDormir);
		System.out.println("Vous avez gagn� 20 points de vie!");
		
		int tmp = R.nextInt(4);
		System.out.println(tmp);
		if(tmp == 1) {
			int argent = p.getArg();
			argent = argent /3 *2;
			p.getHud().setArgent(argent);
			System.out.println("Vous vous �tes fait d�pouiller !");
		}
		
	}
	
	public static void pillerAuberge(Personnage p) {
		int tmp = R.nextInt(3);
		
		if(tmp == 1) {
			int pv = p.getVie();
			p.getHud().setVie(pv-10);
			System.out.println("Les propri�taires de l'auberge �taient bien arm�s !");
			System.out.println("Vous perdez 10 pv");
		}
		
		if(tmp == 2) {
			int def = p.getDef();
			p.getHud().setDefense(def + 5); 
			System.out.println("Vous avez trouv� un bouclier en bois !");
			System.out.println("Vous avez gagn� 5 points de d�fense");
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Heros p = new Heros();
		Auberge a = new Auberge();
		
		System.out.println(p.getHud());
		
		a.getImage();
		a.dormirAuberge(p);
		System.out.println(p.getHud());
	}
	

}
