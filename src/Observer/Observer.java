package Observer;

import java.util.ArrayList;
import Characters.Personaje;

public interface Observer {
	public void update(ArrayList<Personaje> listaPersonajes, ArrayList<Personaje> listaNPC, ArrayList<Personaje> listaCombate);
}
