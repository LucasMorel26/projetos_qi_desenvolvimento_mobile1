package atividade02;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        
        double n1,n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite dois numeros e direi quem pe maior (Não tente me enganar!!!!)");
        
        System.out.print("\nDigite o primeiro numero aqui: ");
        n1 = ler.nextDouble();
        
        System.out.print("\nDigite o segundo numero aqui: ");
        n2 = ler.nextDouble();
        
        if(n1 == n2){
            System.out.println("\nAmbos são o mesmo nuemro seu safadinho!!!!");
        }else if(n1 < n2){
            System.out.println("\nE o numero que é maior é o seu segundo numero que é: "+n2);
        }else{
            System.out.println("\nE o numero que é maior é o seu primeiro numero que é: "+n1);
        }
    }
}
