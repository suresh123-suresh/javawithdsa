import java.util.Scanner;
class Student{int id;String name;void getData(int i,String n){id=i;name=n;}void display(){System.out.println("ID: "+id);System.out.println("Name: "+name);}}
public class StudentDemo{public static void main(String[]args){Scanner sc=new Scanner(System.in);Student s=new Student();int id=sc.nextInt();sc.nextLine();String name=sc.nextLine();s.getData(id,name);s.display();}}