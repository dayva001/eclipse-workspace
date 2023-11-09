package fxPackage;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Activity2 extends Application
{

	public static void main(String[] args) 
	{
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage){
		try {
			Rectangle r1 = new Rectangle(100,100, Color.AQUA);
			Rectangle r2 = new Rectangle(100,100, Color.RED);
			Rectangle r3 = new Rectangle(100,100, Color.GREEN);
			Rectangle r4 = new Rectangle(100,100, Color.YELLOW);
			Rectangle r5 = new Rectangle(100,100, Color.PURPLE);
			Rectangle r6 = new Rectangle(100,100, Color.PINK);
			Rectangle r7 = new Rectangle(100,100, Color.BROWN);
			Rectangle r8 = new Rectangle(100,100, Color.ORANGE);
			Rectangle r9 = new Rectangle(100,100, Color.BLACK);
			
			GridPane root = new GridPane();
			
			root.setAlignment(Pos.CENTER);
			root.setHgap(15);
			root.setVgap(15);
			root.setPadding(new Insets(10,10,10,10));
			
			root.add(r1, 0, 0);
			root.add(r2, 1, 0);
			root.add(r3, 2, 0);
			root.add(r4, 0, 1);
			root.add(r5, 1, 1);
			root.add(r6, 2, 1);
			root.add(r7, 0, 2);
			root.add(r8, 1, 2);
			root.add(r9, 2, 2);
			
			Scene mainScene = new Scene(root,400,400);
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
