import java.util.Scanner;

public class Program12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First Number-");
        int num= sc.nextInt();
        System.out.println("Enter the Second Number-");
        int num2= sc.nextInt();
        System.out.println("Enter the Third Number-");
        int num3= sc.nextInt();
        System.out.println((num+num2+num3)/3);
    }
}
