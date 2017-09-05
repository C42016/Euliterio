/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euliterio
 */
public class Exercicio2 {
    public static int Multiplicacao(int num1, int num2){
        if(num2==0){
            return 0;
        }
        return Multiplicacao(num1, num2-1)+num1;
    }
    public static void main(String[] args) {
        System.out.println(Multiplicacao(4, 100));
    }
 
}
