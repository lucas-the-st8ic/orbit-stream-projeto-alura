package br.com.ProjetoAlura.OrbitStream.modelos.calculos;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTituloNoCalculo(Titulos novoTitulo){
        System.out.println("Adicionando duração em minutos de " + novoTitulo);
        this.tempoTotal += novoTitulo.getDuracaoEmMinutos();
    }

    /*public void incluirTituloNoCalculo(Filmes novoTitulo) {
        tempoTotal += novoTitulo.getDuracaoEmMinutos();
    }

    public void incluirTituloNoCalculo(Series novoTitulo) {
        tempoTotal += novoTitulo.getDuracaoEmMinutos();
    }*/
}
