package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        Application.launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button button = new Button("this is button");
        TextField textField = new TextField();

        FlowPane component = new FlowPane();
        component.getChildren().add(button);
        component.getChildren().add(textField);

        Scene view = new Scene(component);
        window.setScene(view);
        window.show();
    }

}
