/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package ImageView;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author sachi
 */
public class ImageVieww extends Application {
    
    @Override
    public void start(Stage primaryStage)  {
        
        try{
        
        Parent root = FXMLLoader.load(getClass().getResource("ImageVieww.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }catch(Exception e){
    e.printStackTrace();
}
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
