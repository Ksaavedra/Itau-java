package exemplos.exemplo04;

public class Pessoa {
    String nome;
    int idade;

    // médodo construtor
    Pessoa(String nome, int idade) {
        // this se refere ao próprio objeto
        // o 'nome' do objeto recebe o valor do parâmetro 'nome'
        this.nome = nome;
        this.idade = idade;
    }
 
    // métodos = ações
    void apresentar() {
        System.out.printf("Olá! Eu sou %s e tenho %d anos\n", nome, idade);
    }
}
