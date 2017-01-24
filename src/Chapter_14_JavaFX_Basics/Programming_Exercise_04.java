//package Chapter_14_JavaFX_Basics;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontPosture;
//import javafx.scene.text.FontWeight;
//import javafx.stage.Stage;
//
///**
// * Color and font
// * Write a program that displays five texts vertically, as shown in Figure 14.44a. 
// * Set a random color and opacity for each text and set the font of each text to Times Roman, bold, italic, and 22 pixels.
// * 
// * 05/13/2016
// * @author kevgu
// *
// */
//
//public class Programming_Exercise_04 extends Application
//{
//	public static void main(String[] args) 
//	{
//		Application.launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		Pane hbox = new HBox(1);
//		hbox.setPadding(new Insets(15));
//		Label textLabel = new Label("Java");
//		
//		for (int i = 0; i < 5; i++)
//		{
//			textLabel.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
//			textLabel.setTextFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
//			textLabel.setRotate(90);
//			hbox.getChildren().add(textLabel);
//			textLabel = new Label("Java");
//		}
//			
//		Scene scene = new Scene(hbox, 250, 100);
//		primaryStage.setTitle("Using Labels");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//}