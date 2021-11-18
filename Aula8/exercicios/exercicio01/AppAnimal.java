package exercicios.exercicio01;

public class AppAnimal {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lulu", "Pitbull", 2011); // proprietario não informado
        Animal a2 = new Animal("Rex", "Pintcher", 2011, "Carlos", "(11) 99999 - 9999"); // proprietario informado

        System.out.println(a1);
        System.out.println(a2);

        // primeira solução para troca o proprietario do aminal (Criar o obejo Proprietario externamente)
        Proprietario proprietario = new Proprietario("Elizabeth", "(11) 88888 - 88888");
        a1.setProprietario(proprietario);
        System.out.println(a1);

        // segunda solução para troca o proprietario do aminal (Criar o obejo Proprietario internamente)
        a1.setProprietario("Kelly", "(11) 77777- 7777");
        System.out.println(a1);
    }
}
