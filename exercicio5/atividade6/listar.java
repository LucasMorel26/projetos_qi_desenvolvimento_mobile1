package exercicio5.atividade6;

import java.util.ArrayList;

public class listar {
   public static void main(String[] args) {
        int soma = 0, count = 0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        do {
            if (soma < 50) {
                soma = soma + 1;
                numeros.add(soma);
            }
        } while (soma < 50);

        System.out.println("Numeros listados de forma vertical...");
        for (int i = 0; i < 50; i++) {
            System.out.println(numeros.get(i));
        }

        for (int n = 0; n < numeros.size(); n++) {
            count = count + numeros.get(n);
        }
        
        System.out.println("Numero listados de forma horizontal...");
        System.out.println(numeros);
        System.out.println("O tamanho do ArraList é: " + numeros.size());
        System.out.println("A soma de todos os numeros: " + count);
        
    }
}
