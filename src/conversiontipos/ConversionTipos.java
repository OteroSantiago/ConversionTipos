/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontipos;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class ConversionTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Conversiones
       //De String a Enteros
       /*
       //de String a Byte
       Byte.parseByte("");
       //de String a Short
       Short.parseShort("");
       //de String a Integer
       Integer.parseInt("");
       //de String a Double
       Double.parseDouble("");
       //de String a Float
       Float.parseFloat("");
       */
       //De tipo Entero a String
       //String.valueOf(var);
       //Si queremos extraer caracteres de un String podemos usar la función "" .charAt(indice
       //El indice ira desde 0 hasta la longitud de la cadena -1 [0 - long-1


       String prueba = "100";
       int prueba2 = Integer.parseInt(prueba);
       System.out.println(prueba2);
       System.out.println("");
       
        /*System.out.println("Introduzca un numero: ");
        Scanner sca = new Scanner(System.in);
        var num = sca.nextInt();
        System.out.println("Tu numero multiplicado por 5 es: "+num*5);
        */
        
       
       /*System.out.println("Introduzca su nombre: ");
       Scanner ent = new Scanner(System.in);
       var nombre = ent.nextLine();
       System.out.println("Tu nombre: "+nombre);
       System.out.println(nombre.charAt(2));
       */
       
       
        
       
    }
    
}
