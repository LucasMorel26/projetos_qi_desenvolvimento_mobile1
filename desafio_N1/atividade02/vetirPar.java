package desafio_N1.atividade02;

import java.util.Scanner;
import java.util.Arrays;

public class vetirPar {
   public static void main(String[] args) {
        
        //Array
        int[] n = new int[20];
        
        //Variaveis
        int par=0, impar=0;

         for (int i = 0; i < n.length; i++) {
          n[i] = i+1;
        //Divizor em Par e Impar
         if(n[i]%2 ==0){
           par++;
         }else{
         impar++;
         }
        }
         //Impressão na tela
         Arrays.toString(n);
         System.out.println(Arrays.toString(n));

         System.out.println("Quantidade de impares: " + impar);
         System.out.println("Quantidade de pares: " + par);
    
  }
}
