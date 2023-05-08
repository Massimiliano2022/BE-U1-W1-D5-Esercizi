package player.app;

import java.util.Scanner;

import player.app.entities.Audio;
import player.app.entities.ElementoMultimediale;
import player.app.entities.Immagine;
import player.app.entities.Video;

public class Application {

	public static void main(String[] args) {

		int numeroElementi = 5;
		boolean play = true;
		boolean aggiungiElementi = true;
		int i = 0;

		ElementoMultimediale[] elementi = new ElementoMultimediale[numeroElementi];

		Scanner scanner = new Scanner(System.in);

		while (aggiungiElementi) {
			if (i < numeroElementi) {
				System.out.println("Aggiungi elementi da poter riprodurre con questo magnifico Player Multimediale!");
				System.out.println("Che tipo di file intendi aggiungere?");
				System.out.println("1 - Audio");
				System.out.println("2 - Video");
				System.out.println("3 - Immagine");

				ElementoMultimediale element = creaElementoMultimediale(numeroElementi, scanner, elementi, i);
				if (element != null) {
					i++;
				}
			} else {
				aggiungiElementi = false;
			}
		}

		avviaPlayer(scanner, elementi, play);

		scanner.close();

	}

	private static ElementoMultimediale creaElementoMultimediale(int numeroElementi, Scanner scanner,
			ElementoMultimediale[] elementi, int i) {

		int inputMenu = scanner.nextInt();

		switch (inputMenu) {
		case 1:
			Audio audio = creaAudio(scanner);
			elementi[i] = audio;
			break;
		case 2:
			Video video = creaVideo(scanner);
			elementi[i] = video;
			break;
		case 3:
			Immagine immagine = creaImg(scanner);
			elementi[i] = immagine;
			break;
		default:
			System.out.println("Inserisci un numero da 1 a 3!");
			break;
		}
		return elementi[i];
	}

	private static void avviaPlayer(Scanner scanner, ElementoMultimediale[] elementi, boolean play) {
		do {

			int inputPlay;

			System.out.println("Quale elemento desideri riprodurre?");
			System.out.println("Inserisci un numero da 1 a 5 per riprodurre l'elemento corrispondente:");
			System.out.println("Oppure 0 per interrompere.");

			inputPlay = scanner.nextInt();

			if (inputPlay > 0 && inputPlay <= 5) {

				riproduciElemento(elementi[inputPlay - 1]);

			} else if (inputPlay == 0) {
				play = false;
			} else {
				System.out.println("Non hai inserito un input valido.");
			}

		} while (play);

	}

	public static Audio creaAudio(Scanner scanner) {

		scanner.nextLine();

		System.out.println("Inserisci il titolo:");
		String titolo = scanner.nextLine();

		System.out.println("Inserisci la durata:");
		int durata = scanner.nextInt();

		Audio audio = new Audio(titolo, durata);

		return audio;
	}

	public static Video creaVideo(Scanner scanner) {

		scanner.nextLine();

		System.out.println("Inserisci il titolo:");
		String titolo = scanner.nextLine();

		System.out.println("Inserisci la durata:");
		int durata = scanner.nextInt();

		Video video = new Video(titolo, durata);

		return video;
	}

	public static Immagine creaImg(Scanner scanner) {

		scanner.nextLine();

		System.out.println("Inserisci il titolo:");
		String titolo = scanner.nextLine();

		Immagine immagine = new Immagine(titolo);

		return immagine;
	}

	public static void riproduciElemento(ElementoMultimediale e) {

		if (e instanceof Audio) {

			((Audio) e).play();

		} else if (e instanceof Video) {

			((Video) e).play();

		} else if (e instanceof Immagine) {

			((Immagine) e).show();

		}

	}
}
