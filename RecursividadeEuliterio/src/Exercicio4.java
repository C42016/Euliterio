
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
public class Exercicio4 {
      private static int Vezes(String numeros, int tamaho, int num, int seach) {
        if (num == tamaho) {
            return 0;
        } else if (seach == Integer.parseInt(numeros.substring(num, num + 1))) {
            return Vezes(numeros, tamaho, num + 1, seach) + 1;
        }
        return Vezes(numeros, tamaho, num + 1, seach);

    }

    public static void main(String[] args) {

        int tamanho;
        String numero = JOptionPane.showInputDialog("Escreva o numero");
        tamanho = numero.length();
        System.out.println(Vezes(numero, tamanho, 0, Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero que desejas rocurar"))));
    }
}
