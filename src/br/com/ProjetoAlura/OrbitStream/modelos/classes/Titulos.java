package br.com.ProjetoAlura.OrbitStream.modelos.classes;

import com.google.gson.annotations.SerializedName;

public class Titulos implements Comparable<Titulos> {
    @SerializedName("Title")
    private String nomeDoTitulo;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulos(String nomeDoTitulo, int anoDeLancamento) {
        this.nomeDoTitulo = nomeDoTitulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulos(TituloOmdb meutituloOmdb) {
        this.nomeDoTitulo = meutituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meutituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meutituloOmdb.runtime().substring(0, 3));
    }

    public String getNomeDoTitulo() {
        return nomeDoTitulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNomeDoTitulo(String nomeDoTitulo) {
        this.nomeDoTitulo = nomeDoTitulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void demonstraFichaTecnica () {
        System.out.println("TÍTULO: " + nomeDoTitulo);
        System.out.println("ANO DE LANÇAMENTO: " +anoDeLancamento);
        System.out.println("DURAÇÃO(minutos): " +duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double calculaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulos outroTitulo) {
        return this.getNomeDoTitulo().compareTo(outroTitulo.getNomeDoTitulo());
    }

    @Override
    public String toString() {
        return "Título: " +nomeDoTitulo+"\nAno de Lançamento: " +anoDeLancamento+ "\nDuração em Minutos: " +duracaoEmMinutos+ "\n";
    }
}
