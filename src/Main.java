public class Main {
    static void main(String[] args) {
        Filmes meuFilme = new Filmes();
        meuFilme.nomeDoFilme = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 3;
        meuFilme.duracaoEmMinutos = 177;

        System.out.println("FILME: " +meuFilme.nomeDoFilme);
        System.out.println("ANO DE LANÇAMENTO: " +meuFilme.anoDeLancamento);
    }
}
