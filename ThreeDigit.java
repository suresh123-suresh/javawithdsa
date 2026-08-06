import java.util.Scanner;
public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(Math.abs(n)>=100 && Math.abs(n)<=999) System.out.println("Three Digit");
        else System.out.println("Not Three Digit");
    }
}
