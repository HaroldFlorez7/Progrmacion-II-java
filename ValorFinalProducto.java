/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorfinalproducto.Ppl;
import java.util.Scanner;
/**
 *
 * @author HP GAMER
 */
public class ValorFinalProducto {

    public static void main(String[] args) {
        int cos;
        char cat;
        double fin=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el costo fijo del producto: ");
        cos = sc.nextInt();
        System.out.println("Ingrese la categoria (A-D) del producto: ");
        cat = sc.next().charAt(0);
        switch(cat){
            case 'A':
                fin=cos-(cos*0.3);
                break;
            case 'B':
                fin=cos-(cos*0.2);
                break;
            case 'C':
                fin=cos-(cos*0.1);
                break;
            case 'D':
                fin=cos;
                break;
            default:
                System.out.println("CAtegoria no valida");
                return;
        }
        System.out.printf("El valor total del producto es= %.1f\n",fin);
    }
}
