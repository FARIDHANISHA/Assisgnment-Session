/*   
Author:Faridha Nisha
Title: Increment& decrement
Question: find Increment& decrement values ?
*/
class home
{
    public  static void main (String []args)
    {
        int i=10;
		int j=10;
		int y=6;
	    y = j-- + ++j + i++ + ++i + j + j-- + --j + i + ++i + i--   +i + j + ++j + --i + j++  +j + j-- + ++j;
		//  10    10    10    12   10   10    8   12    12     12    12  8   9     11     9    10   10    10
		System.out.println(i);
		System.out.println(j);               
		System.out.println(y); 	
		  
        }	
} 
	
