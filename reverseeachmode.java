public class ReverseEachWord
{
public static void reverseEachWordOfString(String inputString)
	{
	String[]words=inputString.split(" ");
	String reverseString="";
	for ( int i=o;i<words.length;i++)
		{
		String word=words[i];
		String reverseWord="";
		for ( int j=word.length()-1;j>=0;j--)
			{
			reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}
	public static void main(String[]args)
		{
		reverseEachWordOfString("i am string not reversed");
		reverseEachWordOfString("reverse me");
		}
}

output:-
i am string not reversed
i am gnirts ton desrever

reverse me
esrever em