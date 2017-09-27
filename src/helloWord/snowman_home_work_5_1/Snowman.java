package helloWord.snowman_home_work_5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;




public class Snowman extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        primaryStage.setWidth(900);
        primaryStage.setHeight(900);

        Pane root = new Pane();

        root.getChildren().addAll(generateCircles(5));


        //Создаем кнопки
        Button button = new Button();
        button.setTranslateX(750);
        button.setTranslateY(20);
        button.setText("Нажми меня");
        button.setOnMouseClicked(event ->{
            root.getChildren().clear();

            root.getChildren().addAll(generateCircles(5));
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
                    00,
                    00,
                    random.nextDouble(),
                    0.7f);

            circles[i] = new Circle(
                    100,
                    random.nextInt(650),
                    random.nextInt(80),
                    Paint.valueOf(color.toString()));

        }
        return  circles;
    }

}

