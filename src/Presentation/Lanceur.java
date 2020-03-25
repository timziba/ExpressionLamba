package Presentation;

import service.IJeu;
import service.JeuService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JeuService jeu = new JeuService();
		
	/*	jeu.savoirNager(new IJeu() {

			@Override
			public void nager() {
				// TODO Auto-generated method stub
				 System.out.println("je sais jouer et nager");
			}

	});
		
		*/
		
		jeu.savoirNager(()-> {
				// TODO Auto-generated method stub
				 System.out.println("je sais jouer ");
			

	});
	}

}
