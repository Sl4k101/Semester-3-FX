package RNG;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class RandomNumberFX extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox();
        Button button = new Button("Generate Random Number");
        Label label = new Label();

        button.setOnAction(e -> {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            label.setText("Random Number: " + randomNumber);
        });

        vbox.getChildren().addAll(button, label);
        Scene scene = new Scene(vbox, 200, 100);

        stage.setScene(scene);
        stage.setTitle("Random Number Generator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

