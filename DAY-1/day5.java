// operator precedence 
public class day5{
    public static void main(String[] arg){
        int x=2 , y=5;
        int out1=(x*y/x);
        int out2=(x*(y/x));
        System.out.println("out1 is " + out1);
        System.out.println("out2 is " + out2);
    }
}