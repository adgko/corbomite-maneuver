package core;


import java.util.ArrayList;

import Observer.Observer;
import Observer.Subject;
import Characters.Personaje;


/**
 * @author Diego
 *
 */
public class BaseDatos implements Subject{

	ArrayList<Personaje> lista;
	ArrayList<Personaje> listaNPC;
	ArrayList<Personaje> listaCombate;
	
	ArrayList<Observer>  observadores;
	
	public BaseDatos() {
		lista = new ArrayList<Personaje>();
		listaNPC = new ArrayList<>();
		listaCombate = new ArrayList<>();
		observadores = new ArrayList<Observer>();
		
	}

	public Personaje getPersonaje(String str){
		for (Personaje personaje : lista){
			if(personaje.toString().equals(str)) return personaje;
		}		
		for (Personaje personaje : listaNPC){
			if(personaje.toString().equals(str)) return personaje;
		}
		return null;
	}
	
	public Personaje getPersonajePorNombre(String str){
		for (Personaje personaje : lista){
			if(personaje.getNombre().toString().equals(str)) return personaje;
		}		
		for (Personaje personaje : listaNPC){
			if(personaje.getNombre().toString().equals(str)) return personaje;
		}
		return null;
	}
	
	public void borrarPersonaje(String str){
		for (Personaje personaje : lista){
			if(personaje.toString().equals(str)) lista.remove(personaje);
		}		
		for (Personaje personaje : listaNPC){
			if(personaje.toString().equals(str)) lista.remove(personaje);
		}
		for (Personaje personaje : listaCombate){
			if(personaje.toString().equals(str)) lista.remove(personaje);
		}
		this.notifyObservers();
	}
	
	public ArrayList<Personaje> getLista() {
		return lista;
	}
	
	public void addDatosNPC(Personaje pe) {
		listaNPC.add(pe);
		this.notifyObservers();
	}

	public void setLista(ArrayList<Personaje> lista) {
		this.lista = lista;
	}
	
	public void addDatos(Personaje pe) {		
		lista.add(pe);
		System.out.printf(pe.toString());
		this.notifyObservers();
	}

	public ArrayList<Personaje> getListapelea() {
		return listaCombate;
	}
	
	public void setListapelea(ArrayList<Personaje> listapelea) {
		this.listaCombate = listapelea;
	}
	
	public void addDatospelea(Personaje pe) {
		listaCombate.add(pe);
		//System.out.println(pe.toString());
		this.notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) {
		observadores.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observadores.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observador: observadores) {
			observador.update(lista, listaNPC,listaCombate);
		}
		
	}	
}
