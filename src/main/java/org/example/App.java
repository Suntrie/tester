package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        var flowPane =new FlowPane();
        flowPane.setOrientation(Orientation.VERTICAL);
        var scene = new Scene(flowPane, 640, 480);
        stage.setScene(scene);
        FXMLLoader loader = new FXMLLoader();
        loader.setController(new Controller());

        for(int i=0; i<3; i++) {
            FXMLLoader resLoader = new FXMLLoader(getClass().getResource("/cell.fxml"));

            resLoader.setLocation(getClass().getResource("/cell.fxml"));
            ImageView a = resLoader.load();
            a.setId(i+"");
            flowPane.getChildren().add(a);
        }
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}