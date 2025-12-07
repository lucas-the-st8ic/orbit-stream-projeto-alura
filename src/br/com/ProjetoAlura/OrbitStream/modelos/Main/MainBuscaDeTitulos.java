package br.com.ProjetoAlura.OrbitStream.modelos.Main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBuscaDeTitulos {
    static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome de um titulo para buscar no catálogo");
        var buscaDeTitulos = input.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + buscaDeTitulos + "&apikey=32905f12";


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        
        System.out.println(response.body());

    }
}
