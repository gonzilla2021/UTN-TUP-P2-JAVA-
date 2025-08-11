
package TP1;

import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
    /*4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
    los muestre en pantalla. Usa Scanner para capturar los datos. */
    
        String nombre;
        int edad;

        //Se crea un objeto Scanner para solicitar input al usuario
        Scanner input = new Scanner(System.in);

        //Pide, lee y asigna los datos que ingresa el usuario a sus repectivas variables
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
    
        //Mostrar reusltados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
      
    
            
    
    }
}
