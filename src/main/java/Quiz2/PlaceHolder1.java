package Quiz2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PlaceHolder1 extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox();
        TextField textField = new TextField();
        Button button = new Button("Display Text");
        Label label = new Label();

        button.setOnAction(e -> {
            String text = textField.getText();
            label.setText("Entered Text: " + text);
        });

        vbox.getChildren().addAll(textField, button, label);
        Scene scene = new Scene(vbox, 300, 150);

        stage.setScene(scene);
        stage.setTitle("Text Display Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}