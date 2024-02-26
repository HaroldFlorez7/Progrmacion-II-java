/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mostrarsumaproductococienteymodulo.Ppl;

/**
 *
 * @author HP GAMER
 */
public class MostrarSumaProductoCocienteYModulo {

    public static void main(String[] args) {
        int X=1;
        int Y=7;
        double Z=10.5;
        System.out.printf("El valor de %d + %d + %.1f = %.2f\n",X,Y,Z,(X+Y+Z));
        System.out.printf("El valor de (%d + %d + %.1f)/3 = %.3f\n",X,Y,Z,(X+Y+Z)/3);
        System.out.printf("El valor de %d * %d * %.1f = %.2f\n",X,Y,Z,(X*Y*Z));
        System.out.printf("El cociente de los 3 numeros es: %.5f\n",X/(Y*Z));
        System.out.printf("El modulo de los 3 numeros es = %d\n",(int)(X%(Z*Y)));
    }
}
