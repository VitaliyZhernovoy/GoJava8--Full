package helloWord.snowman_home_work_5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;




public class Snowman extends Application {
    private final int WIND_WIDTH=800;
    private final int WIND_HEIGHT=600;
    @Override
    public void start (Stage primaryStage) throws Exception {

        //создае само окно
        primaryStage.setWidth(WIND_WIDTH);
        primaryStage.setHeight(WIND_HEIGHT);

       //создаем экран
        Pane root = new Pane();
        VBox vBox = new VBox();
        vBox.setTranslateX(620);
        vBox.setTranslateY(40);

       // создаем текстовое окно
        TextField textField = new TextField();

        // подписываем текстовое окно
        Label label = new Label("введите число int");

        // создаем второе текстовое окно
        TextField textField2 = new TextField();

        // подписываем второе текстовое окно
        Label label2 = new Label("введите max радиус");

        // создаем  третье текстовое окно
        TextField textField3 = new TextField();

        // подписываем  третье текстовое окно
        Label label3 = new Label("введите min радиус");


       //Создаем кнопку
        Button button = new Button();
        button.setText("Нажми меня");


        //выводим кнопку и текстовые поля с подписями
        vBox.getChildren().addAll(label,textField,label2,textField2,label3,textField3,button);
        root.getChildren().addAll(vBox);

        button.setOnMouseClicked(event ->{
            root.getChildren().clear();

            int countCirecle = Integer.parseInt(textField.getText());
            int minRadius = Integer.parseInt(textField2.getText());
            int maxRadius = Integer.parseInt(textField3.getText());
            root.getChildren().addAll(generateCircles(countCirecle,minRadius,maxRadius));
            root.getChildren().addAll(vBox);

        });


        //Circle circle = new Circle(50,50,40, Paint.valueOf("#00FF00"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private Circle[] generateCircles(int count,int minRadius,int maxRadius){
        Random random = new Random();

        int sumRadius = 0;
        Circle[] circles = new Circle[count+3];

        for(int i = 0; i < circles.length-3; i++){

            Color color = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble(),
                    0.7f);

            int radius = minRadius + random.nextInt(maxRadius);
            int centerY = WIND_HEIGHT - sumRadius - radius - 40;
            sumRadius = sumRadius + 2 * radius;
            circles[i] = new Circle(
                100,
                    centerY,
                    radius,
                    Paint.valueOf(color.toString()));
            if (i==circles.length-4){
                circles[i+1] = new Circle(
                        100+radius/2,
                        centerY-radius/2,
                        radius/7,
                        Paint.valueOf(color.toString()));
                circles[i+2] = new Circle(
                        100-radius/2,
                        centerY-radius/2,
                        radius/7,
                        Paint.valueOf(color.toString()));
                circles[i+3] = new Circle(
                        100,
                        centerY+1,
                        radius/10,
                        Paint.valueOf(color.toString()));
            }
        }

        return  circles;
    }

}

