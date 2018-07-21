/**
 * 
 */
package core;


import java.util.ArrayList;
import java.util.Vector;

import Characters.Pícaro;
import Characters.Guerrero;
import Characters.Mago;
import Characters.Personaje;
import Characters.Aventurero;


/**
 * @author Diego
 *
 */
public class BaseDatos {

	ArrayList<Personaje> lista;
	//ArrayList<NPC>		 listaNPC;
	ArrayList<Guerrero>  listaG;
	ArrayList<Pícaro> 	 listaP;
	ArrayList<Mago> 	 listaM;
	Vector<Aventurero> 	 listaN;
	
	public BaseDatos() {
		listaG = new ArrayList<Guerrero>();
		listaP = new ArrayList<Pícaro>();
		listaM = new ArrayList<Mago>();
		//listaN = new ArrayList<NPC>();
		listaN = new Vector<Aventurero>();
		lista = new ArrayList<>();
		//listaNPC = new ArrayList<>();
		
	}

	public ArrayList<Personaje> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Personaje> lista) {
		this.lista = lista;
	}
	public void addDatos(Personaje pe) {
		
		lista.add(pe);
		System.out.printf(pe.toString());
	}

	public ArrayList<Guerrero> getlistG() {
		return listaG;
	}
	public void setListG(ArrayList<Guerrero> g) {
		this.listaG=g;
	}
	public void addDatosG(Guerrero g) {
		
		listaG.add(g);
	}
	
	public ArrayList<Pícaro> getlistA() {
		return listaP;
	}
	public void setListA(ArrayList<Pícaro> p) {
		this.listaP=p;
	}
	public void addDatosA(Pícaro p) {
		
		listaP.add(p);
	}
	
	public ArrayList<Mago> getlistM() {
		return listaM;
	}
	public void setListM(ArrayList<Mago> m) {
		this.listaM=m;
	}
	public void addDatosM(Mago m) {
		
		listaM.add(m);
	}

	public Vector<Aventurero> getListaN() {
		return listaN;
	}

	public void setListaN(Vector<Aventurero> listaN) {
		this.listaN = listaN;
	}
	public void addDatosN(Aventurero n) {
		listaN.add(n);
	}
	
}
