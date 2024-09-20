import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Dados iniciais do cliente
        String nome = "Winicius Pichirilo";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        // Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Exibir informações iniciais
        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        // Menu de operações
        do {
            System.out.println("\nOperações:");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Consultar saldo
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    // Receber valor
                    System.out.print("Digite o valor a ser recebido: R$ ");
                    double valorRecebido = scanner.nextDouble();
                    saldo += valorRecebido; // Adicionar valor ao saldo
                    System.out.println("Valor recebido com sucesso! Saldo atualizado: R$ " + saldo);
                    break;

                case 3:
                    // Transferir valor
                    System.out.print("Digite o valor a ser transferido: R$ ");
                    double valorTransferido = scanner.nextDouble();

                    // Verificar se há saldo suficiente
                    if (valorTransferido > saldo) {
                        System.out.println("Saldo insuficiente para transferência.");
                    } else {
                        saldo -= valorTransferido; // Subtrair valor do saldo
                        System.out.println("Transferência realizada com sucesso! Saldo atualizado: R$ " + saldo);
                    }
                    break;

                case 4:
                    // Sair
                    System.out.println("Encerrando o sistema... Obrigado por utilizar nossos serviços.");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }

        } while (opcao != 4); // O menu continua até o usuário escolher a opção de sair

        scanner.close(); // Fechar o scanner após o uso
    }
}
