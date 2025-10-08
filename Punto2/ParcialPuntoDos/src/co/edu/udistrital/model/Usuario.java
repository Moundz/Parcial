/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.strategyNotificacion.INotificacion;
import co.edu.udistrital.strategyTiempo.ITiempo;

/**
 *
 * @author Estudiantes
 */
public class Usuario {
    
    private String nombre;
    private INotificacion notificacion;
    private ITiempo tiempo;

    public Usuario(String nombre, INotificacion notificacion, ITiempo tiempo) {
        this.nombre = nombre;
        this.notificacion = notificacion;
        this.tiempo = tiempo;
    }
    
    public void notificacion(String mensaje){
        System.out.println("Usuario: " + nombre);
        notificacion.Notificar(mensaje);
        tiempo.tiempoElegido();
    }
    
}
