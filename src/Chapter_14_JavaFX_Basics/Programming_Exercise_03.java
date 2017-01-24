//package Chapter_14_JavaFX_Basics;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//
///**
// * Display three cards
// * Write a program that displays three cards randomly selected from a deck of 52, as shown in Figure 14.43c. 
// * The card image files are named 1.png, 2.png, …, 52.png and stored in the image/card directory. 
// * All three cards are distinct and selected randomly. 
// * Hint: You can select random cards by storing the numbers 1–52 to an array list, 
// * perform a random shuffle introduced in Section 11.12, 
// * and use the first three numbers in the array list as the file names for the image.
// * 
// * 05/12/2016
// * @author kevgu
// *
// */
//
//public class Programming_Exercise_03 extends Application
//{	
//	static ArrayList<Integer> decklist = new ArrayList<>();
//	static int[] threeNums = new int[3];
//	
//	public static void main(String[] args) 
//	{
//		store52Numbers();
//		Collections.shuffle(decklist);
//		chooseThree(threeNums);
//		displayNum(threeNums);
//		Application.launch(args);
//	}
//	
//	/**
//	 * Display three random cards
//	 * 
//	 * @param primaryStage
//	 * @throws Exception
//	 */
//	@Override
//	public void start(Stage primaryStage) throws Exception 
//	{
//		Pane hbox = new HBox(3);
//		Image card;
//		
//		for (int i = 0; i < threeNums.length; i++)
//		{
//			card = new Image("image/card/" + (threeNums[i]) + ".png");
//			hbox.getChildren().add(new ImageView(card));
//		}
//		
//		Scene scene = new Scene(hbox, 230, 100);
//		primaryStage.setScene(scene);
//		primaryStage.setTitle("Random Three Cards");
//		primaryStage.show();
//	}
//	
//	/**
//	 * Output which three cards were randomly chosen
//	 * 
//	 * @param threeNums
//	 */
//	public static void displayNum(int[] threeNums)
//	{
//		for (int i = 0; i < threeNums.length; i++)
//		{
//			System.out.print(threeNums[i] + " ");
//		}
//	}
//	
//	/**
//	 * Randomly chooses three number from the array list
//	 * Stores the number into the array
//	 * 
//	 * @param threeNums
//	 */
//	public static void chooseThree(int[] threeNums)
//	{
//		Random rand = new Random();
//		int num;
//		int index = 0;
//		
//		for (int i = 52; i > 49; i--)
//		{
//			num = rand.nextInt(i);
//			threeNums[index] = decklist.get(num);
//			decklist.remove(num);
//			index++;
//		}
//	}
//	
//	/**
//	 * Store numbers 1 to 52 into the arraylist
//	 */
//	public static void store52Numbers()
//	{
//		for (int i = 1; i <= 52; i++)
//		{
//			decklist.add(i);
//		}
//	}
//}