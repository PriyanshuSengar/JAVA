import java.util.Scanner;

public class Program49 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the NUmber :");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
