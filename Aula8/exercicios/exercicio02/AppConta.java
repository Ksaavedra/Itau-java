package exercicios.exercicio02;

import java.util.Scanner;

import exercicios.exercicio02.servico.GerenciaContasHash;

public class AppConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        GerenciaContasHash contas = new GerenciaContasHash();

        while (opcao != 7){

            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupança");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Fecha Programa");
            System.out.println("--> ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaCorrente(numeroConta);
                    break;

                case 2:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o limite da Conta: ");
                    limite = teclado.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;
                
                case 3:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;

                case 4:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o número da Conta: ");
                    valor = teclado.nextDouble();

                    if(contas.depositar(numeroConta, valor)) {
                        System.out.println("Depósito realizado.");
                    } else {
                        System.out.println("Falha ma operação.");
                    }
                    break;

                case 5: 
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor: ");
                    valor = teclado.nextDouble();

                    if(contas.sacar(numeroConta, valor)) {
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Falha ma operação.");
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da Conta: ");
                    numeroConta = teclado.nextInt();

                    System.out.println(contas.consultaSaldo(numeroConta));
                    break;

                case 7:
                    break;

                default: // se não for nenhum das opções acima
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        teclado.close();
    }
}
