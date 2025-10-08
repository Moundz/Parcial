/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.model;

import co.edu.udistrital.observer.IObserver;
import co.edu.udistrital.observer.ISubject;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Universidad implements ISubject{
    
    private ArrayList<IObserver> Empleados;
    private ArrayList<String> Cursos;
    
    public Universidad(){
        this.Empleados = new ArrayList<>();
        this.Cursos = new ArrayList<>();
    }
    
    
    @Override
    public void agregarObserver(IObserver x) {
        Empleados.add(x);
    }

    @Override
    public void eliminarObserver(IObserver x) {
        Empleados.remove(x);
    }

    @Override
    public void notificarObserver(String mensaje) {
        for (IObserver e : Empleados){
            e.actualizar(mensaje);
        }
    }
    
 public void agregarCurso(String curso){
     Cursos.add(curso);
     notificarObserver("Nuevo curso agregado: " + curso);
     
 }   
 
 public void eliminarCurso(String curso){
     Cursos.remove(curso);
     notificarObserver("El curso ha sido eliminado: " + curso);
 }
    
}