package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public static void main(String[] args) {
        Application.launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label west = new Label("WEST");
        Label east = new Label("EAST");
        layout.setTop(north);
        layout.setBottom(south);
        layout.setLeft(west);
        layout.setRight(east);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

}
