package br.com.ProjetoAlura.OrbitStream.modelos.classes;

import br.com.ProjetoAlura.OrbitStream.modelos.calculos.Classificacoes;

public class Episodios implements Classificacoes {
    private String tituloDoEpisodio;
    private int numeroDoEpisodio;
    private Series serie;
    private int totalDeVisualizacoes;


    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public String getTituloDoEpisodio() {
        return tituloDoEpisodio;
    }

    public void setTituloDoEpisodio(String tituloDoEpisodio) {
        this.tituloDoEpisodio = tituloDoEpisodio;
    }

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getclassificacao() {
        if (totalDeVisualizacoes >= 100) {
                return 4;
        } else {
            return 2;
        }
    }
}
