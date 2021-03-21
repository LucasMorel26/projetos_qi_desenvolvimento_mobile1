package exercicio5.atividade2;

import java.util.Scanner;

public class calculo {
   public static void main(String[] args) 
    {
        
        Scanner ler = new Scanner(System.in);
        
        double n, soma = 0;
        
        do
        {
            System.out.println("Digite quantos numeros quiser, vamos somar todos até que você digite 0: ");
            n = ler.nextDouble();
           
            soma += n;
                    
        }
        
        while(n != 0);
        
        System.out.println("Soma do valores: " + soma);
       
        
    }
}
