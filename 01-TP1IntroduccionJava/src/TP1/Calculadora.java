
package TP1;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        /*5. Escribe un programa que solicite dos números enteros 
        y realice las siguientes operaciones: a. Suma b. Resta c. 
        Multiplicación d. División Muestra los resultados en la consola. */
        
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese un numero: ");
        num1= Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero: ");
        num2= Integer.parseInt(input.nextLine());
        
        
        
        
        System.out.println("Suma " + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Resta " + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Multiplicacion " + num1 + " x " + num2 + " = " + (num1*num2));
        
        if (num2!=0) {
            System.out.println("Division " + num1 + " / " + num2 + " = " + (num1/num2));
        
        }else{
            System.out.println("No puede dividir por cero");
        }
        
        
        
    }
    
}
