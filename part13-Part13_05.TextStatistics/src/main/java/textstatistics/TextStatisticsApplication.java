package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;


public class TextStatisticsApplication extends Application {
    
    public static void main(String[] args) {
        Application.launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        TextArea textArea = new TextArea("");
        HBox horizontal = new HBox();
        
        layout.setCenter(textArea);
        horizontal.setSpacing(10);
        horizontal.getChildren().add(new Label("Letters: 0"));
        horizontal.getChildren().add(new Label("Words: 0"));
        horizontal.getChildren().add(new Label("The longest word is:"));
        
        layout.setBottom(horizontal);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
    
}
