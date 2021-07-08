public class solution
{
	public int[]plusone(int[]digits)
		{
		Arraylist<integer>result=new Arraylist<integer>();
		if(digits==null||digits.length==0)
			{
			int[]temp={1};
			return temp;
			}
			int carry=0;
			for( int i=digits.length-1;i>=0;i--)
				{
				if ( i==digits.length-1)
					{
					carrry=carry+digits[i]+1;
					}
					else
						{
						carry+=digits[i];
						carry/=10
							{
							result.add(0,1);
							}
							int resultArray[]=new int[result.size()];
							for ( int i=0;i<result.size();i++)
								{
								resultArray[i]=result.get(i);
								}
								return resultArray;
		}
}

input:- [4,3,2,1]
output:- [4,3,2,2]