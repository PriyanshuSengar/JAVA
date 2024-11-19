import java.util.*;

public class Program53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("Input a boolean value (true/false): ");
        boolean xyz = in.nextBoolean();
        System.out.print("The result is: " + test(x, y, z, xyz));
        System.out.print("\n");
    }
    public static boolean test(int p, int q, int r, boolean xyz) {
        if (xyz)
            return (r > q);
        return (q > p && r > q);
    }
}
