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
public class CommunityManager implements IObserver {

    private String nombre;

    public CommunityManager(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {

        System.out.println("La Community Manager " + nombre + " ha creado un nuevo Spot: " + mensaje + "\n");

    }
}
