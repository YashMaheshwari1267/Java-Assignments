package com.assignment.java;

import java.util.Scanner;

public class App 
{
    private static Scanner sc;
     
	public static void main( String[] args )
    {
       char ans;
       sc = new Scanner(System.in);
       int arr1[] = {1,2,4,6,3,7,8,9,10};
       int arr2[] = {10,4,3,50,0,90};
       int arr3[] = {1,5,10,20,0,7};
       do {
    	   System.out.println("1. Assignment 1.1");
    	   System.out.println("2. Assignment 1.2");
    	   System.out.println("3. Assignment 1.3");
    	   System.out.println("4. Assignment 1.4");
    	   System.out.println("5. Assignment 2.1");
    	   System.out.println("6. Assignment 2.2");
    	   System.out.println("7. Assignment 2.3");
    	   System.out.println("8. Assignment 2.4");
    	   System.out.println("9. Exit");
    	   System.out.print("Enter your choice :");
    	   int option = sc.nextInt();
    	 
    	   switch(option) {
    	   case 1: 
    		   System.out.println(FindMissingNumber.findNumber(arr1)); 
    		   break;
    	   
    	   case 2: 
    		   int temp[]= LargestThreeElements.findLargestThreeElements(arr2); 
    		   for(int i=0;i<temp.length;i++) 
    		   {
    			   System.out.print(temp[i]+ " ");
    		   } 
    		   break;
    	   
    	   case 3: 
    		   int temp1[]= FindCommonElements.findCommonElements(arr1, arr2, arr3); 
    		   for(int i=0;i<temp1.length;i++) 
    		   {
    			   if(temp1[i] != 0)
    				   System.out.print(temp1[i]+ " ");
    		   }
    		   break;
    	   
    	   case 4: 
    		   int temp2[] = PushZerosToEnd.pushZero(arr3); 
    		   for(int i=0;i<temp2.length;i++)
    		   {
    			   System.out.print(temp2[i]+" ");
    		   } 
    		   break;
    	   
    	   case 5: 
    		   System.out.print("Enter String : ");
    		   Scanner s = new Scanner(System.in);
    		   String str = s.nextLine();
    		   int count = DuplicateValues.findDuplicateValues(str);
    		   System.out.println(count);
    		   break;
    		   
    	   case 6:
    		   Scanner s1= new Scanner(System.in);
    		   Scanner s2= new Scanner(System.in);
    		   System.out.print("Enter length of array: ");
    		   int len = s1.nextInt();
    		   System.out.println("Enter items: ");
    		   String list[]= new String[len];
    		   for(int i=0;i<len;i++)
    			   list[i]=s2.nextLine();
    		   System.out.println(FacebookLikes.facebookLikes(list));
    		   break;
    	   
    	   case 7: 
    		   int number;
    		   Scanner s3= new Scanner(System.in);
    		   System.out.print("Enter a integer: ");
    		   number = s3.nextInt();
    		   int []ints= RearrangeDigits.rearrange(number);
    		   for(int i=0;i<ints.length;i++) {System.out.print(ints[i]);}
    		   break;
    		   
    	   case 8: 
    		   Scanner s4= new Scanner(System.in);
    		   Scanner s5= new Scanner(System.in);
    		   System.out.print("Enter length of array: ");
    		   int l = s4.nextInt();
    		   System.out.println("Enter items: ");
    		   int a[] = new int[l]; 
    		   for(int i=0;i<l;i++)
    			   a[i]=s5.nextInt();
    		   System.out.println(OddTimes.findOdd(a));
    		   break;
    	   
    	   default: System.exit(0);
    	   
    	   }
    	   System.out.println("\n Do you wish to continue(y/n) : ");
    	   ans = sc.next().charAt(0);
       }while(ans != 'n');
    }
}
