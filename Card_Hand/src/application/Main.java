package application;
	
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Random random = new Random();
			FlowPane root = new FlowPane();
			ArrayList<Image>cards = new ArrayList<Image>();
			ArrayList<String>images = new ArrayList<String>();
			for(int i = 0; i < 53; i++)
			{
				cards.add(new Image(new File("cards/" + i + ".png").toURI().toString()));
			}
		     root.setAlignment(Pos.CENTER);
		     root.setVgap(8);
		     root.setHgap(4);
		     root.setPrefWrapLength(400); // preferred width = 300
		     for (int i = 0; i < 7; i++) {
		         ImageView iv = new ImageView(cards.get(random.nextInt(53)));
		         iv.setFitHeight(141);
		         iv.setFitWidth(100);
				root.getChildren().add(iv);
		     }

			Scene scene = new Scene(root,330,460);
			scene.setFill(Color.web("#35654d"));
			primaryStage.setScene(scene);
			primaryStage.setTitle("Your Hand");
			primaryStage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
