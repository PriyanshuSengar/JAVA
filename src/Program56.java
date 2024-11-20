import java.util.Scanner;

public class Program56 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Strating of the range :");
        int strrange= sc.nextInt();
        System.out.print("Enter the last of the range :");
        int lasrange= sc.nextInt();
        System.out.print("Enter the num of the range :");
        int num= sc.nextInt();
        for(int i=strrange;i<=lasrange;i++){
            if(i%num==0){
                System.out.println(i);
            }
        }
    }
}
