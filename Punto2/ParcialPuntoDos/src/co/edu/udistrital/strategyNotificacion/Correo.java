/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.strategyNotificacion;

/**
 *
 * @author Estudiantes
 */
public class Correo implements INotificacion{

    @Override
    public void Notificar(String mensaje) {
        System.out.println("Enviando Correo: " + mensaje);
    }
    
}
