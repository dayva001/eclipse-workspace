package application;
	
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			String wow_img = "https://i.pinimg.com/736x/29/1e/91/291e91e67f4f4f277937f3c131e4044d.jpg";
			Media wow_sound = new Media("https://soundboardguy.com/wp-content/uploads/2022/12/6_1Njp68r.mp3");
			String wave_img = "https://upload.wikimedia.org/wikipedia/commons/a/a5/Tsunami_by_hokusai_19th_century.jpg";
			Button b1 = new Button("Boring Button");
			Button b2 = new Button("Wow Button");
		    Button b3 = new Button("<3");
		    b3.setStyle(
		        "-fx-shape: \"M23.6,0c-3.4,0-6.3,2.7-7.6,5.6C14.7,2.7,11.8,0,8.4,0C3.8,0,0,3.8,0,8.4c0,9.4,9.5,11.9,16,21.26.1-9.3,16-12.1,16-21.2C32,3.8,28.2,0,23.6,0z\";"
		    );
		    b3.setPrefSize(50, 50);
		    Label l1 =  new Label("Boring Label");
		    Label l2 = new Label("Something different");
		    Label l3 = new Label("enter password below:");
		    
		    TextField txt1 = new TextField("Text field");
		    
		    PasswordField p1 = new PasswordField();
		    
		    TextArea textArea1 = new TextArea("Editable Text Area");
		    textArea1.setMaxSize(500, 300);
		    textArea1.setWrapText(true);
		    
		    TextArea textArea2 = new TextArea("Non-Editable Text Area");
		    textArea2.setEditable(false);
		    textArea2.setMaxSize(200, 150);
		    
		    ScrollPane scroll = new ScrollPane();
		    scroll.setMaxSize(230, 170);
		    scroll.setContent(textArea1); 
		    
		    Label l4 = new Label("Radio Button Example 1");
	        ToggleGroup group1 = new ToggleGroup();
		    RadioButton r1 = new RadioButton("yes");
		    r1.setToggleGroup(group1);
	        RadioButton r2 = new RadioButton("no");
	        r2.setToggleGroup(group1);
	        RadioButton r3 = new RadioButton("maybe");
	        r3.setToggleGroup(group1);
	        
		    Label l5 = new Label("Radio Button Example 2");
	        ToggleGroup group2 = new ToggleGroup();
		    RadioButton r4 = new RadioButton("red");
	        r4.setToggleGroup(group2);
	        RadioButton r5 = new RadioButton("green");
	        r5.setToggleGroup(group2);
	        RadioButton r6 = new RadioButton("blue");
	        r6.setToggleGroup(group2);
	        
	        Label l6 = new Label("Grocery Check Box example 1");
	        CheckBox c1 = new CheckBox("Butter");
	        CheckBox c2 = new CheckBox("Eggs");
	        CheckBox c3 = new CheckBox("Milk");
	        
	        Label l7 = new Label("Other Check Box example 2");
	        CheckBox c4 = new CheckBox("Bed");
	        CheckBox c5 = new CheckBox("Bath");
	        CheckBox c6 = new CheckBox("Beyond");

	        // Weekdays
	        String week_days[] =
	                   { "Monday", "Tuesday", "Wednesday",
	                                    "Thursday", "Friday" };
	 
	        ComboBox<String> combo_box = new ComboBox<String>(FXCollections.observableArrayList(week_days));
	        
	        ListView<String> listView = new ListView<String>();
	        listView.setMaxSize(150, 50);
	        listView.getItems().add("Breakfast");
	        listView.getItems().add("Lunch");
	        listView.getItems().add("Dinner");
	        
	        Label l8 = new Label("Opacity Slider");
	        Slider slider = new Slider(0, 1, 1);
	        slider.setShowTickMarks(true);
	        slider.setShowTickLabels(true);
	        slider.setMajorTickUnit(0.25f);
	        slider.setBlockIncrement(0.1f);
	        final Label opacityValue = new Label(
	                Double.toString(slider.getValue()));
	        
	        // create a menu
	        Menu m = new Menu("Menu");
	        // create menuitems
	        MenuItem m1 = new MenuItem("Examples 1");
	        MenuItem m2 = new MenuItem("Examples 2");
	        MenuItem m3 = new MenuItem("New Tab");
	        // add menu items to menu
	        m.getItems().add(m1);
	        m.getItems().add(m2);
	        m.getItems().add(m3);
	        // create a menubar
	        MenuBar mb = new MenuBar();
	        // add menu to menubar
	        mb.getMenus().add(m);
	        
	        MenuBar mb2 = new MenuBar();
	        mb2.getMenus().add(m);
	        
	        
	        //Setting the label
	        Label label = new Label("Select Date:");
	        Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
	        label.setFont(font);
	        //Creating a spinner
	        Spinner month = new Spinner(1, 12, 4);
	        //Setting the spinner editable
	        month.setEditable(true);
	        //Setting the size
	        month.setPrefSize(75, 25);
	        Label label1 = new Label("Month: ");
	        //Creating a spinner
	        Spinner day = new Spinner(1, 31, 4);
	        //Setting the spinner editable
	        day.setEditable(true);
	        //Setting the size
	        day.setPrefSize(75, 25);
	        Label label2 = new Label("Day: ");
	        //Creating a spinner
	        Spinner year = new Spinner(1947, 2999, 2009);
	        //Setting the spinner editable
	        year.setEditable(true);
	        //Setting the size
	        year.setPrefSize(75, 25);
	        Label label3 = new Label("Year: ");
	        HBox hbox = new HBox(5);
	        hbox.setPadding(new Insets(10, 10, 10, 25));
	        hbox.getChildren().addAll(label1, month, label2, day, label3, year);
	        
	        TabPane tabpane = new TabPane();
	        
	        ProgressBar pb = new ProgressBar();
	        pb.setMaxWidth(900);
		    ImageView waveView = new ImageView();
		    waveView.setImage(new Image(wave_img));
			waveView.setFitHeight(100);
			waveView.setFitWidth(200);
		    l2.setGraphic(waveView);
		    
		    l3.setBackground(new Background(new BackgroundFill(Color.AQUA, new CornerRadii(2,2,2,2, true), new Insets(15,15,15,15))));
		    
			HBox h1 = new HBox();
			h1.setAlignment(Pos.CENTER);
			h1.setPadding(new Insets(5,5,5,5));
			h1.setSpacing(10);
			
			HBox h2 = new HBox();
			h2.setAlignment(Pos.CENTER);
			h2.setPadding(new Insets(5,5,5,5));
			h2.setSpacing(10);
			
			VBox v1 = new VBox();
			v1.setAlignment(Pos.CENTER);
			v1.setPadding(new Insets(5,5,5,5));
			v1.setSpacing(10);
			
			VBox v2 = new VBox();
			v2.setAlignment(Pos.CENTER);
			v2.setPadding(new Insets(5,5,5,5));
			v2.setSpacing(10);
			
			VBox v3 = new VBox();
			v3.setAlignment(Pos.CENTER);
			v3.setPadding(new Insets(5,5,5,5));
			v3.setSpacing(10);
			
			VBox v4 = new VBox();
			v4.setPadding(new Insets(5,5,5,5));
			v4.setSpacing(5);
			
			VBox v5 = new VBox();
			v5.setPadding(new Insets(5,5,5,5));
			v5.setSpacing(5);
			
			
			VBox v6 = new VBox();
			v6.setAlignment(Pos.CENTER);
			v6.setPadding(new Insets(5,5,5,5));
			v6.setSpacing(10);
			
			VBox v7 = new VBox();
			v7.setAlignment(Pos.CENTER);
			v7.setPadding(new Insets(5,5,5,5));
			v7.setSpacing(2);
			
		    ScrollPane scroll2 = new ScrollPane();
		    scroll2.setMaxSize(300, 300);
		    scroll2.setContent(v6); 
			
			ImageView imageView = new ImageView();
			imageView.setImage(new Image(wow_img));
			imageView.setFitHeight(20);
			imageView.setFitWidth(40);
			
	        b2.setGraphic(imageView);
	        b2.setContentDisplay(ContentDisplay.BOTTOM);
	        

			h1.getChildren().add(b1);
			h1.getChildren().add(b2);
			h1.getChildren().add(b3);
			
			v1.getChildren().add(mb);
			v1.getChildren().add(l1);
			v1.getChildren().add(l2);

			
			v2.getChildren().add(txt1);
			v2.getChildren().add(l3);
			v2.getChildren().add(v3);
			
			v3.getChildren().add(scroll);
			v3.getChildren().add(textArea2);
			
		    v4.getChildren().add(l4);
		    v4.getChildren().add(r1);
		    v4.getChildren().add(r2);
		    v4.getChildren().add(r3);
		    v4.getChildren().add(l5);
		    v4.getChildren().add(r4);
		    v4.getChildren().add(r5);
		    v4.getChildren().add(r6);
			
		    v5.getChildren().add(l6);
		    v5.getChildren().add(c1);
		    v5.getChildren().add(c2);
		    v5.getChildren().add(c3);
		    v5.getChildren().add(l7);
		    v5.getChildren().add(c4);
		    v5.getChildren().add(c5);
		    v5.getChildren().add(c6);
		    
		    v6.getChildren().add(combo_box);
		    v6.getChildren().add(listView);
		    
		    v7.getChildren().add(l8);
		    v7.getChildren().add(opacityValue);
		    v7.getChildren().add(slider);
		    
			h2.getChildren().add(v2);
			h2.getChildren().add(v3);
			h2.getChildren().add(v4);
			h2.getChildren().add(v5);
			
			BorderPane root = new BorderPane();
			root.setBottom(h1);
			root.setTop(v1);
			root.setCenter(h2);
			root.setLeft(scroll2);
			root.setRight(v7);
			BorderPane root2 = new BorderPane();
			root2.setTop(mb2);
			root2.setCenter(hbox);
			root2.setBottom(pb);
			
			Scene scene = new Scene(root,900,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Busy Box");
			primaryStage.show();
			
			b2.setOnAction((event)-> { //lambda expression
		        MediaPlayer play_wow = new MediaPlayer(wow_sound);
				play_wow.play();
        	});
			
			b1.setOnAction((event)-> { //lambda expression
		        txt1.setText("Nothing happened.");
        	});
			
			b3.setOnAction((event)-> { //lambda expression
	        	h1.setStyle("-fx-background-color: #ffb6c1;");
        	});
			
			r4.setOnAction((event)-> { //lambda expression
				if(r1.isSelected())
				{
					v4.setStyle("-fx-background-color: #d30000;");
				}
        	});
			
			r5.setOnAction((event)-> { //lambda expression
				if(r1.isSelected())
				{
					v4.setStyle("-fx-background-color: #d30000;");
				}
        	});
			
			r6.setOnAction((event)-> { //lambda expression
				if(r1.isSelected() || r3.isSelected())
				{
					v4.setStyle("-fx-background-color: #d30000;");
				}
        	});
			
	        slider.valueProperty().addListener((
	                ObservableValue<? extends Number> ov, 
	                Number old_val, Number new_val) -> {
	                    slider.setOpacity(new_val.doubleValue());
	                    opacityValue.setText(String.format("%.2f", new_val));
	            });
			
	        m2.setOnAction((event)-> { //lambda expression
				scene.setRoot(root2);
        	});
	        
	        m1.setOnAction((event)-> { //lambda expression
				scene.setRoot(root);
        	});
	        
	        m3.setOnAction((event)-> { //lambda expression
				scene.setRoot(tabpane);
			    for (int i = 0; i < 5; i++) {
			    	  
			        // create Tab
			        Tab tab = new Tab("Tab_" + (int)(tabpane.getTabs().size()+ 1));
			  
			        // add label to the tab
			        tab.setContent(label);
			  
			        // add tab
			        tabpane.getTabs().add(tab);
			    }
			  
			    // create a tab which
			    // when pressed creates a new tab
			    Tab newtab = new Tab("+");
			  
			    // action event
			    EventHandler<Event> event2 = 
			    new EventHandler<Event>() {
			  
			        public void handle(Event e)
			        {
			            if (newtab.isSelected()) 
			            {
			  
			                // create Tab
			                Tab tab = new Tab("Tab_" + (int)(tabpane.getTabs().size()));
			  
			                // add tab
			                tabpane.getTabs().add(
			                        tabpane.getTabs().size() - 1, tab);
			  
			                // select the last tab
			                tabpane.getSelectionModel().select(
			                        tabpane.getTabs().size() - 2);
			            }
			        }
			    };
			  
			    // set event handler to the tab
			    newtab.setOnSelectionChanged(event2);
			  
			    // add newtab
			    tabpane.getTabs().add(newtab);
        	});
	        
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
