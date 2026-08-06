import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        if(units<=100) System.out.println(units*2);
        else System.out.println(units*3);
    }
}
