//package Chapter_15_Event_Driven_Programming_And_Animations;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
///**
// * Move the ball
// * Write a program that moves the ball in a pane. 
// * You should define a pane class for displaying the ball and provide the methods for moving the ball left, right, up, and down, as shown in Figure 15.24c. 
// * Check the boundary to prevent the ball from moving out of sight completely.
// * 
// * @author kevgu
// * 06/09/2016
// * 
// */
//
//public class Programming_Exercise_03 extends Application
//{
//	static float centerX = 50.0f;
//	static float centerY = 50.0f;
//	
//	public static void main(String[] args) 
//	{
//		Application.launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		GridPane gridPane = new GridPane();
//		Circle circle = new Circle();
//		circle.setCenterX(centerX);
//		circle.setCenterY(centerY);
//		circle.setRadius(25.0f);
//		circle.setFill(Color.WHITE);
//		circle.setStroke(Color.BLACK);
//		gridPane.getChildren().add(circle);
//		gridPane.setAlignment(Pos.CENTER);
//		
//		HBox hBox = new HBox();
//		Button btLeft = new Button("Left");
//		Button btRight = new Button("Right");
//		Button btUp = new Button("Up");
//		Button btDown = new Button("Down");
//		hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
//		hBox.setAlignment(Pos.BOTTOM_CENTER);
//		
//		BorderPane borderPane = new BorderPane();
//		borderPane.setCenter(gridPane);
//		borderPane.setBottom(hBox);
//		
//		btLeft.setOnAction(e -> circle.setCenterX(circle.getCenterX() + 50));
//		//btRight.setOnAction(e -> shiftRight());
//		//btUp.setOnAction(e -> shiftUp());
//		//btDown.setOnAction(e -> shiftDown());
//		
//		Scene scene = new Scene(borderPane, 480, 360);
//		primaryStage.setTitle("Rotate Rectangle");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//}