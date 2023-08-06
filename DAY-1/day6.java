/* Conditional Statements- print no. is even or odd */

import java.util.Scanner;
public class day6{
   public static void main (String arg[]){
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter value of A : ");
      int A= sc.nextInt();
      if(A%2==0){
        System.out.println("A is even number");
      }
      else{
        System.out.println("A is odd number");

      } }
}
