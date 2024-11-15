import java.util.Scanner;

public class Program34 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Value of s -");
    int s= sc.nextInt();
    System.out.println("The area of the hexagon is: " + hexagonArea(s) + "\n");
}

    public static double hexagonArea(double s) {
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
}
