package Vistas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Dados.Dado;

public class VistaDados {
	JFrame 	ventana;
	JPanel 	panelDados;
	JPanel 	panelResultados;
	JTextField textfield;
	JButton boton1;
	JButton boton2;
	JButton boton3;
	JButton boton4;
	JButton boton5;
	JButton boton6;
	JButton boton7;
	JButton boton8;
	
	public VistaDados() {
		ventana = new JFrame();
		ventana.setTitle("Dados");
		panelDados = new JPanel();
		panelResultados = new JPanel();
		textfield = new JTextField();
		ventana.setLayout(new FlowLayout());
		ventana.add(panelDados);
		ventana.add(panelResultados);
		ventana.add(textfield);
		textfield.setPreferredSize( new Dimension( 50, 24 ) );
		
		
		boton1 = new JButton("d2");
		boton2 = new JButton("d4");
		boton3 = new JButton("d6");
		boton4 = new JButton("d8");
		boton5 = new JButton("d10");
		boton6 = new JButton("d12");
		boton7 = new JButton("d20");
		boton8 = new JButton("d100");
		panelDados.add(boton1);
		panelDados.add(boton2);
		panelDados.add(boton3);
		panelDados.add(boton4);
		panelDados.add(boton5);
		panelDados.add(boton6);
		panelDados.add(boton7);
		panelDados.add(boton8);
		textfield.setText("000");
		
		boton1.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(2);
	        	 textfield.setText(Float.toString(num));
	        	 }
       });
		boton2.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(4);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton3.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(6);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton4.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(8);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton5.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(10);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton6.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(12);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton7.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(20);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		boton8.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	 Dado dado = new Dado();
	        	 int num = dado.tirarDado(100);
	        	 textfield.setText(Float.toString(num));
	        	 }
      });
		
		ventana.setSize(new Dimension(500,200));
		ventana.setVisible(true);
	}
	
	
}
