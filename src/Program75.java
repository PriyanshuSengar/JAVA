import java.lang.*;

public class Program75 {
    public static void main(String[] args) {
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};
        boolean result = (num_array.length >= 2 && num_array[0] == num_array[num_array.length - 1]);
        System.out.println(result);
    }
}
