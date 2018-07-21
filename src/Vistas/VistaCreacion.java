package Vistas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Characters.Pícaro;
import Characters.Guerrero;
import Characters.Mago;
import Characters.Aventurero;
import Characters.Personaje;
import core.BaseDatos;
import Vistas.VistaMain;

public class VistaCreacion  {
	JFrame 		ventana;
	JPanel 		panelDatos;
	//JLabel  	tpe;
	JComboBox 	type;
	String		tipo;
	//JLabel  	nme;
	JTextField 	name;
	String  	nombre;
	JComboBox category;
	String  	categoría;
	//JLabel  	wpon;
	JComboBox 	weapon;
	String  	arma;
	//JLabel  	se;
	JComboBox 	sex;
	String  	sexo;
	//JLabel  	bilty;
	JTextField 	ability;
	int	    	habilidad;
	//JLabel  	fht;
	JTextField 	fight;
	int			pelea;
	//JLabel  	clv;
	JTextField 	clever;
	int			astucia;
	JTextField 	health;
	int 		salud;
	JButton 	crear;
	private BaseDatos baseDatos;
	
	
	public VistaCreacion() {
		//this.categoría=category;
		
		ventana = new JFrame();
		ventana.setTitle("Crear Personaje");
		panelDatos = new JPanel();
		ventana.add(panelDatos);
		baseDatos = new BaseDatos();
		panelDatos.setLayout(null);
		
		/*String[] typesString = { "    ", "Character", "NPC" };
		type = new JComboBox(typesString);
		panelDatos.add(type);
		type.setBounds(50,10,80,20);
		type.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 JComboBox tp = (JComboBox)e.getSource();
	             tipo = (String)tp.getSelectedItem();
	         	 }
       });*/
		
		
		name = new JTextField("nombre");
		panelDatos.add(name);
		nombre = name.getText();
		name.setBounds(50,40,80,20); 
		
		
		
		
		String[] categoriesString = {"    ",  "Guerrero", "Pícaro", "Mago"};
		category = new JComboBox(categoriesString);
		panelDatos.add(category);
		category.setBounds(50,70,80,20); 
		category.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	JComboBox ct = (JComboBox)e.getSource();
	        	
	             categoría = (String)category.getSelectedItem();
	         }
		});
		
		String[] weaponsString = {"    ",  "Espada", "Arco", "Cétro", "Maza", "Látigo", "Daga" };
		weapon = new JComboBox(weaponsString);
		panelDatos.add(weapon);
		weapon.setBounds(50,70,80,20); 
		weapon.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	JComboBox wp = (JComboBox)e.getSource();
	        	
	             arma = (String)weapon.getSelectedItem();
	         }
     });
		
		String[] sexString = { "    ", "Hombre", "Mujer", "Otro" };
		sex = new JComboBox(sexString);
		panelDatos.add(sex);
		sex.setBounds(50,100,80,20); 
		sex.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 JComboBox sx = (JComboBox)e.getSource();
	             sexo = (String)sx.getSelectedItem();
	         	 }
		});
	
		
		ability = new JTextField("habilidad");
		panelDatos.add(ability);
		ability.setBounds(50,130,80,20); 
		
		fight = new JTextField("pelea");
		panelDatos.add(fight);
		fight.setBounds(50,160,80,20); 
		
		clever = new JTextField("astucia");
		panelDatos.add(clever);
		clever.setBounds(50,190,80,20); 
		
		health = new JTextField("salud");
		panelDatos.add(health);
		health.setBounds(50,200,80,20); 
		
		
		crear = new JButton("Crear");
		panelDatos.add(crear);
		crear.setBounds(280,220,80,20); 
	    crear.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	
	        	switch(categoría) {
	        	 case "Guerrero": Guerrero g = new Guerrero(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(g.getNombre()+" categoria " +g.getCategoría()+" sexo "+g.getSexo()+" habilidad "+g.getHabilidad()+" pelea "+ g.getPelea()+" astucia "+g.getAstucia());
	        	 //VistaMain.setGuerrero(g);
	        	 VistaMain.bd.addDatos(g);
	        	 break;
	        	 
	        	 case "Pícaro": Pícaro a = new Pícaro(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(a.getNombre()+" categoria " +a.getCategoría()+" sexo "+a.getSexo()+" habilidad "+a.getHabilidad()+" pelea "+ a.getPelea()+" astucia "+a.getAstucia()+a.getSalud());
	        	 //VistaMain.setPícaro(a);
	        	 System.out.println(VistaMain.bd.getlistA());
	        	
	        	 break;
	        	 
	        	 case "Mago": Mago m = new Mago(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(m.getNombre()+" categoria " +m.getCategoría()+" sexo "+m.getSexo()+" habilidad "+m.getHabilidad()+" pelea "+ m.getPelea()+" astucia "+m.getAstucia());
	        	 //VistaMain.setMago(m);
	        	 
	        	 break;
	        	 
	        	 case "NPC": Aventurero n = new Aventurero(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()),Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.printf("hola");
	        	 VistaMain.bd.addDatosN(n);
	        	 
	        	 break;
	        	 }
	            
	         	 }
      });
		//System.out.printf(VistaMain.bd.getListaN().toString());
		ventana.setSize(new Dimension(400,300));
		ventana.setVisible(true);
		//return personas;
	}
	
	public BaseDatos getBase() {
		return this.baseDatos ;		
	}
}
