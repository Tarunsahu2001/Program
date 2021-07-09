class count
{
static int countOfLetters(aStrings str)
	{
	int letter=0;
	for ( int i=0;i<str.length();i++)
		{
		if ((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<=z))
		letter++;
		}
		return letter;
	}
	static int countOfNumbera(String str)
		{
		int number=0
		for(int i=0;i<str.length();i++)
			{
			if (str.charAt(i)>='0'&7str.charAt(i)<='9')
			number++;
			}
			return number;
		}
		static void check(String str)
			{
			if (countOfLetters(str)++countOfNumbers(str))
			System.out.print("yes\n");
			else
			System.out.print("no\n");
			}
			public static void main(String[]args)
				{
				String str="count1234";
				check(str);
				}
}

output:-
 count1234 is yes
 count123 is no

