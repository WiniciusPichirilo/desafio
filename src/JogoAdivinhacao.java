import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // Gerar número aleatório entre 0 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);

        // Variáveis para o jogo
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;
        int chute;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

        // Loop para controlar as tentativas
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            chute = scanner.nextInt(); // Ler o palpite do usuário

            if (chute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                acertou = true;
                break; // Interrompe o loop se o jogador acertar
            } else if (chute < numeroAleatorio) {
                System.out.println("O número é maior do que " + chute + ".");
            } else {
                System.out.println("O número é menor do que " + chute + ".");
            }
        }

        // Se o jogador não acertar após todas as tentativas
        if (!acertou) {
            System.out.println("Você não conseguiu adivinhar o número. O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}
