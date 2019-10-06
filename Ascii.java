package vinay;

public class Ascii
{
	public static void main(String[] args)
	{
		printCharacters();
	}
	static void printCharacters()
	{
		int i =1;
		while (i <=122)
		{
			System.out.print((char)i+"\t");
			if (i % 10 == 0)
			System.out.print("");
			i++;
		}
	}
}
