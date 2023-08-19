import java.util.Scanner;
class q2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of n");
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
        System.out.print(i + " ");
            i++;
        }
        System.out.println();  
    }
}