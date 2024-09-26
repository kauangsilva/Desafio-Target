
/*
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que 
ela ocorre.
*/
package desafiotarget;

import java.util.Scanner;

/**
 *
 * @author Kauan
 */
public class Teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine().toUpperCase();
        
        int contador = 0;
        
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            
            if (c == 'A') {
                contador++;
            }
        }
        
        if (contador > 0) {
            System.out.println("A letra 'A' aparece "+ contador+ " vezes.");
        }
        else {
            System.out.println("A letra 'A' não aparece na palavra ");
        }
        input.close();
    }
    
}
