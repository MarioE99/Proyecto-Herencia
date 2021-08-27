/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;

import java.util.Scanner;

/**
 *
 * @author meev9
 */
public class Boxeador extends Atleta
{
    private Scanner O;
    
    private String Nombre;
    
    private String Apellido;
    
    private int NumeroID;
    
    private float Peso;
    
    private int NumPeleas;
    
    

    public Boxeador() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getNumeroID() {
        return NumeroID;
    }

    public float getPeso() {
        return Peso;
    }

    public int getNumPeleas() {
        return NumPeleas;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumeroID(int NumeroID) {
        this.NumeroID = NumeroID;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public void setNumPeleas(int NumPeleas) {
        this.NumPeleas = NumPeleas;
    }
    
    
    
    public void IngresarDatos()
    {
       
        System.out.println("Digite el nombre");
        Nombre = O.next();
        System.out.println("Ingrese el apellido");
        Apellido = O.next();
        System.out.println("Ingrese el numero de identificacuin");
        NumeroID=O.nextInt();
        System.out.println("Ingrese el numero de peleas");
        NumPeleas = O.nextInt();
    }
    
    
    public void MostrarDatos()
    {
        

        System.out.println("El boxeador" +Nombre+" "+Apellido+" Con numero de peleas"+NumPeleas);
    }
    
    
    
}
