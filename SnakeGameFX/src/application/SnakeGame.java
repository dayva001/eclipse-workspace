package application;
	
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;


public class SnakeGame extends Application
{
	//CONSTANTS
	private static final int GAMEWIDTH = 600;
	private static final int GAMEHEIGHT = 500;
	private static final int RADIUS = 5;
	
	//Pane
	private Pane root;
	
	//Text Component
	private Text score;
	
	//Circle that will act as food
	private Circle food;
	
	//Randomizer
	Random random = new Random();
	
	//Snake
	private Snake snake;
	
	//Method to initalize game
	private void newSnake()
	{
		this.snake = new Snake(GAMEWIDTH / 2, GAMEHEIGHT / 2, RADIUS);
		root.getChildren().add(this.snake);
	}
	
	//Method to spawn food
	private void newFood()
	{
		this.food = new Circle(random.nextInt(GAMEWIDTH), random.nextInt(GAMEHEIGHT), RADIUS);
		this.food.setFill(Color.YELLOW);
		this.root.getChildren().add(this.food);
	}
	
	//checks to see if the snake has touched the food
	private boolean hit()
	{
		return this.food.intersects(this.snake.getBoundsInLocal());
	}
	//Method to see if the snake has collided with itself
	private boolean gameOver()
	{
		return this.snake.eatSelf();
	}
	//Update Function (updates movement, checks for food hits and game overs;
	private void Update()
	{
		Platform.runLater(() -> {
			//move the snake
			this.snake.step();
			adjustLocation();
			//check for food
			if(hit())
			{
				this.snake.eat(this.food);
				this.score.setText("" + this.snake.getLength());
				newFood();
			} 
			else if(gameOver())
			{
				this.root.getChildren().clear(); //removes components attached to pane
				this.score.setText("RESET" + this.snake.getLength());
				this.root.getChildren().add(this.score);
				newSnake();
				newFood();
			}
		});
	}
	
	
	//Method to redirect the snake if it goes out of bounds
	private void adjustLocation()
	{
		if(this.snake.getCenterX() < 0 ) 
		{
			this.snake.setCenterX(GAMEWIDTH);
		}
		else if(this.snake.getCenterX() > GAMEWIDTH)
		{
			this.snake.setCenterX(0);
		}
		
		if(this.snake.getCenterY() <0)
		{
			this.snake.setCenterY(GAMEHEIGHT);
		}
		else if(this.snake.getCenterY() > GAMEHEIGHT)
		{
			this.snake.setCenterY(0);
		}
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			this.root = new Pane();
			this.root.setPrefSize(GAMEWIDTH, GAMEHEIGHT);
			
			this.score = new Text(0,32,"0");
			this.root.getChildren().add(this.score);
			
			newFood();
			newSnake();
			
			//Thread
			Runnable r = () -> {
					for(;;) {
						Update();
						try {
							Thread.sleep(100 / (1 + this.snake.getLength() / 10));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
			Scene scene = new Scene(this.root);
			
			//Event Filter
			/* Event filter is an EventHandler object that captures event 
			 * during the event capture stage instead of the bubbling stage
			 * Event filter ensures that a action occurs based on the event 
			 * regardless of the action of the children
			 */
			
			scene.addEventFilter(KeyEvent.KEY_PRESSED, event ->{
				KeyCode code = event.getCode();
				
				if(code == KeyCode.UP && this.snake.getCurrDirection()!= Direction.DOWN)
				{
					this.snake.setCurrDirection(Direction.UP);
				}
				else if(code == KeyCode.DOWN && this.snake.getCurrDirection()!= Direction.UP)
				{
					this.snake.setCurrDirection(Direction.DOWN);
				}
				else if(code == KeyCode.LEFT && this.snake.getCurrDirection()!= Direction.RIGHT)
				{
					this.snake.setCurrDirection(Direction.LEFT);
				}
				else if(code == KeyCode.RIGHT && this.snake.getCurrDirection()!= Direction.LEFT)
				{
					this.snake.setCurrDirection(Direction.RIGHT);
				}
			});
			primaryStage.setTitle("Snake Game");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
			
			Thread th = new Thread(r);
			th.setDaemon(true);
			th.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
