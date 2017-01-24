//package Chapter_14_JavaFX_Basics;
//
//import java.util.Random;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
///**
// * Tic-tac-toe board
// * Write a program that displays a tic-tac-toe board, as shown in Figure 14.43b. 
// * A cell may be X, O, or empty. 
// * What to display at each cell is randomly decided. 
// * The X and O are images in the files x.gif and o.gif.
// * 
// * 05/06/2016
// * @author kevgu
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
//		GridPane gp = new GridPane();
//		gp.setAlignment(Pos.CENTER);
//		Image o = new Image("image/o.gif");
//		Image x = new Image("image/x.gif");
//		
//		Random rand = new Random();
//		int num;
//		
//		for (int i = 0; i < 3; i++)
//		{
//			for (int j = 0; j < 3; j++)
//			{
//				num = rand.nextInt(3);
//				if (num != 0)
//				{
//					if (num == 1)
//					{
//						gp.add(new ImageView(o), i, j);
//					}
//					else
//					{
//						gp.add(new ImageView(x), i, j);
//					}
//				}
//			}
//		}
//		
//		Scene scene = new Scene(gp, 150, 150);
//		primaryStage.setTitle("Exercise14_02");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//}
