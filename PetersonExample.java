import java.util.Scanner;
class PetersonExample  
{  
	public static void main(String[] args)  
   	{   
     		int num,rem,sum=0,i,fact=1,n; 
 		System.out.println("Enter Number:"); 
		Scanner sc=new Scanner(System.in);  
     		num=sc.nextInt();  
     		n=num; 
     		while(num!=0)
     		{  
       			rem=num%10;  
       			for(i=1;i<=rem;i++)  
       			{  
         			fact=fact*i;
       			}        
       			sum=sum+fact;
       			fact=1;
       			num=num/10;
     		}  
    		if(sum==n)  
     		{  
       			System.out.println("Number is a Peterson Number");  
     		}  
     		else  
     		{  
       			System.out.println("Number is not a Peterson Number");  
     		}  
   	}  
 }  