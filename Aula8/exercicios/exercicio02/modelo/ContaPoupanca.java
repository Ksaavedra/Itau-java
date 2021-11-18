package exercicios.exercicio02.modelo;

public class ContaPoupanca extends Conta {
    // static = este atributo é da classe e não de um objeto particular
    // teremos uma taxaSaque que será única, a masma para todos os obejtos
    private static double taxaSaque = 0.1;

    public ContaPoupanca(int numero) {
        super(numero);
    }

    // static = este é um método da classe e não de um objeto particular
    // a chamada deste método é feita a partir do nome da classe, exemplo:
    // ContaPoupanca.setTaxa(0.1)
    public static void setTaxa(double novaTaxa) {
        if(novaTaxa > 0) {
            taxaSaque = novaTaxa;
        }
    } 

    @Override
    public boolean sacar(double valor) {
        if(getSaldo() >= valor + taxaSaque) {
            return super.sacar(valor + taxaSaque);
        }
        return false;
    }

    @Override
    public String toString() {
        return "cp: " + super.toString() + " taxa: " + taxaSaque;
    }
}