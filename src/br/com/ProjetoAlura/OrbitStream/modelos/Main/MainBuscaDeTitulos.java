package br.com.ProjetoAlura.OrbitStream.modelos.Main;

import br.com.ProjetoAlura.OrbitStream.excecao.ErroDeConversaoDeAnoException;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.TituloOmdb;
import br.com.ProjetoAlura.OrbitStream.modelos.classes.Titulos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBuscaDeTitulos {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome de um titulo para buscar no catálogo: ");
        var buscaDeTitulos = input.nextLine();
        buscaDeTitulos = buscaDeTitulos.replace(" ", "+");

        String endereco = "https://www.omdbapi.com/?t=" + buscaDeTitulos + "&apikey=32905f12";

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meutituloOmdb = gson.fromJson(json, TituloOmdb.class);
            //try {
            Titulos meutitulo = new Titulos(meutituloOmdb);
            System.out.println(meutitulo);

            FileWriter textoDescritivo = new FileWriter("filmes.txt");
            textoDescritivo.write(meutitulo.toString());
            textoDescritivo.close();

        } catch (NumberFormatException e) {
            System.out.println("Erro!!");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programa finalizado.");



    }
}
