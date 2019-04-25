/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args){
        
        //Crear un scanner para el ingreso de los mensajes
        
        Scanner scan = new Scanner(System.in);
        int mensajes;
        
        //Pedir al usuario que ingrese la cantidad de mensajes utilizados
        
        System.out.println("Ingrese la cantidad de mensajes utilizados al "
                + "mes: \n");
        mensajes = scan.nextInt();
        
        //Declaracion de variables
        
        int diferencia;
        double valor;
        double valor_mensual;
        double monto;
        
        /*Uso de condiciones para calcular el valor mensual dependiendo
          la cantidad de mensajes usados*/
       
        if (mensajes <= 40){
            valor = 3; //El valor 3 es la tarifa basica
            valor_mensual = valor + (valor * 0.12);/*valor mensual es igual 
            al valor de la tarifa basica + 12% de IVA*/
            
        } else {
            if (mensajes > 40 && mensajes <= 200){
                diferencia = mensajes - 40;/*calcular la cantidad de mensajes
                despues del mensaje 40*/
                valor = 3 + (diferencia * 0.05);
                valor_mensual = valor + (valor * 0.12);
            } else {
                diferencia = mensajes - 200;/*calcular la cantidad de mensajes
                despues del mensaje 200*/
                monto = (160 - 40) * 0.05;
                valor = monto + 3 + (diferencia * 0.1);
                valor_mensual = valor + (valor * 0.12);
            }
        }
        
        //Mostrar en pantalla el valor final mensual a pagar
        
        System.out.printf("El valor final mensual a pagar es: \n%.2f",
                valor_mensual);
    }
    
}
