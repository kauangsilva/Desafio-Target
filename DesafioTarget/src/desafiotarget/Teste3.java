/* 
Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

*/
package desafiotarget;

/**
 *
 * @author Kauan
 */
public class Teste3 {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;
        
        do {
           k = k + 1;
           soma = soma + k;
           
        } while (k < indice);
        
         System.out.println(soma);
    }

    
}
