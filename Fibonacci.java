/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yo.fibonacci;
import java.util.Scanner;
/**
 *
 * @author HP GAMER
 */
public class Fibonacci {

    public static void main(String[] args) {
        int x,k,s=0,i=1,p=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos numeros de la serie desea ver:");
        x=sc.nextInt();
        System.out.println();
        System.out.println("0");
        while(i<x){
            System.out.println(p);
            k=s+p;
            s=p;
            p=k;
            i++;
        }
    }
}
