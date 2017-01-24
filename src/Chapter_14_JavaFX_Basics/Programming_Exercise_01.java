//package Chapter_14_JavaFX_Basics;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
///**
// * Display images
// * Write a program that displays four images in a grid pane, as shown in Figure 14.43a.
// * 
// * 05/06/2016
// * @author kevgu
// *
// */
//
//public class Programming_Exercise_01 extends Application
//{
//    public static void main(String[] args) 
//    {
//    	Application.launch(args);
//    }
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		GridPane gpane = new GridPane();
//		gpane.setHgap(5);
//		gpane.setVgap(5);
//		Image image = new Image("image/uk.gif");
//		gpane.add(new ImageView(image), 0, 0);
//		image = new Image("image/ca.gif");
//		gpane.add(new ImageView(image), 1, 0);
//		image = new Image("image/china.gif");
//		gpane.add(new ImageView(image), 0, 1);
//		image = new Image("image/us.gif");
//		gpane.add(new ImageView(image), 1, 1);
//		
//		Scene scene = new Scene(gpane, 340, 185);
//		primaryStage.setTitle("Exercise14_01");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//
//}