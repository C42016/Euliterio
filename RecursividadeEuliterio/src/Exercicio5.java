
import java.util.Vector;
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
public class Exercicio5 {
        private static Vector<String> Combinacoes(char[] numeros, int tamaho, int num, int seach) {
        if (num == tamaho)
            return Combinacoes(numeros, tamaho, num, seach);
         //Combinacoes(numeros, tamaho, num + 1, seach).add(String.valueOf(numeros[i]));
        return Combinacoes(numeros, tamaho, num + 1, seach);

    }

    public static void main(String[] args) {

        int tamanho;
        String Alfa;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero"));
        String alfabeto="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Alfa= alfabeto.substring(0, numero);
        tamanho = Alfa.length();
        //System.out.println(Combinacoes(Alfa, tamanho, 0, Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero que desejas rocurar"))));
    } 
}
