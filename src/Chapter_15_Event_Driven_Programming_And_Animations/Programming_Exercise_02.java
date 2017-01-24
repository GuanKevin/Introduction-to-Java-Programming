//package Chapter_15_Event_Driven_Programming_And_Animations;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
///**
// * Rotate a rectangle
// * Write a program that rotates a rectangle 15 degrees right when the Rotate button is clicked, as shown in Figure 15.24b.
// * 
// * @author kevgu
// * 06/08/2016
// *
// */
//
//public class Programming_Exercise_02 extends Application
//{
//	public static void main(String[] args) 
//	{
//		Application.launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		StackPane stackpane = new StackPane();
//		Rectangle rectangle = new Rectangle(0, 0, 30, 50);
//		rectangle.setFill(Color.WHITE);
//		rectangle.setStroke(Color.BLACK);
//		stackpane.getChildren().add(rectangle);
//		
//		Button btRotate = new Button("Rotate");
//		HBox hbox = new HBox();
//		hbox.getChildren().add(btRotate);
//		hbox.setAlignment(Pos.CENTER);
//		
//		BorderPane borderpane = new BorderPane();
//		borderpane.setCenter(stackpane);
//		borderpane.setBottom(hbox);
//		
//		btRotate.setOnAction(e -> rectangle.setRotate(rectangle.getRotate() + 15));
//		
//		Scene scene = new Scene(borderpane, 150, 150);
//		primaryStage.setTitle("Rotate Rectangle");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//		
//	}
//}