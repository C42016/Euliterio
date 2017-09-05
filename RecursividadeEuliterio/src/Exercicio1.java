/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euliterio
 */
public class Exercicio1 {
 private static int Binario(int valor, int num){
     if(valor/2==0){
         return 0;
     }
    num =Binario(valor=valor%2,num)+valor%2;
     System.out.println(num);
     return num;
 }
    public static void main(String[] args) {
        System.out.println(Binario(6,5));
    }
         
}
