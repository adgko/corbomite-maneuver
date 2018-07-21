package Dados;

import java.util.Random;

public class Dado {

	Random dado;
	public Dado() {dado = new Random();}
		
		public int tirarDado(int a) {
			return dado.nextInt(a)+1;
				
			}
	

	}

