import java.util.Scanner;
public class demo31{
    public static void main(String[] args) {
        Scanner o1=new Scanner(System.in);
        System.out.println("Enter the Username");
        String Username=o1.nextLine();
        System.out.println("Username :"+Username);
        Scanner o2=new Scanner(System.in);
        System.out.println("Enter your age :");
        String age=o2.nextLine();
        System.out.println("Age :"+age);
    }
}