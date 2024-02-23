package primeiro_exemplo.modelos;

public class Pessoa {
     //atributos de uma classe
    private String nome;
    private int idade;

    // metodos, verdadeiro ou falso
    public boolean verifcarMaioridade() {
        return this.idade >= 18;        
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}
