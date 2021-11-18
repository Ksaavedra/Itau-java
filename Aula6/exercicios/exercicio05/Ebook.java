package exercicios.exercicio05;

public class Ebook {
    //atributos
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    //construdor
    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if(totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        }
        this.paginaAtual = 0; // sempre começa da pahina zero
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void mostrarCapa() {
        System.out.printf("Titulos: %s, Ator: %s, Total Páginas: %d\n", titulo, autor, totalPaginas);
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if(paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public void irPararPagina(int pagina) {
        if(pagina >= 0 && pagina <= totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public int exibirPagina() {
        return paginaAtual;
    }

}