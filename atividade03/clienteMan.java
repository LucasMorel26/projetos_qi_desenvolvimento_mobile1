package atividade03;

import java.util.Scanner; 

public class clienteMan {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        cliente veri = new cliente();

        System.out.println("Qual seu nome? ");
        veri.setNome(ler.nextLine());

        System.out.println("\nQual a sua idade? ");
        veri.setIdade(ler.nextInt());
        
        System.out.println("\nQual a sua renda mensal? ");
        veri.setRenda(ler.nextDouble());
        
        System.out.println("\nSeus dados: "+veri.toString()+
                           "\nPossui a maioridade? "+veri.verificarIdade()+
                           "\nPossui condições de comprar algo bem caro? "+veri.verificarRenda());
    }    
}
