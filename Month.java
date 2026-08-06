import java.util.Scanner;
public class Month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(m>=1 && m<=12) System.out.println(months[m]);
        else System.out.println("Invalid");
    }
}
