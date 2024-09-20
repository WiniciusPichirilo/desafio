import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme Favorito!");
        String filme = leitura.nextLine();
        System.out.println("Quero saber o ano de lançamento");
        int anoDeLançamento = leitura.nextInt();
        System.out.println("Digite um numero de 0 a 9 para avaliar o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLançamento);
        System.out.println(avaliacao);

    }
}
