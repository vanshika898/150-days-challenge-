// To optimise previous code
// Very IMP - Check if a number is prime or not

import java.util.Scanner;
class q8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter value of n: ");
        int n= sc.nextInt();
        
        boolean isprime=true;
        if (n==2){
            System.out.println("n is prime");
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++){      //code opimisation is due to nis now check tilll underroot n only 
              if (n%i==0){
              isprime=false;
            }
        }
        if (isprime==true){
            System.out.println("n is prime");}
        else{
            System.out.println("n is not prime");
        }
        }
    }}