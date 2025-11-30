package br.com.ProjetoAlura.OrbitStream.modelos.classes;

public class Series extends Titulos {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean emLancamento;
    private int minutosPorEpisodio;

    public Series(String nomeDoTitulo, int anoDeLancamento) {
        super(nomeDoTitulo, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isEmLancamento() {
        return emLancamento;
    }

    public void setEmLancamento(boolean emLancamento) {
        this.emLancamento = emLancamento;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
