package vinay;

import java.util.*;
public class Armstrong
{  
    public static void main(String[] args)  
    {  
      int c=0,a,temp;  
      int n;
      System.out.print("Enter the number:");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      temp=n;  
      while(n>0)  
      {  
    	  a=n%10;  
      	  n=n/10;  
      	  c=c+(a*a*a);  
      }  
      	if(temp==c)  
      		System.out.println(c+ " is armstrong number");   
      	else  
      		System.out.println(c+ " is Not armstrong number");   
     }  
  }  
