package notifier;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        Application.launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) {
        VBox vlayout = new VBox();
        Button button = new Button("Update");
        Label label = new Label();
        TextField tf = new TextField();

        button.setOnAction((event) -> {
            label.setText(tf.getText());
        });

        vlayout.setSpacing(10);
        vlayout.getChildren().addAll(tf, button, label);

        Scene view = new Scene(vlayout);

        window.setScene(view);
        window.show();

    }

}
