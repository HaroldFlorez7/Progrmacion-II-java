/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ParoImpar.Ppl;
import java.util.Scanner;
/**
 *
 * @author HP GAMER
 * Un número par es aquel que es divisible en 2 y un número 
 * impar es aquel que no es divisible en 2. Con base en la
 * informacion anterior, implemente un algoritmo que permita
 * verificar si un numero es par o impar.
 */

public class ParoImpar {

    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        x=sc.nextInt();
        if((x%2==0)){
            System.out.printf("EL numero %d es par",x);
        } else{
            System.out.printf("EL numero %d es impar",x);
        }
        
    }
}
