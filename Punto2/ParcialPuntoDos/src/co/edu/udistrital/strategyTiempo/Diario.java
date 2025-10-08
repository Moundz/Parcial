/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.strategyTiempo;

/**
 *
 * @author Estudiantes
 */
public class Diario implements ITiempo{

    @Override
    public void tiempoElegido() {
        System.out.println("El tiempo seleccionado para notificar es Diario");
    }
    
}
