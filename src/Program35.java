import java.util.Scanner;

public class Program35 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon :");
        int n= sc.nextInt();
        System.out.print("Input the length of one of the sides :");
        int s= sc.nextInt();
        System.out.println("Ares of Polygon :"+areaofpolynomila(n,s));
    }
    public static double areaofpolynomila(int n,int s){
       return  (n*s*s)/(4*Math.tan(Math.PI/n));

    }
}
