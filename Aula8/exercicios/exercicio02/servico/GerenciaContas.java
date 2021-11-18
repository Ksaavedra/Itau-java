package exercicios.exercicio02.servico;

import java.util.ArrayList;

import exercicios.exercicio02.modelo.Conta;
import exercicios.exercicio02.modelo.ContaCorrente;
import exercicios.exercicio02.modelo.ContaEspecial;
import exercicios.exercicio02.modelo.ContaPoupanca;

public class GerenciaContas {
    private ArrayList<Conta> contas;

    public GerenciaContas() {
        contas = new ArrayList<>();
    }

    public void novaContaCorrente(int numeroConta) {
        contas.add(new ContaCorrente(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        contas.add(new ContaEspecial(numeroConta, limite));
    }

    public void novaContaPoupanca(int numeroConta) {
        contas.add(new ContaPoupanca(numeroConta));
    }

    public boolean depositar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) {
                return conta.depositar(valor);
            }
        }
        return false; // não encontrou a conta
    }

    public boolean sacar(int numeroConta, double valor) {
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) {
                return conta.sacar(valor);
            }
        }
        return false; // não encontrou a conta
    }

    public String consultaSaldo(int numeroConta) {
        for (Conta conta : contas) {
            if(conta.getNumero() == numeroConta) {
                return conta.toString();
            }
        }
        return "Conta não encontrada.";
    }
}
