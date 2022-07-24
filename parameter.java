
/*   
Author:Faridha Nisha
Title: Parameters
Question: set parameters value?
*/class parameter
{
   public static void main(String  [] arg)
    {
	  addition(100);
	  Subraction(10,20);    
	  divition (10,false,'a');	  
	  Multipilication (10,false, 'a',"Multipilication");	      
	}
	public static  void addition(int i)
    {
      System.out. println("addition"+ i);
	  System.out. println("addition"+ i+ i);
	}
	static  void Subraction(int i, int j)
    {    		   
	   System.out. println("Subraction  "+ (i-j));
       i=200; 
	   System.out. println("Subraction  "+ (i-j));	    
	}
       
	public static  void divition (int i, boolean b1, char c1)
    {
       System.out. println("from divition " +i+ b1+ c1);
    } 
    public static  void Multipilication  (int i, boolean b1, char c1,String S1)
    {
       System.out. println("from Multipilication " +i+ b1+ c1+S1);
    }
}
