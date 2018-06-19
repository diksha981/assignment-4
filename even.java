package acadview2;

import java.util.Scanner;



public class even {
	   public static void main(String args[])
	    {
	         
	     Scanner scanner = new Scanner(System.in);
	         
	        System.out.print("Enter value  : ");
	        int n=0,i=0;
	        n = scanner.nextInt();
	         
	        for(i=1; i<n; i++)
	        {
	            if(i%2==0)
	                System.out.println(i+" ");
	        }   
	        System.out.println();
	         
	    }
	}

