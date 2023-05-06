package player.app.entities;

public class Audio extends ElementoMultimediale implements Player {

	private final static int maxVolume = 10;
	private int volume;
	private int durata;

	public Audio(String titolo, int volume, int durata) {
		super(titolo);
		this.setVolume(volume);
		this.setDurata(durata);
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

	@Override
	public void play() {

		String riproduzione = "";

		for (int i = 0; i < durata; i++) {
			riproduzione = getTitolo()+ " ";
			for (int j = 0; j < volume; j++) {
				riproduzione += "!";
			}
			System.out.println(riproduzione);
		}
	}
}
