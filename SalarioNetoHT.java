/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarionetoht.Ppl;
import java.util.Scanner;

/**
 *
 * @author HP GAMER
 */
public class SalarioNetoHT {

    public static void main(String[] args) {
        int ht,sal;
        double saln;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabjadas: ");
        ht = sc.nextInt();
        if(ht<38){
            sal=ht*1000;
        } else{
            sal=37*1000+(ht-38)*1500;
        }
        if(sal>750){
            saln=sal-(sal*0.1);
        } else{
            saln=sal;
        }
        System.out.printf("El salario neto para %d es: %.2f\n",ht,saln);
    }
}
