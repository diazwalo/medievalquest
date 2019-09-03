package menu;

import java.util.Scanner;

import interaction.Saisie;

public class EcranTitre {
	public static void showHomeScreen() {
		String messageToShow ="\n\n\n\n"+ 
				"       ▄▄▄▄███▄▄▄▄      ▄████████ ████████▄   ▄█     ▄████████  ▄█    █▄     ▄████████  ▄█            ████████▄   ███    █▄     ▄████████    ▄████████     ███          \r\n" + 
				"      ▄██▀▀▀███▀▀▀██▄   ███    ███ ███   ▀███ ███    ███    ███ ███    ███   ███    ███ ███            ███    ███  ███    ███   ███    ███   ███    ███ ▀█████████▄      \r\n" + 
				"      ███   ███   ███   ███    █▀  ███    ███ ███▌   ███    █▀  ███    ███   ███    ███ ███            ███    ███  ███    ███   ███    █▀    ███    █▀     ▀███▀▀██      \r\n" + 
				"      ███   ███   ███  ▄███▄▄▄     ███    ███ ███▌  ▄███▄▄▄     ███    ███   ███    ███ ███            ███    ███  ███    ███  ▄███▄▄▄       ███            ███   ▀      \r\n" + 
				"      ███   ███   ███ ▀▀███▀▀▀     ███    ███ ███▌ ▀▀███▀▀▀     ███    ███ ▀███████████ ███            ███    ███  ███    ███ ▀▀███▀▀▀     ▀███████████     ███          \r\n" + 
				"      ███   ███   ███   ███    █▄  ███    ███ ███    ███    █▄  ███    ███   ███    ███ ███            ███    ███  ███    ███   ███    █▄           ███     ███          \r\n" + 
				"      ███   ███   ███   ███    ███ ███   ▄███ ███    ███    ███ ███    ███   ███    ███ ███▌    ▄      ███  ▀ ███  ███    ███   ███    ███    ▄█    ███     ███          \r\n" + 
				"       ▀█   ███   █▀    ██████████ ████████▀  █▀     ██████████  ▀██████▀    ███    █▀  █████▄▄██       ▀██████▀▄█ ████████▀    ██████████  ▄████████▀     ▄████▀        \r\n" + 
				"                                                                                   ▀                                                                                " +
				"\n\n\n\n" +
				"          Appuyez sur ENTER pour jouer";
		
		Saisie.pressEnter(messageToShow, true);
		Saisie.clearScreenOpti();
	}
	

}
