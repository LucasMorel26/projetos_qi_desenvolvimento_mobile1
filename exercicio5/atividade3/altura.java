package exercicio5.atividade3;

public class altura {
   public static void main(String[] args)
    {
        //m1 (mariazinha)
        //m2 (maricota)
        double m1 = 150;
        double m2 = 110;
        int ano = 0;
        
        while (m1 >= m2)
        {
            m1 = m1 + 2;
            m2 = m1 + 3;
            ano = ano + 1;
        }    
      
        System.out.println("A Maricota vai passar a Mariazinha daqui a exatos " + ano + " ano (s).");
    }
}
