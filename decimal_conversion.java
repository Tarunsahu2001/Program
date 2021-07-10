class convert
{
Scanner scan;
int num;
void getVal()
	{
	System.out.println(decimal to hexa,octa and binary");
	scan=new Scanner(System.in);
	System.out.println("\nenter the number:");
	num=Integer.parseInt(scane.nextLine());
	}
	void convert()
		{
		String hexa+Integer.toHexString(num);
		System.out.println("hexa value is:"+hexa);
		String octal=Integer.toOctalString(num);
		System.out.println("octal value is:"+octal);
		String binary=Integer.toBinaryString(num);
		System.out.println("binary value is:"+binary);
		}
}
class Decimal_conversion
	{
	public static void main(String args[])
		{
		Convert obj=new convert();
		obj.getVal();
		obj.convert();
		}
	}

 output:-
enter the number:
121
hexa value is:79
octal value is:171
binary value is:1111001