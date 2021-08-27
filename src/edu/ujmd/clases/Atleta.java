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
public class Atleta {

    public Atleta() {
    }

    private Scanner N;
    private String Nombre;

    private String Apellido;

    private int NumeroIdentificacion;

    private float Peso;

    private int NumeroGuantes;

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public float getPeso() {
        return Peso;
    }

    public int getNumeroGuantes() {
        return NumeroGuantes;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public void setNumeroGuantes(int NumeroGuantes) {
        this.NumeroGuantes = NumeroGuantes;
    }

    public void IngresarDatosAtleta() {
        System.out.println("Ingrese el nombre del atleta");
        Nombre = N.next();
        System.out.println("Ingrese el apellido del atleta");
        Apellido = N.next();

    }
    
    public void MostrarDatosAtleta()
    {
        System.out.println("El nombre es : " +Nombre);
        System.out.println("El apellido es : "+Apellido);
    }

}
