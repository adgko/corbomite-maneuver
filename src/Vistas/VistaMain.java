package Vistas;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import Characters.Pícaro;
import Characters.Guerrero;
import Characters.Mago;
import Characters.Aventurero;
import Characters.Personaje;
import core.BaseDatos;
import Observer.Observer;



public class VistaMain implements Observer {
	JFrame ventana;
	JPanel panel;
	JTabbedPane secciones; 
	ImageIcon img;
	static ImageIcon iconPersonajes = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\scroll-icon.png");
	private static final String pathIcon= "C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\maze-icon.png";
	static ImageIcon iconCharacter = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\warrior-icon.png");
	
	public static BaseDatos  bd = new BaseDatos();

	private static VistaMain singleton;
	
	public static void main(String[] args) {
		VistaMain.getInstance();		
	}

	
	
	private VistaMain() {
		ventana = new JFrame();
		bd.registerObserver(this);
		ventana.setTitle("Dungeon Manager");
		img = new ImageIcon(pathIcon); 
		ventana.setIconImage(img.getImage());
		secciones = new JTabbedPane();							
        ImageIcon iconPelea = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\swords-icon.png");   
        ImageIcon iconPrincipal = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\castle-icon.png");        
        ImageIcon iconNPC = new ImageIcon("C:\\Users\\Diego\\Desktop\\Dungeon Manager v5\\Dungeon Manager v5\\src\\Vistas\\shield-icon.png");
        ventana.setSize(new Dimension(600,500));
        
        JPanel panelPrincipal = newVistaPrincipal();
        secciones.addTab("PRINCIPAL", iconPrincipal, panelPrincipal);
        secciones.setMnemonicAt(0, KeyEvent.VK_A);
        
        JPanel panelPersonajes = newVistaPersonajes();
        secciones.addTab("PERSONAJES", iconPersonajes, panelPersonajes);
        secciones.setMnemonicAt(1, KeyEvent.VK_S);
        
        JPanel panelNPC = newVistaNPC();
        secciones.addTab("NPC", iconNPC, panelNPC);
        secciones.setMnemonicAt(2, KeyEvent.VK_D);
        
        JPanel panelPelea = newVistaPelea();
        secciones.addTab("PELEA", iconPelea, panelPelea);
        secciones.setMnemonicAt(3, KeyEvent.VK_F);  
        
        ventana.add(secciones);
        ventana.setPreferredSize(new Dimension(500,500));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}
	
	
	JPanel resultadoPersonajes = new JPanel();
	private JPanel newVistaPersonajes() {	
		JButton botoncreate = new JButton("Crear Personajes");
		botoncreate.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaCreacion vs = new VistaCreacion();	             
	         	 }
        });
		resultadoPersonajes.add(botoncreate);		
		return resultadoPersonajes;
	}
	
	private JPanel newVistaPrincipal() {
		JPanel resultado = new JPanel();
		JTextArea notas = new JTextArea("notas");
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
	
	JPanel resultadoNPC;
	private JPanel newVistaNPC() {
		resultadoNPC = new JPanel();
		
		JButton botoncreate = new JButton("Crear Personajes NPC");
		
		botoncreate.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	             VistaCreacionNPC vs = new VistaCreacionNPC();
	             
	         	 }
        });
		resultadoNPC.add(botoncreate);
		return resultadoNPC;
	}
	private static void mostrarPersonaje(String ste) {
		String[] options = {"Mod. HP","Mod. Arma","Borrar","OK"};
		Personaje personaje = bd.getPersonaje(ste);
		//bd.getLista().get(bd.getLista().indexOf(personaje.getNombre().toString()));
		
		int seleccion = JOptionPane.showOptionDialog(null,ste.toString(),personaje.getNombre(),JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,iconPersonajes,options,options[3]);
		switch(seleccion) {
		case 0: personaje.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, ste.toString())));
		break;
		case 1: String arma = JOptionPane.showInputDialog(null, "Qué arma va a usar ahora?");
				personaje.setCombatBehavior(arma);
				personaje.setArma(arma);
		break;
		case 2: bd.borrarPersonaje(ste);
		break;
		case 3: 
			break;
		}
		bd.notifyObservers();
	}
	
	JPanel resultadoPelea;
	JComboBox agCom = new JComboBox();
	private JPanel newVistaPelea() {
		resultadoPelea = new JPanel();
		ArrayList<Personaje> listaCombatientes = new ArrayList<>();
		//bd.addDatos(new Guerrero("NPC 1","guerrero", "noweapon","sexo",0,0,0,20));
		JLabel agregarCombat = new JLabel("Añadir personaje a pelea");
		
		
		JButton confirmar = new JButton("Ok");
		confirmar.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent e){
	        	// JComboBox ct = (JComboBox)e.getSource();		        	
	             String nompers = (String)agCom.getSelectedItem();	             
	             Personaje po = VistaMain.bd.getPersonajePorNombre(nompers);
	             //System.out.println("po es: "+po.toString());
	             bd.addDatospelea(po);	             
	         	 }
       });		
 		
		resultadoPelea.add(agregarCombat);
		resultadoPelea.add(agCom);
		resultadoPelea.add(confirmar);
		agregarCombat.setBounds(50,50,80,20);
		agCom.setBounds(130,50,80,20);
		confirmar.setBounds(200,50,20,20);	
		
		return resultadoPelea;
	}	
	
	public void update(ArrayList<Personaje> listaPersonajes,ArrayList<Personaje> listaNPC, ArrayList<Personaje> listaCombate) {
		//esto es para la pestaña de personajes
		resultadoPersonajes.removeAll();
		resultadoPersonajes = newVistaPersonajes();
		for(Personaje personaje : listaPersonajes) {
			JButton boton = new JButton(personaje.getNombre());
			resultadoPersonajes.add(boton);
			boton.addActionListener(new ActionListener(){
		         public void actionPerformed(ActionEvent e){
		        	 VistaMain.mostrarPersonaje(personaje.toString());		             
		         	 }
	        });
		}
		resultadoPersonajes.repaint();
		secciones.setComponentAt(1,resultadoPersonajes);
		
		//esto es para npc
		resultadoNPC.removeAll();
		resultadoNPC = newVistaNPC();
		for(Personaje personaje : listaNPC) {
			JButton boton = new JButton(personaje.getNombre());
			resultadoNPC.add(boton);
			boton.addActionListener(new ActionListener(){
		         public void actionPerformed(ActionEvent e){
		        	 VistaMain.mostrarPersonaje(personaje.toString());
		        	 //JOptionPane.showMessageDialog(this,personaje.toString());
		         	 }
	        });
		}
		resultadoNPC.repaint();
		secciones.setComponentAt(2,resultadoNPC);
		
		
		
		//esto es pelea... SPARTAAAAAAAAAA
		
		resultadoPelea.removeAll();
		resultadoPelea = newVistaPelea();
		agCom.removeAllItems();
		for (Personaje personaje : listaPersonajes){
			agCom.addItem(personaje.getNombre());
		}		
		for (Personaje personaje : listaNPC){
			agCom.addItem(personaje.getNombre());
		}
		
		if(!listaCombate.isEmpty()) {
			for(Personaje personaje : listaCombate) {
				JButton boton = new JButton(personaje.getNombre());
				resultadoPelea.add(boton);
				boton.addActionListener(new ActionListener(){
			         public void actionPerformed(ActionEvent e){
			        	 VistaMain.mostrarPersonaje(personaje.toString());
			        	 //JOptionPane.showMessageDialog(this,personaje.toString());
			         	 }
		        });
			}			
		}		
		resultadoPelea.repaint();
		secciones.setComponentAt(3,resultadoPelea);
		
		
	}	

	public static VistaMain getInstance() {
		if (singleton == null) {
			singleton = new VistaMain();
		}
		return singleton;
	}
}
