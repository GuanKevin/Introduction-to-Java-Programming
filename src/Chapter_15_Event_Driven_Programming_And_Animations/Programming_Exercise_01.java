//package Chapter_15_Event_Driven_Programming_And_Animations;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
///**
// * Pick four cards
// * Write a program that lets the user click the Refresh button to display four cards from a deck of 52 cards, as shown in Figure 15.24a. 
// * (See the hint in Programming Exercise 14.3 on how to obtain four random cards.)
// * 
// * @author kevgu
// * 06/08/2016
// *
// */
//
//public class Programming_Exercise_01 extends Application
//{
//	static ArrayList<Integer> deck = new ArrayList<>();
//	
//	public static void main(String[] args) 
//	{
//		storeDeck();
//		Collections.shuffle(deck);
//		Application.launch(args);
//	}
//
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		GridPane gridPane = new GridPane();
//		gridPane.setHgap(2);
//		gridPane.setVgap(2);
//		Button btRefresh = new Button("Refresh");
//		
//		for (int y = 0; y < 1; y++)
//		{
//			for (int x = 0; x < 4; x++)
//			{
//				Image image = new Image("image/card/" + (deck.get(x)) + ".png");
//				gridPane.add(new ImageView(image), x, y);
//			}
//		}
//		gridPane.add(btRefresh, 2, 1);
//		gridPane.setAlignment(Pos.CENTER);
//		
//		btRefresh.setOnAction(e -> 
//		{
//			Collections.shuffle(deck);
//			
//			for (int y = 0; y < 1; y++)
//			{
//				for (int x = 0; x < 4; x++)
//				{
//					Image image = new Image("image/card/" + (deck.get(x)) + ".png");
//					gridPane.add(new ImageView(image), x, y);
//				}
//			}
//		});
//		
//		Scene scene = new Scene(gridPane, 300, 150);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("Four Cards");
//		primaryStage.show();
//	}
//
//	/**
//	 * Store the numbers from 1 to 52 into the array list
//	 */
//	private static void storeDeck()
//	{
//		for (int i = 1; i <= 52; i++)
//		{
//			deck.add(i);
//		}
//	}
//}