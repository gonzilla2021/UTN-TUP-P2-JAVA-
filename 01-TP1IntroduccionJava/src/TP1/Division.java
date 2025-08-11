
package TP1;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        /*8. Manejar conversiones de tipo y división en Java.  
            a. Escribe un programa que divida dos números enteros ingresados por el 
            usuario.  
            b. Modifica el código para usar double en lugar de int y compara los 
            resultados. */
        
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese un numero: ");
        num1= Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro numero: ");
        num2= Integer.parseInt(input.nextLine());
              
        if (num2!=0) {
            System.out.println("Division " + num1 + " / " + num2 + " = " + ((double)num1/num2));
        
        }else{
            System.out.println("No puede dividir por cero");
        }
        
        
        
    }
    
}
