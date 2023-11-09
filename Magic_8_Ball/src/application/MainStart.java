package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class MainStart extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
				BorderPane root = new BorderPane();
				MagicEightBall ball = new MagicEightBall();
				Button button = new Button("Ask Question.");
				root.setCenter(ball);
				root.setAlignment(ball, Pos.CENTER);
				root.setBottom(button);
				root.setAlignment(button, Pos.CENTER);
				root.setMargin(button, new Insets(12,12,12,12));
	        	Scene mainScene = new Scene(root, 400, 500);
				primaryStage.setTitle("Magic Eight Ball");
				primaryStage.setScene(mainScene);
				primaryStage.setResizable(false);
				primaryStage.show();
				
				button.setOnAction((event)-> { //lambda expression
					ball.showMystery();
	        		ball.showSaying();
	        	});
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
