package exemplos.exemplo01;

public class Pessoa {
    private String nome; // defaulf = padrão

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome: " + nome;
        
    }
}
