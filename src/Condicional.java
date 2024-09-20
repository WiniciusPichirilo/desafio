public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 2020;
        boolean incluidoNoPano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";
        if (anoDeLançamento >= 2002){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
         System.out.println ("Filme retrô que vale apena assistir!");
        }
        if (incluidoNoPano == true  && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    }
}
