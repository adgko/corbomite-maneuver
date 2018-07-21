package Vistas;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

//import javax.imageio.ImageIO;
import javax.swing.*;

import Characters.Pícaro;
import VistaCharacters.VistaAventurero1;
import VistaCharacters.VistaAventurero2;
import VistaCharacters.VistaGuerrero1;
import VistaCharacters.VistaGuerrero2;
import VistaCharacters.VistaMago1;
import VistaCharacters.VistaMago2;
import VistaCharacters.VistaPícaro1;
import VistaCharacters.VistaPícaro2;
import VistaNPCs.VistaNPC1;
import VistaNPCs.VistaNPC2;
import VistaNPCs.VistaNPC3;
import VistaNPCs.VistaNPC4;
import VistaNPCs.VistaNPC5;
import VistaNPCs.VistaNPC6;
import VistaNPCs.VistaNPC7;
import VistaNPCs.VistaNPC8;
import Characters.Guerrero;
import Characters.Mago;
import Characters.Aventurero;
import Characters.Personaje;
import core.BaseDatos;



public class VistaMain implements Observer {
	JFrame ventana;
	JPanel panel;
	JTabbedPane secciones; 
	ImageIcon img;
	private static final String pathIcon= "C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\src\\Vistas\\maze-icon.png";
	public static BaseDatos  bd;
	public static Guerrero 	 guerrero1;
	public static Guerrero 	 guerrero2;
	public static Pícaro   	 pícaro1;
	public static Pícaro   	 pícaro2;
	public static Mago 	  	 mago1;
	public static Mago 	  	 mago2;
	public static Aventurero aventurero1;
	public static Aventurero aventurero2;
	public static Guerrero 	   npc1;
	public static Guerrero 	   npc2;
	public static Pícaro 	   npc3;
	public static Pícaro 	   npc4;
	public static Mago 	   	   npc5;
	public static Mago 	       npc6;
	public static Aventurero   npc7;
	public static Aventurero   npc8;
	
	public static Guerrero getGuerrero1() {return guerrero1;}
	public static void setGuerrero1(Guerrero guerrero) {VistaMain.guerrero1 = guerrero;}
	public static Guerrero getGuerrero2() {return guerrero2;}
	public static void setGuerrero2(Guerrero guerrero) {VistaMain.guerrero2 = guerrero;}

	public static Pícaro getPícaro1() {return pícaro1;}
	public static void setPícaro1(Pícaro arquero) {VistaMain.pícaro1 = arquero;}
	public static Pícaro getPícaro2() {return pícaro2;}
	public static void setPícaro2(Pícaro arquero) {VistaMain.pícaro2 = arquero;}
		
	public static Mago getMago1() {return mago1;}
	public static void setMago1(Mago mago) {VistaMain.mago1 = mago;}
	public static Mago getMago2() {return mago2;}
	public static void setMago2(Mago mago) {VistaMain.mago2 = mago;}

	public static Aventurero getAventurero1() {return aventurero1;}
	public static void setAventurero1(Aventurero aventurero1) {VistaMain.aventurero1 = aventurero1;}
	public static Aventurero getAventurero2() {return aventurero2;}
	public static void setAventurero2(Aventurero aventurero2) {VistaMain.aventurero2 = aventurero2;}
	
	
	
	public static Guerrero getNpc1() {return npc1;}
	public static void setNpc1(Guerrero npc1) {VistaMain.npc1 = npc1;}
	public static Guerrero getNpc2() {return npc2;}
	public static void setNpc2(Guerrero npc2) {VistaMain.npc2 = npc2;}
	
	public static Pícaro getNpc3() {return npc3;}
	public static void setNpc3(Pícaro npc3) {VistaMain.npc3 = npc3;}
	public static Pícaro getNpc4() {return npc4;}
	public static void setNpc4(Pícaro npc4) {VistaMain.npc4 = npc4;}
	
	public static Mago getNpc5() {return npc5;}
	public static void setNpc5(Mago npc5) {VistaMain.npc5 = npc5;}
	public static Mago getNpc6() {return npc6;}
	public static void setNpc6(Mago npc6) {VistaMain.npc6 = npc6;}
	
	public static Aventurero getNpc7() {return npc7;}
	public static void setNpc7(Aventurero npc7) {VistaMain.npc7 = npc7;}
	public static Aventurero getNpc8() {return npc8;}
	public static void setNpc8(Aventurero npc8) {VistaMain.npc8 = npc8;}
	
	
	public static void main(String[] args) {
		VistaMain vm= new VistaMain();
		
		
	}

	
	
	public VistaMain() {
		ventana = new JFrame();
		BaseDatos bd= new BaseDatos();
		ventana.setTitle("Dungeon Manager");
		img = new ImageIcon(pathIcon); 
		ventana.setIconImage(img.getImage());
		JTabbedPane tabbedPane = new JTabbedPane();							//cambiar tabbedPane por otro nombre
        ImageIcon iconPelea = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\src\\Vistas\\swords-icon.png");
        ImageIcon iconPersonajes = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\src\\Vistas\\scroll-icon.png");
        ImageIcon iconPrincipal = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\src\\Vistas\\castle-icon.png");
        //ImageIcon iconoNPC = new Image Icon();
        ImageIcon iconNPC = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\src\\Vistas\\shield-icon.png");
        ventana.setSize(new Dimension(600,500));

        guerrero1 = new Guerrero("Personaje 1","guerrero", "noweapon","sexo",0,0,0,20);
        guerrero2 = new Guerrero("Personaje 2","guerrero", "noweapon","sexo",0,0,0,20);
        pícaro1 = new Pícaro("Personaje 3","pícaro", "noweapon","sexo",0,0,0,20);
        pícaro2 = new Pícaro("Personaje 4","pícaro", "noweapon","sexo",0,0,0,20);
        mago1 = new Mago("Personaje 5","mago", "noweapon","sexo",0,0,0,20);
        mago2 = new Mago("Personaje 6","mago", "noweapon","sexo",0,0,0,20);
        aventurero1 = new Aventurero("Personaje 7","aventurero", "noweapon","sexo",0,0,0,20);
        aventurero2 = new Aventurero("Personaje 8","aventurero", "noweapon","sexo",0,0,0,20);
        
		npc1 = new Guerrero("NPC 1","guerrero", "noweapon","sexo",0,0,0,20);
        npc2 = new Guerrero("NPC 2","guerrero", "noweapon","sexo",0,0,0,20);
        npc3 = new Pícaro("NPC 3","pícaro", "noweapon","sexo",0,0,0,20);
        npc4 = new Pícaro("NPC 4","pícaro", "noweapon","sexo",0,0,0,20);
        npc5 = new Mago("NPC 5","mago", "noweapon","sexo",0,0,0,20);
        npc6 = new Mago("NPC 6","mago", "noweapon","sexo",0,0,0,20);
        npc7 = new Aventurero("NPC 7","aventurero", "noweapon","sexo",0,0,0,20);
        npc8 = new Aventurero("NPC 8","aventurero", "noweapon","sexo",0,0,0,20);
        
        JPanel panelPrincipal = newVistaPrincipal();
        tabbedPane.addTab("PRINCIPAL", iconPrincipal, panelPrincipal);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_A);
        
        JPanel panelPersonajes = newVistaPersonajes();
        tabbedPane.addTab("PERSONAJES", iconPersonajes, panelPersonajes);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_S);
        
        JPanel panelNPC = newVistaNPC();
        tabbedPane.addTab("NPC", iconNPC, panelNPC);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_D);
        
        JPanel panelPelea = newVistaPelea();
        tabbedPane.addTab("PELEA", iconPelea, panelPelea);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_F);  
        
        
        
        //Add the tabbed pane to this panel.
        ventana.add(tabbedPane);
        ventana.setPreferredSize(new Dimension(500,500));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	
	
	private JPanel newVistaPersonajes() {
		JPanel resultado = new JPanel();
		JButton botoncreate = new JButton("Crear Personajes");
		JButton personaje01 = new JButton(getGuerrero1().getNombre());
		JButton personaje02 = new JButton(getGuerrero2().getNombre());
		JButton personaje03 = new JButton(getPícaro1().getNombre());
		JButton personaje04 = new JButton(getPícaro2().getNombre());
		JButton personaje05 = new JButton(getMago1().getNombre());
		JButton personaje06 = new JButton(getMago2().getNombre());
		JButton personaje07 = new JButton(getAventurero1().getNombre());
		JButton personaje08 = new JButton(getAventurero2().getNombre());
		resultado.setLayout(null);
		resultado.add(botoncreate);
		botoncreate.setBounds(150, 10, 150, 20);
		resultado.add( personaje01);
		personaje01.setBounds(50, 40, 120, 40); 
		resultado.add( personaje02);
		personaje02.setBounds(250, 40, 120, 40);
		resultado.add( personaje03);
		personaje03.setBounds(50, 90, 120, 40);
		resultado.add( personaje04);
		personaje04.setBounds(250, 90, 120, 40);
		resultado.add( personaje05);
		personaje05.setBounds(50, 140, 120, 40);
		resultado.add( personaje06);
		personaje06.setBounds(250, 140, 120, 40);
		resultado.add( personaje07);
		personaje07.setBounds(50, 190, 120, 40);
		resultado.add( personaje08);
		personaje08.setBounds(250, 190, 120, 40);
		
		
		 
		botoncreate.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaCreacion vs = new VistaCreacion();
	             
	         	 }
        });
		 personaje01.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaGuerrero1 g1 = new VistaGuerrero1();
	         	 }
        });
		 personaje02.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaGuerrero2 g2 = new VistaGuerrero2();
	         	 }
        });
		 personaje03.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaPícaro1 p1 = new VistaPícaro1();
	         	 }
        });
		 personaje04.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaPícaro2 p2 = new VistaPícaro2();
	         	 }
        });
		 personaje05.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaMago1 m1 = new VistaMago1();
	         	 }
        });
		 personaje06.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaMago2 m2 = new VistaMago2();
	         	 }
        });
		 personaje07.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaAventurero1 a1 = new VistaAventurero1();
	         	 }
        });
		 personaje08.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaAventurero2 a2 = new VistaAventurero2();
	         	 }
        });
		 
		 
		return resultado;
	}
	private JPanel newVistaPrincipal() {
		JPanel resultado = new JPanel();
		JTextArea notas = new JTextArea("NOTAS");
		JButton botondice = new JButton("Dados");
        JButton botonrest = new JButton("Descansar");
        resultado.setLayout(null);
        resultado.add(botondice);
        resultado.add(botonrest);
        botondice.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaDados vs = new VistaDados();
	         	 }
        });
        
		resultado.add(notas);		
		botondice.setBounds(150, 10, 100, 20);
		botonrest.setBounds(260, 10, 100, 20);
		notas.setBounds(120, 50, 300, 300);
		return resultado;
	}
	
	private JPanel newVistaNPC() {
		JPanel resultado = new JPanel();
		JButton botoncreate = new JButton("Crear Personajes");
		JButton npc01 = new JButton(getNpc1().getNombre());
		JButton npc02 = new JButton(getNpc2().getNombre());
		JButton npc03 = new JButton(getNpc3().getNombre());
		JButton npc04 = new JButton(getNpc4().getNombre());
		JButton npc05 = new JButton(getNpc5().getNombre());
		JButton npc06 = new JButton(getNpc6().getNombre());
		JButton npc07 = new JButton(getNpc7().getNombre());
		JButton npc08 = new JButton(getNpc8().getNombre());
		resultado.setLayout(null);
		//resultado.add(botoncreate);
		botoncreate.setBounds(150, 10, 150, 20);
		resultado.add( npc01);
		npc01.setBounds(50, 40, 120, 40); 
		resultado.add( npc02);
		npc02.setBounds(250, 40, 120, 40);
		resultado.add( npc03);
		npc03.setBounds(50, 90, 120, 40);
		resultado.add( npc04);
		npc04.setBounds(250, 90, 120, 40);
		resultado.add( npc05);
		npc05.setBounds(50, 140, 120, 40);
		resultado.add( npc06);
		npc06.setBounds(250, 140, 120, 40);
		resultado.add( npc07);
		npc07.setBounds(50, 190, 120, 40);
		resultado.add( npc08);
		npc08.setBounds(250, 190, 120, 40);
		

		
		 
		botoncreate.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaCreacion vs = new VistaCreacion();
	             
	         	 }
        });
		npc01.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC1 n1 = new VistaNPC1();
	         	 }
        });
		npc02.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC2 n2 = new VistaNPC2();
	         	 }
        });
		npc03.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC3 n3 = new VistaNPC3();
	         	 }
        });
		npc04.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC4 n4 = new VistaNPC4();
	         	 }
        });
		npc05.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC5 n5 = new VistaNPC5();
	         	 }
        });
		npc06.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC6 n6 = new VistaNPC6();
	         	 }
        });
		npc07.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC7 n7 = new VistaNPC7();
	         	 }
        });
		npc08.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaNPC8 n8 = new VistaNPC8();
	         	 }
        });
		 
		return resultado;
	}
	
	
	private JPanel newVistaPelea() {
		JPanel resultado = new JPanel();
		
		return resultado;
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	

}
