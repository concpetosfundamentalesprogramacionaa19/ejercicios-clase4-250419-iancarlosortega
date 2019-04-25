package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class SeleccionAnidada {
    
    public static void main(String[] args){
        
        //Creacion de scanner para el ingreso de datos por teclado
        
        Scanner scan = new Scanner(System.in);
        
        //Importar las variables de mensaje para hacer uso de ellas
        
        String mensaje = Operacion2.aprobado;
        String mensaje2 = Operacion2.reprobado;
        
        //Ingreso de la calificacion mediante el teclado
        
        int calificacion;
        calificacion = scan.nextInt();
        
        //Ciclos anidados de if para mostrar en pantalla en estado de la nota
        
        if (calificacion >= 90){
            System.out.printf("%s (excelente) con %d\n",mensaje,calificacion);
        } else {
            if (calificacion >= 80){
                System.out.printf("%s (muy buena) con %d\n",mensaje,
                        calificacion);
            } else {
                if (calificacion >=50){
                    System.out.printf("%s (regular) con %d\n",mensaje,
                            calificacion);
                } else {
                    System.out.printf("%s con %d\n",mensaje2,
                            calificacion);
                }
            }
        }
    }
    
}
