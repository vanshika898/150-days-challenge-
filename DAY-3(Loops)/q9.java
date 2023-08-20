//Write a program to find the factorial of any number entered by the user.

import java.util.Scanner;
public class q9 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   long fact=1;
   
   System.out.print("Enter number to find factorial of : ");
   int n=sc.nextInt();

   for (long i=1; i<=n; i++){
       fact= fact*i;
     }      
     System.out.println("Factorial of " + n + " is : " + fact);
   }}