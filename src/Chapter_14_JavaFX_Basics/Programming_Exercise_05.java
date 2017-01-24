//package Chapter_14_JavaFX_Basics;
//
//import javafx.application.Application;
//import javafx.geometry.Point2D;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
///**
// * Characters around circle
// * Write a program that displays a string Welcome to Java around the circle, as shown in Figure 14.44b. 
// * Hint: You need to display each character in the right location with appropriate rotation using a loop.
// * 
// * 05/13/2016
// * @author kevgu
// *
// */
//
//public class Programming_Exercise_05 extends Application
//{
//	static String[] welcome = "Welcome to Java".split("");
//	
//	public static void main(String[] args) 
//	{
//		Application.launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		Pane pane = new Pane();
//		
//		Point2D coordinate = new Point2D(100, 100);
//		double radius = 75;
//		double angle = 0;
//		double rotate = 90;
//		double x, y;
//		Text character;
//		Font font = Font.font("Times New Roman", FontWeight.BOLD, 20);
//		
//		for (int i = 0; i < welcome.length; i++, rotate += 23, angle += 23)
//		{
//			x = coordinate.getX() + radius * Math.cos(Math.toRadians(angle));
//			y = coordinate.getY() + radius * Math.sin(Math.toRadians(angle));
//			character = new Text(x, y, welcome[i]);
//			character.setRotate(rotate);
//			character.setFont(font);
//			pane.getChildren().add(character);
//		}
//		
//		Scene scene = new Scene(pane);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("Welcome to Java");
//		primaryStage.show();
//	}
//}