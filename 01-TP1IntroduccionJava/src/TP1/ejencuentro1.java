
package TP1;

import java.util.Scanner;

public class ejencuentro1 {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        char genero;
        int horasTrabajadas;
        double cantHoras;
        
        
        //Pide, lee y asigna los datos que ingresa el usuario a sus repectivas variables
        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el genero");
        genero = input.nextLine().charAt(0);
        
        System.out.println("Ingrese las horas que trabaja");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingresa el valor por horas trabajadas");
        cantHoras = Double.parseDouble(input.nextLine());
        
        
        
    }
    
}
