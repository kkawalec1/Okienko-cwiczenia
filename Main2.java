package aplikacja;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,600,400, Color.LIGHTSKYBLUE);
        Stage stage = new Stage();
//-----------------------------------------------------------------------
        Text text = new Text();
        text.setText("Przykład");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Cambria",50));
        text.setFill((Color.DARKRED));
//------------------------------------------------------------------------
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.DARKBLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.RED);
 //-------------------------------------------------------------------------
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.BLACK);
//-----------------------------------------------------------------------
        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.YELLOW);

//-------------------------------------------------------------------------
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.1);
        line.setRotate(45);
//------------------------------------------------------------------------
        Image image = new Image("pobrane.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(150);
        imageView.setY(150);
        imageView.setFitHeight(100); //ustawia wielkość obrazu
        imageView.setFitWidth(150);
//------------------------------------------------------------------------
        Image icon = new Image("icon.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Prezentacja sceny");
//------------------------------------------------------------------------
        root.getChildren().add(text);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(line);
        root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();


    }
}
