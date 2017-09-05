
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author euliterio
 */
public class Exercicio3 {
    private static  int Soma(String numeros,int tamaho, int num){
        if(num ==tamaho)
            return 0;
        return  Soma(numeros, tamaho, num+1)+Integer.parseInt(numeros.substring(num, num+1));
    }
    public static void main(String[] args) {

        int tamanho ;
        String numero= JOptionPane.showInputDialog("Escreva o numero");
           tamanho=numero.length();
           System.out.println(Soma(numero, tamanho, 0));
    }
  
}
