package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;


import java.awt.*;

import static java.awt.Color.*;
import static javafx.scene.text.Font.font;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /**
         * using an FXML FILE
         */
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        /**
         * without using the Fxml file
         */
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        Label greeting = new Label("Welcome to JavaFX");
        greeting.setTextFill(javafx.scene.paint.Color.GREEN);
        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(greeting);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 900, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
