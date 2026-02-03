package com.example.ClasseDoHeroi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HeroiApp extends Application {
    @Override
    public void start(Stage stage) {
        Label resultado = new Label();
        Button atacarBtn = new Button("Atacar");

        atacarBtn.setOnAction(e -> {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:8080/heroi/atacar?nome=Merlin&idade=150&tipo=mago"))
                    .build();

            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenAccept(response -> {
                        // Atualiza o Label com a resposta do backend
                        resultado.setText(response.body());
                    });
        });

        VBox root = new VBox(10, atacarBtn, resultado);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Jogo de Heróis");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
