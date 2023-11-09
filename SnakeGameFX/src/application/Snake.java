package application;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Snake extends Circle
{
	//centerX-defines the horizontal position of the center of a circle in pixels
	//centerY-defines the vertical position of the center of a circle in pixels
	
	private List<Circle> tails;
	private int length;
	private Direction currDirection;
	private static final int STEP = 8;
	
	public Snake(double x, double y, double radius)
	{
		super(x,y,radius);
		this.tails = new ArrayList<>();
		this.currDirection = Direction.UP;
	}
	
	
	//movement method
	public void step()
	{
		for(int i=this.length -1; i>=0;i--)
		{
			if(i==0) 
			{//checks for head
				this.tails.get(i).setCenterX(getCenterX());
				this.tails.get(i).setCenterY(getCenterY());
				
			} 
			else 
			{//checks for body of the snake
				this.tails.get(i).setCenterX(this.tails.get(i-1).getCenterX());
				this.tails.get(i).setCenterY(this.tails.get(i-1).getCenterY());
			}
		}
		//move up
		if(this.currDirection == Direction.UP)
		{
			this.setCenterY(this.getCenterY() - STEP);
			this.setCenterX(this.getCenterX()- STEP);
		}//move down
		else if(this.currDirection == Direction.DOWN)
		{
			this.setCenterY(this.getCenterY() + STEP);
			this.setCenterX(this.getCenterX() - STEP);
		}//move left
		
		else if(this.currDirection == Direction.LEFT)
		{
			this.setCenterX(this.getCenterX() - (2*STEP));
			this.setCenterY(this.getCenterY());
		}//move right
		else if(this.currDirection == Direction.RIGHT);
		{
			this.setCenterX(this.getCenterX() + STEP);
		}
	}
	
	//method that gets the last Circle in the List of Circle (tail)
	private Circle endTail()
	{
		//check for only head
		if(this.length ==0)
		{
			return this;
		}
		return this.tails.get(this.length-1);
	}
	
	//method to eat food and make circle longer
	public void eat(Circle food)
	{
		Circle tail = endTail();
		food.setCenterX(tail.getCenterX());
		food.setCenterY(tail.getCenterY());
		food.setFill(Color.BLACK);
		tails.add(this.length++, food);
	}

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public Direction getCurrDirection() {
		return currDirection;
	}


	public void setCurrDirection(Direction currDirection)
	{
		this.currDirection = currDirection;
	}
	
	//check to see if the snake has collided with itself
	public boolean eatSelf()
	{
		for(Circle body: tails)
		{
			if(this.getCenterX() == body.getCenterX() && this.getCenterY() == body.getCenterY())
			{
				return true;
			}
		}
		return false;
	}
}
