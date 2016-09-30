package Chapter_12_Exception_Handling_and_Text_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Baby name popularity ranking
 * The popularity ranking of baby names from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored in files named babynameranking2001.txt, babynameranking2002.txt, . . . , babynameranking2010.txt. 
 * Each file contains one thousand lines. 
 * Each line contains a ranking, a boy’s name, number for the boy’s name, a girl’s name, and number for the girl’s name.
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s name Ethan and girl’s name Sophia are ranked #2. 
 * 21,875 boys are named Jacob and 22,731 girls are named Isabella. 
 * Write a program that prompts the user to enter the year, gender, and followed by a name, and displays the ranking of the name for the year.
 * 
 * 04/
 * @author kevgu
 *
 */

public class Programming_Exercise_31
{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		File[] file = new File[10];
		for(int i = 1; i <= 10; i++){
			if(i == 10)
				file[i -1] = new File("babynamesranking20" + i + ".txt");
			else
				file[i - 1] = new File("babynamesranking200" + i + ".txt");
		}
		if(file[1].exists()){
			System.out.println("Exists");
		}
		System.out.print("Enter the year: ");
		int year = Integer.parseInt(input.nextLine());
		System.out.print("Enter the gender: ");
		char gender = input.nextLine().charAt(0);
		System.out.print("Enter the name: ");
		String name = input.nextLine();
		System.out.println(name + " is ranked " + getRank(file, year, gender, name) + " in year " + year);
	}
	public static int getRank(File[] file, int year, char gender, String name)
	{
		Scanner inputf = null;
		String line = null;
		String temp;
		temp = name.toLowerCase();
		temp = name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
		try {
			inputf = new Scanner(file[year - 2001]);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		while(inputf.hasNext())
		{
			line = inputf.nextLine();
			if(line.contains(temp))
				return Integer.parseInt(line.substring(0, line.indexOf(" ")));
		}
		System.out.println(name + " is not ranked in year " + year);
		System.exit(0);
		return 0;
	}
}
