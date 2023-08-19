// Print Reverse of a number
class q5 {
    public static void main(String[] args) {
    int n=29104;
    while(n>0){
        int last_digit=n%10;
        System.out.print(last_digit + " ");
        n=n/10;  // number divide by 10 give quotient which last digit is reduced
        }
        System.out.println();
    }
}