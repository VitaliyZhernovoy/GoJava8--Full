package vebinags.vebinar5_static_final_JavaFX;

import javafx.application.Application;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

public class Program extends Application {
    @Override
   public void stsrt (Stage primaryStage) throws Exception {
        primaryStage.setWidth(700);
        primaryStage.setHeight(700);

       Pane root = new Pane();

        Circle circle = new Circle(50,50,40, Paint.valueOf("#00FF00"));
        root.getChildren().addAll(circle);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

      primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
