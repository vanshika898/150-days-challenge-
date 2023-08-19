//reverse the given number
class q6 {
    public static void main(String[] args) {
    int n=29104;
    int rev=0;
    while(n>0){
        int last_digit=n%10;
        rev= (rev*10)+last_digit;
        n=n/10;  // number divide by 10 give quotient which last digit is reduced
        }
        System.out.println(rev);
    }
}