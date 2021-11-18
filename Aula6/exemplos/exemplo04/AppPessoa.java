package exemplos.exemplo04;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Beatriz", 34);
        Pessoa p2 = new Pessoa("Rodrigo", 23);
 
     //    p1.nome = "Beatriz";
     //    p1.idade = 34;
        p1.apresentar();
 
     //    p2.nome = "Rodrigo";
     //    p2.idade = 23;
        p2.apresentar();
     }
}
