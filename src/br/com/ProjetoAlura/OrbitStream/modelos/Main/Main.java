import br.com.ProjetoAlura.OrbitStream.modelos.classes.Episodios;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Filmes;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Series;
import br.com.ProjetoAlura.OrbitStream.modelos.calculos.CalculadoraDeTempo;
import br.com.ProjetoAlura.OrbitStream.modelos.calculos.Recomendacoes;

static void main(String[] args) {

    Filmes filme_cod001 = new Filmes("O Poderoso Chefão", 1972);

    //filme_cod001.setNomeDoTitulo("O poderoso chefão");
    //filme_cod001.setAnoDeLancamento(1972);

    filme_cod001.setIncluidoNoPlano(true);
    filme_cod001.setDuracaoEmMinutos(177);
    IO.println("Duração do Filme: " + filme_cod001.getDuracaoEmMinutos());

    filme_cod001.demonstraFichaTecnica();
    filme_cod001.avalia(8);
    filme_cod001.avalia(7.5);
    filme_cod001.avalia(9);
    filme_cod001.avalia(10);

    IO.println("Quantidade de avaliações: " + filme_cod001.getTotalDeAvaliacoes());
    IO.println("Nota média: " + filme_cod001.calculaMedia());

    Filmes filme_cod002 = new Filmes("Avatar", 2009);
    //filme_cod002.setNomeDoTitulo("Avatar");
    //filme_cod002.setAnoDeLancamento(2009);
    filme_cod002.setIncluidoNoPlano(true);
    filme_cod002.setDuracaoEmMinutos(162);


    Series Serie_cod001_Rick_And_Morty = new Series("Rick And Morty", 2013);
    //Serie_cod001_Rick_And_Morty.setNomeDoTitulo("Rick And Morty");
    //Serie_cod001_Rick_And_Morty.setAnoDeLancamento(2013);
    Serie_cod001_Rick_And_Morty.setDuracaoEmMinutos(23);
    Serie_cod001_Rick_And_Morty.setMinutosPorEpisodio(23);
    Serie_cod001_Rick_And_Morty.demonstraFichaTecnica();

    Serie_cod001_Rick_And_Morty.setTemporadas(8);
    Serie_cod001_Rick_And_Morty.setEpisodiosPorTemporada(11);
    IO.println("Duração em minutos série completa: " + Serie_cod001_Rick_And_Morty.getDuracaoEmMinutos());

    CalculadoraDeTempo incluirTempo = new CalculadoraDeTempo();
    incluirTempo.incluirTituloNoCalculo(filme_cod001);
    incluirTempo.incluirTituloNoCalculo(filme_cod002);
    incluirTempo.incluirTituloNoCalculo(Serie_cod001_Rick_And_Morty);
    IO.println(incluirTempo.getTempoTotal());

    Recomendacoes filtroFilme_001 = new Recomendacoes();
    filtroFilme_001.filtra(filme_cod001);

    Episodios novoEp_Piloto_00 = new Episodios();
    novoEp_Piloto_00.setNumeroDoEpisodio(0);
    novoEp_Piloto_00.setSerie(Serie_cod001_Rick_And_Morty);
    novoEp_Piloto_00.setTotalDeVisualizacoes(500);

    filtroFilme_001.filtra(novoEp_Piloto_00);

    Filmes filme_cod003 = new Filmes("Tróia", 2004);
    //filme_cod003.setNomeDoTitulo("Tróia");
    //filme_cod003.setAnoDeLancamento(2004);
    filme_cod003.setIncluidoNoPlano(true);
    filme_cod003.setDuracaoEmMinutos(170);
    filme_cod003.avalia(10);

    ArrayList<Filmes> coletaneaDeFilmes = new ArrayList<>();
    coletaneaDeFilmes.add(filme_cod001);
    coletaneaDeFilmes.add(filme_cod002);
    coletaneaDeFilmes.add(filme_cod003);

    IO.println("Tamanho da lista de filmes: " + coletaneaDeFilmes.size());
    IO.println("Nome do Filme: " + coletaneaDeFilmes.get(0).getNomeDoTitulo());
    IO.println(coletaneaDeFilmes);
    IO.println(coletaneaDeFilmes.get(0).toString());


}
