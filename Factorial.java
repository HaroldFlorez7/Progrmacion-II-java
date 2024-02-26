/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yo.factorial;
import java.util.Scanner;
/**
 *
 * @author HP GAMER
 * Implemente un algoritmo que calcule el factorial de 
 * un número n.
 */
public class Factorial {

    public static void main(String[] args) {
        int x,fact=1,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero:");
        x=sc.nextInt();
        do{
            fact=fact*i;
            i++;
        }while(i<=x);
        System.out.printf("El factorial de %d es = %d",x,fact);
    }
}
