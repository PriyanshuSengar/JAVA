import java.util.Scanner;

public class Program32 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First Number -");
        int num=sc.nextInt();
        System.out.print("Enter the Second Number -");
        int num2=sc.nextInt();
    if(num == num2){
        System.out.println(num+"="+num2);
    } else if (num > num2) {
        System.out.println(num+">"+num2);
    }
    else if (num < num2) {
        System.out.println(num+"<"+num2);
    }
    else {
        System.out.println(num+"!="+num2);
        }

    }
}
