public class palindrome
{
public static void main(Strings[]args)
	{
	String a,b="";
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the string you want to check:");
	a=sc.nextLine();
	int n=a.length();
	for ( int i=n-1;i>=0;i--)
		{
		b=b+a.charAt(i);
		}
		if (a.equalsIgnoreCase(b))
			{
			System.out.println("the string is palindrome:");
			}
			else
				{
				System.out.println("the string is not palindrome:")
				}
	}
}

 output:- abba
the string is palindrome
  abaka
the string is not palidrome