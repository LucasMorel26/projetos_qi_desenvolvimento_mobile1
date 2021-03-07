package atividade03;

public class cliente{
    private String nome;
    private int idade;
    private Double renda;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public Double getRenda(){
        return renda;
    }
    public void setRenda(Double renda){
        this.renda = renda;
    }

    public String verificarIdade(){
        String resultado;
        if(idade < 18){
            resultado = "Não, você e menor de idade";
        }else{
            resultado = "Sim, você e maior de idade";
        }
        return resultado;
    }

    public String verificarRenda(){
        String resultado;
        
        if(renda <= 15000){
            resultado = "Não! Pois você é pé de chinelo";
        }else{
            resultado = "Sim! Pois você é playboy";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +"\nIdade: " + idade + "\nRenda: " + renda;
    }
}