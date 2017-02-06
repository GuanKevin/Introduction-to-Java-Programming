package utilities;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CreateLargeFile 
{
	private long dataSize;
	private String fileLocation;
	DataOutputStream output;
	
	public CreateLargeFile()
	{
		this (1000000, "src/Text_Files/Chapter_23/dataSet.dat");
	}
	
	public CreateLargeFile(long dataSize)
	{
		this (dataSize, "src/Text_Files/Chapter_23/dataSet.dat");
	}
	
	public CreateLargeFile(long dataSize, String fileLocation)
	{
		this.dataSize = dataSize;
		this.fileLocation = fileLocation;
	}
	
	public void generateFile()
	{
		try 
		{
			output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileLocation)));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		for (int i = 0; i < dataSize; i++)
		{
			try 
			{
				output.writeInt(new Random().nextInt(9999999));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		try 
		{
			output.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
