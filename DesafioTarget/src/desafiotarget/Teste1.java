/*
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
escreva um programa na linguagem que desejar onde, informado um número, 
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/
package desafiotarget;

import java.util.Scanner;

/**
 *
 * @author Kauan
 */
public class Teste1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        if (fibonacci(numero)) {
            System.out.println(numero+ " Pertence a sequência de fibonacci.");
        }
        else {
            System.out.println(numero+ " Não pertence a sequência de fibonacci");
        }
        input.close();
    }
    
    public static boolean fibonacci(int num) {
    int a = 0;
    int b = 1;
    
   if (num == a || num == b) {
       return true; // numero é 0 ou 1
   }
    
    while (b < num) {
    int next = a + b;
    a = b;
    b = next;
}
   return (b == num); // Ver se o número está na sequência
    
}
}
