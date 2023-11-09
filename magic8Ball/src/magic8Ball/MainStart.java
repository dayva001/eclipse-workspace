package magic8Ball;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainStart extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Magic Eight Ball");
		BorderPane bpane = new BorderPane();
		
		Magic8Ball ball = new Magic8Ball();
		
		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.CENTER);
		
		Button b1 = new Button();
		Button b2 = new Button();
		
		b1.setText("Ask Question");
		b1.setOnAction(event -> {
			ball.showSaying();
			});
		
		b2.setText("Mysterious Fog");
		b2.setOnAction(event -> {
			ball.showMystery();
		});
		
		hbox.getChildren().add(b1);
		hbox.getChildren().add(b2);
		bpane.setCenter(ball);
		bpane.setBottom(hbox);
		
		Scene sc = new Scene(bpane);
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	

}
