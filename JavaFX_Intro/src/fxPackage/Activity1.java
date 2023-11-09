package fxPackage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Activity1 extends Application{

	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
        try 
        {
        	Button b1 = new Button("Button 1");
        	Button b2 = new Button("Button 2");
        	
        	HBox hb = new HBox();
        	hb.setAlignment(Pos.CENTER);
        	hb.getChildren().add(b1);
        	hb.getChildren().add(b2);
        	hb.setSpacing(10);
        	hb.setStyle("-fx-background-color: #00FFFF;");
        	
        	Label l1 = new Label("Top Text for the vbox.");
        	Label l2 = new Label("Bottom text for the vbox.");
        	
        	b1.setOnAction((event)-> { //lambda expression
        		l1.setText("Button 1 has been pressed...");
        	});
        	
        	b2.setOnAction((event)-> { //lambda expression
        		l2.setText("Button 2 has been pressed...");
        	});
        	
        	VBox root = new VBox();
        	root.setAlignment(Pos.TOP_CENTER);
        	root.getChildren().add(l1);
        	root.getChildren().add(l2);
        	root.getChildren().add(hb);
        	root.setPadding(new Insets(15,15,15,15));
        	root.setSpacing(10);
        	Scene mainScene = new Scene(root, 400, 200);
        	primaryStage.setMinHeight(150);
        	primaryStage.setMinWidth(200);
        	primaryStage.setScene(mainScene);
        	primaryStage.show();
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
        }
	}

}
