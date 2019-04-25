package ejercicios;


import java.util.Scanner;

import paquetedos.Operacion;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author Salas
 */
public class SeleccionSimple {
    
    public static void main(String[] args){
        //documentacion
        
        //Crear un scanner para el ingreso de la calificacion por teclado
        Scanner scan = new Scanner(System.in);
        
        //Importar la variable mensaje para poder hacer uso de ella
        
        String miMensaje = Operacion.mensaje;
        
        //Ingreso por teclado de la calificacion
        
        int calificacion;
        calificacion = scan.nextInt();
        
        //Uso del if para que muestre el mensaje en pantalla en caso de que la condicion se cumpla
        
        if (calificacion >=85){
            System.out.printf("%S %d\n",miMensaje,calificacion);
        }
        
        //Ingreso por teclado de la calificacion
       
        int calificacion_2;
        calificacion_2 = scan.nextInt();
        
        //Uso del if para que muestre el mensaje en pantalla en caso de que la condicion se cumpla  
        
        if (calificacion_2 >= 85) {
            System.out.printf("%s %d\n",miMensaje,calificacion_2);
        }
    }
    
}
