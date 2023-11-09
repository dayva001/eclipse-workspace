package gui_package;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI_MainTest extends Application
{


	public static void main(String[] args) {
		Application.launch(args);
	}

	    public void start(Stage primaryStage) {
	        try {
	            // create a new Text shape
	            Text messageText = new Text("Hello gooey World!\n Time to make some JavaFX GUI's");
	             
	            // stack page
	            StackPane root = new StackPane();
	             
	            // add Text shape to Stack Pane
	            root.getChildren().add(messageText);
	             
	            Scene scene = new Scene(root,400,400);
	            primaryStage.setScene(scene);
	            primaryStage.show();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }

}
