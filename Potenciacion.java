/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yo.potenciacion;
import java.util.Scanner;
/**
 *
 * @author HP GAMER
 * Implementa un algoritmo que resuelva
 * la potenciacion
 */
public class Potenciacion {

    public static void main(String[] args) {
        int b,e,mult,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite la base:");
        b=sc.nextInt();
        System.out.println("Digite el exponente:");
        e=sc.nextInt();
       if(b==0){
           mult=0;
       }else{
           mult=1;
       }
        while(i<=e){
            mult=mult*b;
            i++;
        }
        System.out.printf("El resultado de la potencia %d^%d es = %d\n",b,e,mult);
    }
}
