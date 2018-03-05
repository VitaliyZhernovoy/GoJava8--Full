package vebinags.vebinar5_static_final_JavaFX;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

import java.util.Random;

public class Program extends Application {
    @Override
   public void start (Stage primaryStage) throws Exception {
        primaryStage.setWidth(900);
        primaryStage.setHeight(900);

       Pane root = new Pane();

       root.getChildren().addAll(generateCircles(35));
       root.getChildren().addAll(generateRectangles(10));

       //Создаем кнопки
        Button button = new Button();
        button.setTranslateX(20);
        button.setTranslateY(20);
        button.setText("Нажми меня");
        button.setOnMouseClicked(event ->{
            root.getChildren().clear();

            root.getChildren().addAll(generateCircles(35));
            root.getChildren().addAll(generateRectangles(10));
            root.getChildren().addAll(generateCircles(35));
            root.getChildren().addAll(button);

        });

        root.getChildren().addAll(button);

        //Circle circle = new Circle(50,50,40, Paint.valueOf("#00FF00"));

       Scene scene = new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    //
    private Circle[] generateCircles(int count){
        Random random = new Random();

        Circle[] circles = new Circle[count];
        for(int i = 0; i < circles.length; i++){

            Color color = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    0.7f);

            circles[i] = new Circle(
                    random.nextInt( 800),
                    random.nextInt( 800),
                    random.nextInt(85),
                    Paint.valueOf(color.toString()));
            }
            return  circles;
       }

       private Rectangle[] generateRectangles(int count){
           Random random = new Random();

           Rectangle[] rectangles = new Rectangle[count];
           for(int i = 0; i < rectangles.length; i++){

               Color color = Color.color(
                       random.nextDouble(),
                       random.nextDouble(),
                       random.nextDouble(),
                       0.7f);

               rectangles[i] = new Rectangle(
                       random.nextInt( 800),
                       random.nextInt( 800),
                       random.nextInt(185),
                       random.nextInt(185));
                       rectangles[i].setFill(Paint.valueOf(color.toString()));
           }
           return  rectangles;

       }
   }
