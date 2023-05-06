package player.app;

import player.app.entities.ElementoMultimediale;
import player.app.entities.Audio;
import player.app.entities.Immagine;
import player.app.entities.Video;

public class Application {

	public static void main(String[] args) {


		Audio audio1= new Audio("Pink Floyd - Shine On You Crazy Diamonds",5,13);
		Audio audio2= new Audio("The Alan Parson Project - Eye In The Sky",3,4);
		Audio audio3= new Audio("Notorious Big - Sky's the limit",6,5);
		Audio audio4= new Audio("Pink Floyd - Time",10,7);
		
		Immagine img1 = new Immagine("Foto profilo");
		Immagine img2 = new Immagine("Foto ricordo");
		Immagine img3 = new Immagine("Vacanza");
		
		Video video1 = new Video("Concerto Rock 1");
		Video video2 = new Video("Concerto Rock 2");
		Video video3 = new Video("Concerto Rock 3");
		
		ElementoMultimediale[] elementi = {audio1,img1,video1,audio2,img2,video2,audio3,img3,video3,audio4};

		for(ElementoMultimediale elemento : elementi) {
			
			riproduciElemento(elemento);
			
		}
		
	}
	
	public static void riproduciElemento(ElementoMultimediale e) {
		
		if(e instanceof Audio) {
			
			((Audio) e).abbassaVolume();
			((Audio) e).abbassaVolume();
			((Audio) e).abbassaVolume();
			((Audio) e).abbassaVolume();
			((Audio) e).abbassaVolume();
			
			((Audio) e).alzaVolume();
			((Audio) e).alzaVolume();
			((Audio) e).alzaVolume();
			
			((Audio) e).play();
			
		}
		
	}

}
