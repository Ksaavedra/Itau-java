package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Programa em Java", "José Ricardo Silva", 200);

        livro1.mostrarCapa();

        livro1.irPararPagina(100);

        livro1.retrocederPagina();
        System.out.println("Página atual: " + livro1.getPaginaAtual());
        
        livro1.avancarPagina();
        System.out.println("Página atual: " + livro1.getPaginaAtual());
    }
}
