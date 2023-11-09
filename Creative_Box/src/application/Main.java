package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,640,400);
			
			drawVase(root);
			primaryStage.setTitle("Flower pot scene");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void drawVase(BorderPane pane)
	{
		Color vaseColor = new Color(Math.random(),Math.random(),Math.random(),1.0);
		AnchorPane vaseHolder = new AnchorPane();
		vaseHolder.setMaxSize(640, 400);
		
		Rectangle background = new Rectangle(640,400);
		RadialGradient backgroundFill = new RadialGradient(
				0.0, 0.0, 0.4557, 0.5883, 0.5, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(0.7175, 0.8772, 0.8053, 1.0)),
				new Stop(0.4049, new Color(0.7134, 0.87, 0.7995, 1.0)),
				new Stop(1.0, new Color(0.1957, 0.6404, 0.4477, 1.0)));
		background.setFill(backgroundFill);
		
		Ellipse vaseBody = new Ellipse(100,119);
		vaseBody.setLayoutX(304);
		vaseBody.setLayoutY(242);
		Polygon vaseNeck = new Polygon();
		vaseNeck.getPoints().addAll(new Double[]{
					    23.0, 114.5,
					    85.5, 35.0,
					    -35.5, 35.0 });
		vaseNeck.setLayoutX(279);
		vaseNeck.setLayoutY(88);
		Ellipse vaseHole = new Ellipse(51,8);
		vaseHole.setLayoutX(304);
		vaseHole.setLayoutY(131);
		
		Rectangle table = new Rectangle(640,100);
		table.setLayoutY(300);
		vaseBody.setFill(vaseColor);
		vaseNeck.setFill(vaseColor);
		
		LinearGradient tableFill = new LinearGradient(
				0.2145, 0.265, 0.2618, 1.0, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(0.2632, 0.1454, 0.0195, 1.0)),
				new Stop(1.0, new Color(0.4298, 0.2794, 0.0, 1.0)));
		table.setFill(tableFill);
		
		Line stem1 = new Line();
		stem1.setStartX(-5.9);
		stem1.setStartY(6.6);
		stem1.setEndX(98.9);
		stem1.setEndY(5.2);
		stem1.setRotate(40);
		stem1.setLayoutX(197);
		stem1.setLayoutY(92);
		stem1.setStrokeWidth(11);
		LinearGradient stem1Fill = new LinearGradient(
				0.8707, 0.8612, 1.0, 1.0, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(0.2941, 0.9098, 0.2745, 1.0)),
				new Stop(1.0, new Color(0.0, 0.0, 0.0, 1.0)));
		stem1.setStroke(stem1Fill);
		
		Line stem2 = new Line();
		stem2.setStartX(64.3);
		stem2.setStartY(-50);
		stem2.setEndX(64.3);
		stem2.setEndY(16);
		stem2.setLayoutX(243);
		stem2.setLayoutY(116);
		stem2.setStrokeWidth(5);
		LinearGradient stem2Fill = new LinearGradient(
				0.8707, 0.8612, 1.0, 1.0, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(0.2941, 0.9098, 0.2745, 1.0)),
				new Stop(1.0, new Color(0.0, 0.0, 0.0, 1.0)));
		stem2.setStroke(stem2Fill);
		
		Line stem3 = new Line();
		stem3.setStartX(144);
		stem3.setStartY(-33);
		stem3.setEndX(99);
		stem3.setEndY(5);
		stem3.setLayoutX(223);
		stem3.setLayoutY(127);
		stem3.setStrokeWidth(9);
		LinearGradient stem3Fill = new LinearGradient(
				0.0, 1.0, 0.2618, 1.0, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(0.0, 0.0, 0.0, 1.0)),
				new Stop(1.0, new Color(0.2941, 0.9098, 0.2745, 1.0)));
		stem3.setStroke(stem3Fill);
		
		FlowerPane flower1 = new FlowerPane();
		flower1.setLayoutX(69);
		flower1.setLayoutY(-39);
		
		
		FlowerPane flower2 = new FlowerPane();
		flower2.setLayoutX(261);
		flower2.setLayoutY(-18);
		
		FlowerPane flower3 = new FlowerPane();
		flower3.setLayoutX(186);
		flower3.setLayoutY(-70);
		
		Label name = new Label("Darius Ayvazian");
		name.setFont(new Font("Segoe Script", 18));
		name.setLayoutX(459);
		name.setLayoutY(350);
		name.setTextFill(new Color(0.9412, 1.0, 0.4275, 1.0));
		
		vaseHolder.getChildren().add(background);
		vaseHolder.getChildren().add(table);
		vaseHolder.getChildren().add(vaseBody);
		vaseHolder.getChildren().add(vaseNeck);
		vaseHolder.getChildren().add(vaseHole);
		vaseHolder.getChildren().add(stem1);
		vaseHolder.getChildren().add(stem2);
		vaseHolder.getChildren().add(stem3);
		vaseHolder.getChildren().add(flower1);
		vaseHolder.getChildren().add(flower2);
		vaseHolder.getChildren().add(flower3);
		vaseHolder.getChildren().add(name);
		
    	flower1.setOnMousePressed((event)-> { //lambda expression
    		flower1.randomizeColor();
    	});
    	
    	flower2.setOnMousePressed((event)-> { //lambda expression
    		flower2.randomizeColor();
    	});
    	
    	flower3.setOnMousePressed((event)-> { //lambda expression
    		flower3.randomizeColor();
    	});
		
		pane.setCenter(vaseHolder);
		
	}
}
