package exemplos.exemplo01;

public class Pessoa {
    private String nome;
    private Endereco endereco; // pessoa tem um enderenço

    public Pessoa(){

        nome = "---";
        endereco = new Endereco();

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome + ": " + nome.length();
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Enderenço: " + endereco.getEndereco());
    }
}
