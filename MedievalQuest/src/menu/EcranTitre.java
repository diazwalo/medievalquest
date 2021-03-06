package menu;

import interaction.Saisie;

public class EcranTitre {
	public static void showHomeScreen() {
		Saisie.clearScreenOpti();
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
				"          Appuyez sur ENTER pour jouer ou tapez Q pour quitter : ";
		
		if(Saisie.pressEnterToStartAndQToQuit(messageToShow, true, "q")) {
			Saisie.clearScreenOpti();
		} else {
			System.exit(0);
		}
		
	}
	

}
