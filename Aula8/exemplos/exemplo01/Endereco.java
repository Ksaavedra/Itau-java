package exemplos.exemplo01;

public class Endereco {
    private String nomeRua;
    private int numero;
    
    public Endereco() {
        nomeRua = "---";
    }

    public Endereco(String nomeRua, int numero) {
        this.nomeRua = nomeRua;
        this.numero = numero;
    }

    public String getEndereco() {
        return nomeRua + ", " + numero;
    }
}
