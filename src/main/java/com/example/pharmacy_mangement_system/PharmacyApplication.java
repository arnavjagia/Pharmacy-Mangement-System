package com.example.pharmacy_mangement_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PharmacyApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PharmacyApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 480);
        stage.setTitle("Pharmacy Management");
        stage.setScene(scene);
        stage.show();
    }
    // testing git

    public static void main(String[] args) {
        launch();
    }
}