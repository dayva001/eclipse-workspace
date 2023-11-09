package application;

import javafx.animation.FadeTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class MagicEightBall extends StackPane
{
	Circle ballMain;
	Circle ballRing;
	Circle ballIn;
	Polygon triangle;
	Label ballText;
	public MagicEightBall()
	{
		super();
		ballMain = new Circle(200,200,150,Color.BLACK);
		ballRing = new Circle(200,200,90,Color.GRAY);
		ballIn = new Circle (200,200,85,Color.BLACK);
	    triangle = new Polygon();
	    triangle.getPoints().addAll(new Double[]{
	    		300.0, 5.0,
	    		235.0, 100.0,
	    		365.0, 100.0, });
	    triangle.setFill(Color.BLUE);
	    triangle.setOpacity(0.0);
	    ballText = new Label("");
	    ballText.setTextFill(Color.WHITE);
	    ballText.setTranslateY(20);
	    ballText.setTranslateX(2);
	    ballText.setWrapText(true);
	    ballText.setMaxWidth(75);
	    ballText.setTextAlignment(TextAlignment.CENTER);
	    ballText.setFont(Font.font("Impact",12));
		this.getChildren().add(ballMain);
		this.getChildren().add(ballRing);
		this.getChildren().add(ballIn);
		this.getChildren().add(triangle);
		this.getChildren().add(ballText);
	}

	public void showMystery()
	{
		fadeOut(0.75);
	}
	
	public void showSaying()
	{
		ballText.setText(WiseSayings.GetRandomSaying());
		fadeIn(0.75);

	}
	
	private void fadeIn(double fadeTime)
	{
		FadeTransition fadeInTxt = new FadeTransition(Duration.seconds(fadeTime), ballText);
		FadeTransition fadeInTri = new FadeTransition(Duration.seconds(fadeTime), triangle);
		fadeInTri.setFromValue(0.0);
		fadeInTxt.setFromValue(0.0);
		fadeInTri.setToValue(1.0);
		fadeInTxt.setToValue(1.0);
		fadeInTri.play();
		fadeInTxt.play();
		
	}
	
	private void fadeOut(double fadeTime)
	{
		FadeTransition fadeOutTxt = new FadeTransition(Duration.seconds(fadeTime), ballText);
		FadeTransition fadeOutTri = new FadeTransition(Duration.seconds(fadeTime), triangle);
		fadeOutTri.setFromValue(1.0);
		fadeOutTxt.setFromValue(1.0);
		fadeOutTri.setToValue(0.0);
		fadeOutTxt.setToValue(0.0);
		fadeOutTri.play();
		fadeOutTxt.play();
		
	}

}
