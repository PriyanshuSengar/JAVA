import java.util.Scanner;

public class Program52 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number :");
        int num1= sc.nextInt();
        System.out.print("Enter the second Number :");
        int num2= sc.nextInt();
        System.out.print("Enter the third Number :");
        int num3= sc.nextInt();
        if(num1+num2 == num3){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
