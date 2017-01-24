package utilities;

public class WordOccurrence implements Comparable<WordOccurrence>
{
	String word;
	int count;
	
	public WordOccurrence(){}
	
	public WordOccurrence(String word, int count)
	{
		this.word = word;
		this.count = count;
	}
	
	@Override
	public int compareTo(WordOccurrence o) 
	{
		if (this.count < o.count)
			return -1;
		else if (this.count == o.count)
			return 0;
		else
			return 1;
	}

	@Override
	public String toString()
	{
		return word + " appears " + count + " times.";
	}
}
