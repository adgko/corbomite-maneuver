package VistaCharacters;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Characters.Guerrero;
import Dados.Dado;
import Vistas.VistaMain;

public class VistaGuerrero1 {
	JFrame 	ventana;
	JPanel 	panelCharacter;
	JButton guardar;
	JLabel  tipo;
	JTextField type;
	JLabel 	nombre;
	JTextField name;
	JLabel	categoría;
	JTextField category;
	JLabel	arma;
	JTextField weapon;
	JLabel	sexo;
	JTextField sex;
	JLabel	habilidad;
	JTextField ability;
	JButton boton1;
	JLabel	pelea;
	JTextField fight;
	JButton boton2;
	JLabel	astucia;
	JTextField clever;
	JButton boton3;
	JLabel  salud;
	JTextField health;
	JButton borrar;
	JButton atacar;
	JTextField resultadoataque;
	JLabel ataque;
	JTextField resultadodaño;
	JLabel daño;
	
	

	public VistaGuerrero1() {
		ventana = new JFrame();
		ventana.setTitle("Personaje");
		panelCharacter = new JPanel();
		ventana.add(panelCharacter);
		guardar = new JButton("Guardar");
		boton1 = new JButton("roll");
		boton2 = new JButton("roll");
		boton3 = new JButton("roll");
		borrar = new JButton("Borrar");
		atacar = new JButton("Atacar");		
		panelCharacter.setLayout(null);
		
		tipo = new JLabel("tipo :");
		type = new JTextField();
		nombre = new JLabel("nombre: ");
		name = new JTextField();
		categoría = new JLabel("categoría: ");
		category = new JTextField();
		sexo = new JLabel("sexo: ");
		sex = new JTextField();
		arma = new JLabel("arma :");
		weapon = new JTextField();
		habilidad = new JLabel("habilidad ");
		ability = new JTextField();
		pelea = new JLabel("pelea: ");
		fight = new JTextField();
		astucia = new JLabel("astucia: ");
		clever = new JTextField();
		salud = new JLabel("Salud: ");
		health = new JTextField();
		resultadoataque = new JTextField("0000");
		ataque = new JLabel("ataque");
		resultadodaño = new JTextField("0000");
		daño = new JLabel("daño");
		//panelCharacter.add(tipo);
		//panelCharacter.add(type);
		panelCharacter.add(resultadoataque);
		panelCharacter.add(resultadodaño);
		panelCharacter.add(nombre);
		panelCharacter.add(name);
		panelCharacter.add(categoría);
		panelCharacter.add(category);
		panelCharacter.add(sexo);
		panelCharacter.add(sex);
		panelCharacter.add(arma);
		panelCharacter.add(weapon);
		panelCharacter.add(habilidad);
		panelCharacter.add(ability);
		panelCharacter.add(pelea);
		panelCharacter.add(fight);
		panelCharacter.add(astucia);
		panelCharacter.add(clever);
		panelCharacter.add(salud);
		panelCharacter.add(health);
		panelCharacter.add(guardar);
		panelCharacter.add(boton1);
		panelCharacter.add(boton2);
		panelCharacter.add(boton3);
		panelCharacter.add(borrar);
		panelCharacter.add(atacar);
		panelCharacter.add(ataque);
		panelCharacter.add(daño);
		ataque.setBounds(50,370,40,20);
		daño.setBounds(180,370,40,20);
		atacar.setBounds(10,300,80,40);
		resultadoataque.setBounds(10,350,125,20);
		resultadodaño.setBounds(140,350,125,20);
		borrar.setBounds(100,300,80,40);
		tipo.setBounds(10, 10, 60, 20);
		type.setBounds(70, 10, 60, 20);
		nombre.setBounds(10, 50, 60, 20);
		name.setBounds(70, 50, 80, 20);
		categoría.setBounds(10, 80, 60, 20);
		category.setBounds(70, 80, 80, 20);
		sexo.setBounds(10, 110, 60, 20);
		sex.setBounds(70, 110, 80, 20);
		arma.setBounds(10,140,60,20);
		weapon.setBounds(70,140,80,20);
		habilidad.setBounds(10, 170, 60, 20);
		ability.setBounds(70, 170, 60, 20);
		//boton1.setBounds(140, 140, 60, 20);
		pelea.setBounds(10, 200, 60, 20);
		fight.setBounds(70, 200, 60, 20);
		//boton2.setBounds(140, 170, 60, 20);
		astucia.setBounds(10, 230, 60, 20);
		clever.setBounds(70, 230, 60, 20);
		//boton3.setBounds(140, 200, 60, 20);
		salud.setBounds(10, 260, 60, 20);
		health.setBounds(70, 260, 60, 20);
		guardar.setBounds(190,300,80,40);
		
		
		name.setText(VistaMain.getGuerrero1().getNombre());
		sex.setText(VistaMain.getGuerrero1().getSexo());
		category.setText("categoría");
		weapon.setText(VistaMain.getGuerrero1().getArma());
		ability.setText(Float.toString(VistaMain.getGuerrero1().getHabilidad()));
		fight.setText(Float.toString(VistaMain.getGuerrero1().getPelea()));
		clever.setText(Float.toString(VistaMain.getGuerrero1().getAstucia()));
		health.setText(Float.toString(VistaMain.getGuerrero1().getSalud()));
		
		guardar.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 //Guerrero g = new Guerrero(name.getText(), category.getText(), weapon.getText(), sex.getText(), Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()));
	        	 //VistaMain.setGuerrero1(g);
	        	 VistaMain.getGuerrero1().setNombre(name.getText());
	        	 VistaMain.getGuerrero1().setCategoría(category.getText());
	        	 VistaMain.getGuerrero1().setArma(weapon.getText());
	        	 VistaMain.getGuerrero1().setHabilidad(Integer.parseInt(ability.getText()));
	        	 VistaMain.getGuerrero1().setPelea(Integer.parseInt(fight.getText()));
	        	 VistaMain.getGuerrero1().setAstucia(Integer.parseInt(clever.getText()));
	        	 VistaMain.getGuerrero1().setSalud(Integer.parseInt(health.getText()));
	         }
		});/*
		boton1.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(10)+5;
	        	 ability.setText(Float.toString(num));
	         }
		});
		boton2.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(10)+5;
	        	 fight.setText(Float.toString(num));
	         }
		});
		boton3.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(10)+5;
	        	 clever.setText(Float.toString(num));
	         }
		});*/
		borrar.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 VistaMain.getGuerrero1().setNombre("noname");
	        	 VistaMain.getGuerrero1().setCategoría("guerrero");
	        	 VistaMain.getGuerrero1().setArma("noweapon");
	        	 VistaMain.getGuerrero1().setHabilidad(Integer.parseInt("0"));
	        	 VistaMain.getGuerrero1().setPelea(Integer.parseInt("0"));
	        	 VistaMain.getGuerrero1().setAstucia(Integer.parseInt("0"));
	        	 VistaMain.getGuerrero1().setSalud(Integer.parseInt("20"));
	        	 
	        	 
	         }
		});
		atacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dado dado = new Dado();
				resultadoataque.setText(Float.toString(dado.tirarDado(20)));
				if(VistaMain.getGuerrero1().getArma()=="Espada") {
					resultadodaño.setText(Float.toString(dado.tirarDado(10)));
				}else if(VistaMain.getGuerrero1().getArma()=="Arco") {
					resultadodaño.setText(Float.toString(dado.tirarDado(6)));
				}else if(VistaMain.getGuerrero1().getArma()=="Cetro") {
					resultadodaño.setText(Float.toString(dado.tirarDado(8)));
				}else 
					resultadodaño.setText(Float.toString(dado.tirarDado(4)));
			}
		}
				);
		
		
		ventana.setSize(new Dimension(300,450));
		ventana.setVisible(true);
	}
}
