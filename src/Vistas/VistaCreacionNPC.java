package Vistas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Characters.Pícaro;
import Dados.Dado;
import Characters.Guerrero;
import Characters.Mago;
import Characters.Aventurero;
import Characters.Personaje;
import core.BaseDatos;
import Vistas.VistaMain;

public class VistaCreacionNPC  {
	JFrame 		ventana;
	JPanel 		panelDatos;
	JLabel  	tpe;
	JLabel  	nme;
	JTextField 	name;
	String  	nombre;
	JLabel      tegory;
	JComboBox<Personaje>   category;
	String  	categoría;
	JLabel  	wpon;
	JComboBox 	weapon;
	String  	arma;
	JLabel  	se;
	JComboBox 	sex;
	String  	sexo;
	JLabel  	bilty;
	JTextField 	ability;
	int	    	habilidad;
	JLabel  	fht;
	JTextField 	fight;
	int			pelea;
	JLabel  	clv;
	JTextField 	clever;
	int			astucia;
	JLabel		hp;
	JTextField 	health;
	int 		salud;
	JButton 	crear;
	private BaseDatos baseDatos;
	Dado dado;
	
	
	public VistaCreacionNPC() {
		//this.categoría=category;
		
		ventana = new JFrame();
		ventana.setTitle("Crear Personaje");
		panelDatos = new JPanel();
		ventana.add(panelDatos);
		baseDatos = new BaseDatos();
		dado = new Dado();
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
		
		nme = new JLabel("nombre");
		name = new JTextField(VistaCreacionNPC.getNombreRandom());
		panelDatos.add(nme);
		panelDatos.add(name);
		nombre = name.getText();
		name.setBounds(110,40,80,20); 
		nme.setBounds(50,40,80,20);
		
		
		tegory = new JLabel("categoría");
		String[] categoriesString = {"Guerrero", "Pícaro", "Mago","Aventurero"};
		category = new JComboBox(categoriesString);
		panelDatos.add(tegory);
		panelDatos.add(category);
		category.setBounds(110,70,80,20); 
		tegory.setBounds(50,70,80,20); 
		category.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	JComboBox ct = (JComboBox)e.getSource();
	        	
	             categoría = (String)category.getSelectedItem();
	         }
		});
		category.setSelectedIndex(dado.tirarDado(categoriesString.length)-1);
		
		wpon = new JLabel("arma");
		String[] weaponsString = {"    ",  "Espada", "Arco", "Cétro", "Maza", "Látigo", "Daga" };
		weapon = new JComboBox(weaponsString);
		panelDatos.add(wpon);
		panelDatos.add(weapon);
		weapon.setBounds(110,100,80,20); 
		wpon.setBounds(50,100,80,20); 
		weapon.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	JComboBox wp = (JComboBox)e.getSource();
	        	
	             arma = (String)weapon.getSelectedItem();
	         }
     });
		weapon.setSelectedIndex(dado.tirarDado(weaponsString.length)-1);		
		se = new JLabel("sexo");
		String[] sexString = { "    ", "Hombre", "Mujer", "Otro" };
		sex = new JComboBox(sexString);
		panelDatos.add(se);
		panelDatos.add(sex);
		sex.setBounds(110,130,80,20); 
		se.setBounds(50,130,80,20); 
		sex.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 JComboBox sx = (JComboBox)e.getSource();
	             sexo = (String)sx.getSelectedItem();
	         	 }
		});
		sex.setSelectedIndex(dado.tirarDado(sexString.length)-1);
	
		bilty = new JLabel("habilidad");
		ability = new JTextField(Integer.toString(dado.tirarDado(10)+5));
		panelDatos.add(ability);
		panelDatos.add(bilty);
		ability.setBounds(110,160,80,20); 
		bilty.setBounds(50,160,80,20); 
		
		fht = new JLabel("pelea");
		fight = new JTextField(Integer.toString(dado.tirarDado(10)+5));
		panelDatos.add(fight);
		panelDatos.add(fht);
		fight.setBounds(110,190,80,20); 
		fht.setBounds(50,190,80,20); 
		
		clv = new JLabel("astucia");
		clever = new JTextField(Integer.toString(dado.tirarDado(10)+5));
		panelDatos.add(clever);
		panelDatos.add(clv);
		clever.setBounds(110,220,80,20); 
		clv.setBounds(50,220,80,20); 
		
		hp = new JLabel("salud");
		health = new JTextField("20");
		panelDatos.add(health);
		panelDatos.add(hp);
		health.setBounds(110,250,80,20); 
		hp.setBounds(50,250,80,20); 
		
		
		crear = new JButton("Crear");
		panelDatos.add(crear);
		crear.setBounds(280,250,80,20); 
	    crear.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	
	        	switch(categoría) {
	        	 case "Guerrero": Guerrero g = new Guerrero(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(g.getNombre()+" categoria " +g.getCategoría()+" sexo "+g.getSexo()+" habilidad "+g.getHabilidad()+" pelea "+ g.getPelea()+" astucia "+g.getAstucia());
	        	 //VistaMain.setGuerrero(g);
	        	 VistaMain.bd.addDatosNPC(g);
	        	 break;
	        	 
	        	 case "Pícaro": Pícaro p = new Pícaro(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(p.getNombre()+" categoria " +p.getCategoría()+" sexo "+p.getSexo()+" habilidad "+p.getHabilidad()+" pelea "+ p.getPelea()+" astucia "+p.getAstucia()+p.getSalud());
	        	 //VistaMain.setPícaro(a);
	        	 //System.out.println(VistaMain.bd.getlistA());
	        	 VistaMain.bd.addDatosNPC(p);
	        	 break;
	        	 
	        	 case "Mago": Mago m = new Mago(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()), Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.println(m.getNombre()+" categoria " +m.getCategoría()+" sexo "+m.getSexo()+" habilidad "+m.getHabilidad()+" pelea "+ m.getPelea()+" astucia "+m.getAstucia());
	        	 //VistaMain.setMago(m);
	        	 VistaMain.bd.addDatosNPC(m);
	        	 break;
	        	 
	        	 case "Aventurero": Aventurero n = new Aventurero(name.getText(), categoría, arma, sexo, Integer.parseInt(ability.getText()),Integer.parseInt(fight.getText()), Integer.parseInt(clever.getText()),Integer.parseInt(health.getText()));
	        	 System.out.printf("hola");
	        	 VistaMain.bd.addDatosNPC(n);
	        	 
	        	 break;
	        	 }
	        	ventana.dispose();
	         	 }
      });
	    panelDatos.getRootPane().setDefaultButton(crear);
		//System.out.printf(VistaMain.bd.getListaN().toString());
		ventana.setSize(new Dimension(400,500));
		ventana.setVisible(true);
		//return personas;
	}
	
	public BaseDatos getBase() {
		return this.baseDatos ;		
	}
	
	public static String getNombreRandom() {		
		String archivonombres = new String("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\NombresPropios.txt");
		String nombre = new String();
		File file = new File(archivonombres);
		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile(file,"r");           
			long ran=-1;
			while(ran<0) {
				Random ram;
				ram= new Random();
				ran=ram.nextLong();
			}
			long val= ran%raf.length();
			raf.seek(val);
			raf.readLine();
			nombre=raf.readLine();
		}catch(IOException e) {
			e.printStackTrace();            
		}		
		return nombre.trim();
	}
}
