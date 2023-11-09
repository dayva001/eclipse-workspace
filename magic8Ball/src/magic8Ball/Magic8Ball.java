package magic8Ball;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Magic8Ball extends StackPane{
	
	private Label label = new Label();
	WiseSayings ws = new WiseSayings();
	
	public Magic8Ball() {
		label.setAlignment(Pos.CENTER);
		
		Circle circle = new Circle(100);
		circle.setFill(Color.GREY);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(30);
		
		Polygon triangle = new Polygon(10, 100, 70);
		triangle.setTranslateY(-15);
		triangle.setStroke(Color.BLUE);
		triangle.setFill(Color.BLUE);
		
		label.setTextFill(Color.WHITE);
		
		getChildren().clear();
		getChildren().add(circle);
		getChildren().add(triangle);
		getChildren().add(label);
	}
	
	public void showSaying() {
		label.setText(ws.getRandomSaying());
	}
	
	public void showMystery() {
		label.setText(".....................");
	}
}
