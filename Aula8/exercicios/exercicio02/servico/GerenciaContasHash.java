package exercicios.exercicio02.servico;

import java.util.HashMap;

import exercicios.exercicio02.modelo.Conta;
import exercicios.exercicio02.modelo.ContaCorrente;
import exercicios.exercicio02.modelo.ContaEspecial;
import exercicios.exercicio02.modelo.ContaPoupanca;

public class GerenciaContasHash {
    private HashMap<Integer, Conta> contas;

    public GerenciaContasHash() {
        contas = new HashMap<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        Conta conta = contas.get(numeroConta);

        if(conta != null) {
            return conta.depositar(valor);
        }
        return false; // não encontrou a conta
    }

    public String consultaSaldo(int numeroConta) {
        Conta conta = contas.get(numeroConta);

        if(conta != null) {
            return conta.toString();
        }
        return "Conta não encontrada.";
    }

    public boolean sacar(int numeroConta, double valor) {
        return false;
    }

}