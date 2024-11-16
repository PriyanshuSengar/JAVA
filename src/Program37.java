import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        char[] str = sc.nextLine().toCharArray();
        for(int i= str.length-1;i>=0;i--){
            System.out.print(str[i]);
        }
    }
}