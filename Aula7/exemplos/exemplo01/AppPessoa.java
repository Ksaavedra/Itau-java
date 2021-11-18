package exemplos.exemplo01;

public class AppPessoa {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        Professor prof = new Professor("Carlos", 3000);
        Professor prof2 = new Professor("Roberto");

        System.out.println(prof.getNome());
        System.out.println(prof.getSalario());

        System.out.println(prof2.getNome());
        System.out.println(prof2.getSalario());

        System.out.println(prof);
        System.out.println(prof.toString());
        
    }
}
