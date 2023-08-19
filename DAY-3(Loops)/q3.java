// for loop to fin sum of n atural number
import java.util.Scanner;
class q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
       System.out.println("sum is: " + sum); 
    }
}