/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package yo.numeroprimo;
import java.util.Scanner;

/**
 *
 * @author HP GAMER
 */
public class Numeroprimo {

    public static void main(String[] args) {
        int x,cont=1,i=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite un numero para determinar si es primo: ");
        x = sc.nextInt();
        while(i<x){
            if((x%i)==0){
                cont=2;
            }
            i++;
        }
        if((cont==2)||(x==0)||(x==1)){
            System.out.printf("El numero %d no es primo",x);
        } else{
            System.out.printf("El numero %d es primo",x);
        }
    }
}
