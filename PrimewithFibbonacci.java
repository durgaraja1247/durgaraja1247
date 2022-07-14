package Assingmentjambav;

import java.util.Scanner;

public class PrimewithFibbonacci {
	


	public static void main(String[] args) {
		

		 Scanner in = new Scanner(System.in);
	        int a=0,b=1,c=0,n,i,j,k=0;
	        System.out.println("Enter the value");
	        n= in.nextInt();
	        System.out.println("Fibonacci Series given below:-");
	        for(i=1;i<=n;i++)
	        {
	            c=a+b;
	            if(c>n)
	            {
	                break;
	            }
	            else
	            {
	                for(j=1;j<=c;j++)
	                {
	                    if(c%j==0)
	                    {
	                        k++;
	                    }
	                }
	                if(k==2)
	                {
	                    System.out.print(c+"\t");
	                }
	                a=b;
	                b=c;
	                k=0;
	            }
	        }
	}}


