package player.app.entities;

public class Video extends ElementoMultimediale implements Playable, Showable {

	private final static int maxVolume = 10;
	private final static int maxLuminosita = 10;
	private int volume;
	private int durata;
	private int luminosita;

	public Video(String titolo, int volume, int durata, int luminosita) {
		super(titolo);
		this.setVolume(volume);
		this.setDurata(durata);
		this.setLuminosita(luminosita);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	public int abbassaVolume() {

		if (volume == 0) {
			System.out.println("Il volume è al minimo.ALZARE IL VOLUME");
		} else {

			volume -= 1;

		}
		return volume;
	}

	public int alzaVolume() {

		if (volume == maxVolume) {
			System.out.println("Il volume è già al MASSIMO.");
		} else {
			volume += 1;
		}

		return volume;
	}

	public int abbassaLuminosita() {

		if (luminosita == 0) {
			System.out.println("La luminosita è al minimo.ALZARE LA LUMINOSITA'.");
		} else {

			luminosita -= 1;

		}
		return luminosita;
	}

	public int alzaLuminosita() {

		if (luminosita == maxLuminosita) {
			System.out.println("La luminosità è già al MASSIMO.");
		} else {
			luminosita += 1;
		}

		return luminosita;
	}

	@Override
	public void play() {
		String riproduzione = "";

		for (int i = 0; i < durata; i++) {
			riproduzione = getTitolo() + " ";
			for (int j = 0; j < volume; j++) {
				riproduzione += "!";
			}
			for (int y = 0; y < luminosita; y++) {
				riproduzione += "*";
			}
			System.out.println(riproduzione);
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}
}
