class recursion
{ 
    public static void main(String[] args)
{ 
        int[] arr = {1,2,3,4,5}; 
        program(arr, 0); 
    } 
    public static void program(int[] arr, int i)
{ 
        if(i==arr.length-1)
{ 
            System.out.println(arr[i]); 
            return ; 
        } 
		else 
{ 
            System.out.println(arr[i]); 
            program(arr, i+1); 
            return ; 
        } 
    } 
}