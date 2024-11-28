public class Program76 {
    public static void main(String[] args){
        int[] arr={50, -20, 0, 30, 40, 60, 12};
       int[] array2 = {50, 20, 10, 20, 30, 50, 12};
       int num1=arr[0];
       int num2=arr.length-1;
       int num3=arr[num2];
        int num4=array2[0];
        int num5=array2.length-1;
        int num6=array2[num2];
        if(num1 == num4 && num3 == num6 )
            System.out.println("True");
        else {
            System.out.println("False");
        }
    }

}
