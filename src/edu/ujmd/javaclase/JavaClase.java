/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.javaclase;


import edu.ujmd.clases.Boxeador;

/**
 *
 * @author meev9
 */
public class JavaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Boxeador b1;
       
       b1= new Boxeador();
      
        System.out.println("Ingrese los datos ");
        b1.IngresarDatos();
        
        System.out.println("Los datos son los siguientes");
        b1.MostrarDatos();
        
    }
    
}
