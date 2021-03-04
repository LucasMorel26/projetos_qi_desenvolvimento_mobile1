package atividade02;
    import java.util.Scanner;

public class ex01 {
    public static void name(String[] args) {
        double n;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um numero e com meus poderes descobrirei se ele é negativo ou positivo: ");
        n = ler.nextDouble();
        
        if(n < 0){
            System.out.println("Esse numero é negativo!!!!");
        }else if(n == 0){
            System.out.println("Esse numero não é nem negativo nem positivo, seu espertinho!!!!");
        }else{
            System.out.println("Esse numero é positivo!!!!");
        }
    }
}
