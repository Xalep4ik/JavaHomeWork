package com.pb.kh.hw15;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chat extends Application {
    private TextArea massages = new TextArea();
    private boolean isServer = false;
    private Network network = isServer ? createServer() : createClient();
    private Parent CreateScane (){
        massages.setPrefHeight(420);
        TextField tf = new TextField();
        Button button = new Button("Send");
        button.setPrefSize(50,50);
        button.setAlignment(Pos.TOP_CENTER);
        button.setOnAction(event -> {
            String massege = isServer ? "Server " : "Client ";
            massege += tf.getText();
            tf.clear();
            massages.appendText(massege + "\n");
            try {
                network.send(massege);
            }catch (Exception e){
                massages.appendText("Failed to send \n");
            }
        });
        tf.setOnAction(event  -> {
            String massege = isServer ? "Server \n" : "Client \n";
            massege += tf.getText();
            tf.clear();
            massages.appendText(massege + "\n");
            try {
                network.send(massege);
            }catch (Exception e){
                massages.appendText("Failed to send \n");
            }
        });
        VBox root = new VBox(20,massages,button,tf);
        root.setPrefSize(500, 500);
        return root;
    }

    @Override
    public void init() throws Exception {
        network.startConnection();
    }

    @Override
    public void stop() throws Exception {
        network.closeConnection();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private Server createServer (){
        return new Server(3000, data ->{
            Platform.runLater(() -> { massages.appendText(data.toString() + "\n");
        });
    });
    }
    public Client createClient (){
        return new Client("192.168.15.253",3000, data -> {
            Platform.runLater(() -> {
                massages.appendText(data.toString() + "\n");
            });
        });
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(CreateScane()));
        stage.setTitle("Chat");
        stage.show();
    }
}
