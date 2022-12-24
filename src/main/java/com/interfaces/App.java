
package com.interfaces;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Hello world!
 * How to Package: https://youtu.be/EyYb0GmtEX4
 * VSCode and JavaFX: https://youtu.be/H67COH9F718
 * Support to Run Java in Visual Studio: https://youtu.be/Rp1UZsPuO04
 * VSCode Config for JavaFX: https://youtu.be/AubJaosfI-0
 * VSCode and Java: https://youtu.be/eFa5NkFM0fg
 */

 public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
