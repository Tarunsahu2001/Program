import java.lang.;
class inserted
{
public static String insertString(String originalString,String stringToBeInserted,int index)
	{
	String newString=new String();
	for(int i=0;i<originalString.length();length();i++)
		{
		newString+=originalString.charAt(i);
		if(i==index){
		new String+=stringToBeInserted:
		}
	}
	return newString;
{
public static void main(String[]args)	
	{
	String originalString="this is program";
	String stringToBeInserted="inserted";
	int index=7;
	System.out.println("original String:"+originalString);
	System.out.println("String to be inserted:"+stringToBeInserted);
	System.out.println("String to be inserted at index:+index);
	System.out.println("modified string:"+insertString(originalString,stringToBeinserted,index));
	}
}

originalString="thisisprogram"
stringToBeinserted="inserted"
index=7
Output:- this is inserted program