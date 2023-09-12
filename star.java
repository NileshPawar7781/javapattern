package demo;

public class star 
{

	public static void main(String[] args) 
	{
      int i,j;
      for(i=1;i<=6; i++)
      {
    	  for(j=1;j<=6;j++)
    	  {
    		 if( i >=2 && j >= 2 && i <= 5 && j <= 5 )
    		  {
    			  System.out.print(" ");
    		  }
    		  else
    		  {
    		  System.out.print("*");
    		  }
    	  }
    	  System.out.println();
      }
	}

}
