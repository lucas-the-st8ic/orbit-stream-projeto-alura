package br.com.ProjetoAlura.OrbitStream.modelos.classes;

import br.com.ProjetoAlura.OrbitStream.modelos.calculos.Classificacoes;

public class Filmes extends Titulos implements Classificacoes {

    private String diretor;

    public Filmes(String nomeDoTitulo, int anoDeLancamento) {
        super(nomeDoTitulo, anoDeLancamento);

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getclassificacao() {
        return (int) calculaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNomeDoTitulo() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
