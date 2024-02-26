/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumanterminos.Ppl;
import java.util.Scanner;

/**
 *
 * @author HP GAMER
 */
public class SumaNTerminos {

    public static void main(String[] args) {
        int n;
        int i=1;
        double res=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el limite de la sucesion: ");
        n=sc.nextInt();
        while(i<=n){
            res=res+(i/Math.pow(2,i));
            i=i+1;
        }
        System.out.printf("La suma de la sucesion hasta %d es= %.5f\n",n,res);
    }
}
