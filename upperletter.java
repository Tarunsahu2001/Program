class upperletter
{
Static String convert(String str)
	{
	char ch[]=str.toCharArray();
	for ( int i=0;i<str.length();i++)
		{
		if(i==0 && ch[i]!=' '||ch[i]=' '&&[i-1==' ')
			{
			if (ch[i]>='a'&&ch[i]<='z')
				{
				ch[i]=(char)(ch[i]-'a'+'A');
				}
			}
			else if (ch[i]>='A'&&ch[i]<='z')ch[i]=(char)(ch[i]+'a'-'A');
		}
		String st=new string(ch);
		return st;
	}
public static void main(String[]args)
	{
	String str="this is coding program";
	System.out.println(convert(sstr));
	}
}
 
input:- this is coding program
output:- This Is Coding Program
