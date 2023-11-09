package application;

import java.util.ArrayList;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class FlowerPane extends AnchorPane
{
	ArrayList<Ellipse> petals;
	LinearGradient petalColor = new LinearGradient(
			0.2145, 0.265, 0.2618, 1.0, true, CycleMethod.NO_CYCLE,
			new Stop(0.0, new Color(0.9305, 0.94, 0.3008, 1.0)),
			new Stop(1.0, new Color(0.9649, 0.3668, 0.2472, 1.0)));
	RadialGradient centerColor = new RadialGradient(
			53.75, -0.4427, 0.4889, 0.5, 0.6069, true, CycleMethod.NO_CYCLE,
			new Stop(0.0, new Color(0.9881, 1.0, 0.287, 1.0)),
			new Stop(1.0, new Color(0.5, 0.3167, 0.0, 1.0)));
	
	Circle center;

	public FlowerPane()
	{
		super();
		petals = new ArrayList<Ellipse>();
		for(int i=0;i<16;i++)
		{
			petals.add(new Ellipse(61,22));
			petals.get(i).setFill(petalColor);
			petals.get(i).setRotate((i%8)*22.5);
			this.getChildren().add(petals.get(i));

		}
		setPetals();
		center = new Circle(24);
		center.setFill(centerColor);
		center.setLayoutX(126);
		center.setLayoutY(95);
		this.getChildren().add(center);
		this.setWidth(200);
		this.setHeight(200);
		this.setScaleX(.5);
		this.setScaleY(.5);
		
	}
	
	private void setPetals()
	{
		petals.get(0).setLayoutX(71);
		petals.get(0).setLayoutY(99);
		
		petals.get(1).setLayoutX(78);
		petals.get(1).setLayoutY(75);
		
		petals.get(2).setLayoutX(92);
		petals.get(2).setLayoutY(60);
		
		petals.get(3).setLayoutX(107);
		petals.get(3).setLayoutY(49);
		
		petals.get(4).setLayoutX(132);
		petals.get(4).setLayoutY(45);
		
		petals.get(5).setLayoutX(151);
		petals.get(5).setLayoutY(49);
		
		petals.get(6).setLayoutX(161);
		petals.get(6).setLayoutY(59);
		
		petals.get(7).setLayoutX(175);
		petals.get(7).setLayoutY(77);
		
		petals.get(8).setLayoutX(171);
		petals.get(8).setLayoutY(97);
		
		petals.get(9).setLayoutX(171);
		petals.get(9).setLayoutY(114);
		
		petals.get(10).setLayoutX(161);
		petals.get(10).setLayoutY(129);
		
		petals.get(11).setLayoutX(151);
		petals.get(11).setLayoutY(134);
		
		petals.get(12).setLayoutX(124);
		petals.get(12).setLayoutY(145);
		
		petals.get(13).setLayoutX(102);
		petals.get(13).setLayoutY(145);
		
		petals.get(14).setLayoutX(78);
		petals.get(14).setLayoutY(134);
		
		petals.get(15).setLayoutX(71);
		petals.get(15).setLayoutY(119);
	}
	
	
	public void randomizeColor()
	{
		petalColor = new LinearGradient(
				0.2145, 0.265, 0.2618, 1.0, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(Math.random(), Math.random(), Math.random(), 1.0)),
				new Stop(1.0, new Color(Math.random(), Math.random(), Math.random(), 1.0)));
		
		centerColor = new RadialGradient(
				53.75, -0.4427, 0.4889, 0.5, 0.6069, true, CycleMethod.NO_CYCLE,
				new Stop(0.0, new Color(Math.random(), Math.random(), Math.random(), 1.0)),
				new Stop(1.0, new Color(Math.random(), Math.random(), Math.random(), 1.0)));
		
		center.setFill(centerColor);
		for(Ellipse petal : petals)
		{
			petal.setFill(petalColor);
		}
	}
}
