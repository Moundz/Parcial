/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.strategyNotificacion.Correo;
import co.edu.udistrital.strategyNotificacion.INotificacion;
import co.edu.udistrital.strategyNotificacion.Promocion;
import co.edu.udistrital.strategyNotificacion.SMS;
import co.edu.udistrital.strategyTiempo.Diario;
import co.edu.udistrital.strategyTiempo.ITiempo;
import co.edu.udistrital.strategyTiempo.Mensual;
import co.edu.udistrital.strategyTiempo.Semanal;

/**
 *
 * @author Estudiantes
 */
public class Controller {
    
    public Controller(){
        run();
    }
    
    public void run(){
       
        INotificacion sms = new SMS();
        INotificacion correo = new Correo();
        INotificacion promocion = new Promocion();
        
        ITiempo tiempoDiario = new Diario();
        ITiempo tiempoSemanal = new Semanal();
        ITiempo tiempoMensual = new Mensual();
        
        Usuario user1 = new Usuario("Juan", sms, tiempoDiario);
        user1.notificacion("Su saldo ha caido por debajo de $10.000");
        
        
        Usuario user2 = new Usuario("Jose", correo, tiempoSemanal);
        user2.notificacion("Has realizado una consignacion por $500.000 a otra cuenta");
        
        Usuario user3 = new Usuario("Maria", promocion, tiempoDiario);
        user3.notificacion("Tienes una nueva promocion, quieres conocerla?, llamanos");
        
        Usuario user4 = new Usuario ("Ana", sms, tiempoMensual);
        user4.notificacion("Has recibido $500.000 de otra cuenta bancaria");
        
    }
    
}
