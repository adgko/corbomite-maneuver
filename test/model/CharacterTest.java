/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Characters.Guerrero;
import Characters.Personaje;
import core.BaseDatos;

import static org.junit.Assert.*;

/**
 *
 * @author Diego
 */
public class CharacterTest {
    
    public CharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    	
    	
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * TIene que decir falso hasta que se agregan mas de 4
     */
    @Test
    public void testAgregarJugador() {
        System.out.println("agregarJugador");
        BaseDatos bd = new BaseDatos();
        Personaje instance= new Guerrero("Juan","Guerrero","Espada","Hombre",16,13,11,20);
        bd.addDatos(instance);
        
       
    }

}
