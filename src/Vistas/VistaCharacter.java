package Vistas;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaCharacter {
	JFrame 	ventana;
	JPanel 	panelCharacter;
	JLabel  tipo;
	JTextField type;
	JLabel 	nombre;
	JTextField name;
	JLabel	categoría;
	JTextField category;
	JLabel	sexo;
	JTextField sex;
	JLabel	habilidad;
	JTextField ability;
	JLabel	pelea;
	JTextField fight;
	JLabel	astucia;
	JTextField clever;
	JLabel  salud;
	JTextField health;
	
	

	public VistaCharacter() {
		ventana = new JFrame();
		ventana.setTitle("Personaje");
		panelCharacter = new JPanel();
		ventana.add(panelCharacter);
		panelCharacter.setLayout(null);
		
		tipo = new JLabel("tipo :");
		type = new JTextField();
		nombre = new JLabel("nombre: ");
		name = new JTextField();
		categoría = new JLabel("categoría: ");
		category = new JTextField();
		sexo = new JLabel("sexo: ");
		sex = new JTextField();
		habilidad = new JLabel("habilidad ");
		ability = new JTextField();
		pelea = new JLabel("pelea: ");
		fight = new JTextField();
		astucia = new JLabel("astucia: ");
		clever = new JTextField();
		salud = new JLabel("Salud: ");
		health = new JTextField();
		//panelCharacter.add(tipo);
		//panelCharacter.add(type);
		panelCharacter.add(nombre);
		panelCharacter.add(name);
		panelCharacter.add(categoría);
		panelCharacter.add(category);
		panelCharacter.add(sexo);
		panelCharacter.add(sex);
		panelCharacter.add(habilidad);
		panelCharacter.add(ability);
		panelCharacter.add(pelea);
		panelCharacter.add(fight);
		panelCharacter.add(astucia);
		panelCharacter.add(clever);
		panelCharacter.add(salud);
		panelCharacter.add(health);
		tipo.setBounds(10, 10, 60, 20);
		type.setBounds(70, 10, 60, 20);
		nombre.setBounds(10, 50, 60, 20);
		name.setBounds(70, 50, 60, 20);
		categoría.setBounds(10, 80, 60, 20);
		category.setBounds(70, 80, 60, 20);
		sexo.setBounds(10, 110, 60, 20);
		sex.setBounds(70, 110, 60, 20);
		habilidad.setBounds(10, 140, 60, 20);
		ability.setBounds(70, 140, 60, 20);
		pelea.setBounds(10, 170, 60, 20);
		fight.setBounds(70, 170, 60, 20);
		astucia.setBounds(10, 200, 60, 20);
		clever.setBounds(70, 200, 60, 20);
		salud.setBounds(10, 230, 60, 20);
		health.setBounds(70, 230, 60, 20);
		
		
		ventana.setSize(new Dimension(300,400));
		ventana.setVisible(true);
	}
}
