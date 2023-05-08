package player.app.entities;

public class Immagine extends ElementoMultimediale implements Showable {

	private final static int maxLuminosita = 10;
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.setLuminosita(luminosita);
	}

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
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
	public void show() {

		String riproduzione = getTitolo() + " ";

		for (int i = 0; i < luminosita; i++) {
			riproduzione += "*";
		}
		System.out.println(riproduzione);
	}

}
