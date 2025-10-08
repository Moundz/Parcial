/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.CommunityManager;
import co.edu.udistrital.model.Periodista;
import co.edu.udistrital.model.Universidad;
import co.edu.udistrital.model.WebMaster;
import co.edu.udistrital.observer.IObserver;

/**
 *
 * @author Estudiantes
 */
public class Controller {
        
    public Controller(){
        run();
    }

    
    public void run(){
        
        Universidad universidad = new Universidad();
        
        IObserver periodista = new Periodista("Luz Dary Varela");
        IObserver cm = new CommunityManager("Laura");
        IObserver web = new WebMaster("Andrea");
        
        universidad.agregarObserver(periodista);
        universidad.agregarObserver(cm);
        universidad.agregarObserver(web);
        
        universidad.agregarCurso("Modelos de programacion");
        universidad.eliminarObserver(cm);
        universidad.eliminarCurso("Desprogramacion");
        
    }
}


