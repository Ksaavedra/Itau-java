package exercicios.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Kelly", "(11) 99999-9999");
        System.out.println(pessoa);

        Estudante aluno = new Estudante("David", "(11) 77777-9999", "Operadora produção");
        System.out.println(aluno);

        Professor professor = new Professor("Gilberto", "(11) 88888-8888", 3000);
        System.out.println(professor);
    }
}
