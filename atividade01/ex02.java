package atividade01;

import java.util.Scanner;

public class ex02 {
    
    double raio;
    
    static Scanner interacao = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do raio: ");
        double raio = interacao.nextDouble();
        
        System.out.println("O diametro é: "+(raio*2));
       
        System.out.println("E 1 quadrante é: "+((raio*2)/4));
    }
    
}