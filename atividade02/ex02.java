package atividade02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[]args){
        
        double n1,n2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Me diga dois numeros diferentes (Não tente me enganar!!!!)");
        
        System.out.print("\nDigite o primeiro numero: ");
        n1 = ler.nextDouble();
        
        System.out.print("Digite o segundo nuemro: ");
        n2 = ler.nextDouble();
        
        if(n1 == n2){
            System.out.println("Seu safadinho, achou mesmo que eu não iria me tocar!!!!");
        }else{
            System.out.println("Vejo que você é alguem de palavra!!!!");
        }
    }
}
