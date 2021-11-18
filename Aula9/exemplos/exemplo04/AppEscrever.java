package exemplos.exemplo04;

public class AppEscrever {
    public static void main(String[] args) {
        
        // Na aplicação, posso usar qualquer objeto que
        // siga o padrão Printable
        
        // Printable saida = new Tela();
        Printable saida = new Impressora();
        saida.escrever();
    }
}
