
import java.util.Scanner;
import paquetedos.Operacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class SeleccionDoble {
    
    public static void main(String[] args){
        
        //Crear un scanner para el ingreso de datos mediante el teclado
        
        Scanner scan = new Scanner(System.in);
        
        //Importar las variables para hacer uso de ellas
        
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        
        //Ingreso de la calificacion 1 mediante teclado
        
        int calificacion;
        calificacion = scan.nextInt();
        
        //Uso del if para mostrar en pantalla si el alumno esta aprobado o reprobado
        
        if (calificacion >=85){
            System.out.printf("%S %d\n",miMensaje,calificacion);
        } else {
            System.out.printf("%S %d\n",miMensaje2,calificacion);
        }  
        
        //Ingreso de la calificacion 2 mediante teclado
        
        int calificacion_2;
        calificacion_2 = scan.nextInt();
        
        //Uso del if para mostrar en pantalla si el alumno esta aprobado o reprobado
        
        if (calificacion_2 >= 85) {
            System.out.printf("%s %d\n",miMensaje,calificacion_2);
        } else {
            System.out.printf("%s %d\n",miMensaje2,calificacion_2);
        }
    }
    
}
