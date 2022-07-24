class UserMethod
{
	public static  void Mutipilication ()
    {
      System.out. println("from Mutipilication ");
	}
	public static  void Addition()
    {
         System.out. println("from Addition ");
	}
    public static void main(String  [] arg)
    {
	   Addition();
            int i=10;
            System.out. println(i);
			System.out. println("Hello i am from main ");
            Subraction();// Calling method 
			Mutipilication();
			Divition();      
	}
	    static  void Subraction()
           {
			   Divition(); 
            System.out. println("from Subraction ");
				}
        public static  void Divition()
            {
				Mutipilication();
             System.out. println("from Divition ");
		    }

}
