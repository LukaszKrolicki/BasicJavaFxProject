package com.jmc.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Platform.setImplicitExit(false);

        System.out.println(Thread.currentThread().getName());
       VBox root = new VBox();
       root.setAlignment(Pos.CENTER);
       root.setPadding(new Insets(20,20,20,20));
       root.setSpacing(20);
       Label text= new Label("");

       Button button= new Button("Click me");
       button.setOnAction(e->text.setText("Exit"));

       Button button2= new Button("Exit");
       button2.setOnAction(e->{
           Platform.exit();

       });

       root.getChildren().addAll(text,button,button2); //adding to the root

        Scene scene = new Scene(root,350,300);
        stage.setScene(scene);
        stage.setTitle("JavaFX application");
        stage.show();
    }

    @Override
    public void stop(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing application");
    }

    public static void main(String[] args){
        launch();
    }
}