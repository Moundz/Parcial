/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.observer.IObserver;

/**
 *
 * @author Estudiantes
 */
public class WebMaster implements IObserver{

    private String nombre;
    
    public WebMaster(String nombre){
        this.nombre = nombre;
    }
    
    
    @Override
    public void actualizar(String mensaje) {
        System.out.println("La WebMaster " + nombre + " ha creado un nuevo Spot: " + mensaje + "\n"); 
       
    }
    
}
