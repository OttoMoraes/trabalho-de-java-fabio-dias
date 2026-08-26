import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double saldo = 0.0;
        boolean sistemaAtivo = true;

        while (sistemaAtivo) {

            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Valor de saque inválido.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 0:
                    sistemaAtivo = false;
                    System.out.println("Sistema encerrado. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}