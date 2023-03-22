package com.exjavafxvi.javafxjml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;





public class Exercicio1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Aplicativo FXML UI");
        BorderPane root = FXMLLoader.load((getClass().getResource("/Layout.fxml")));
        Scene scene = new Scene(root,300,200);
        stage.setScene(scene);
        stage.show();
    }
}
