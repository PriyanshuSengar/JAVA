public class Program81 {
    public static void main(String[] args){
      int[]  Array= {20, 30, 40};
      int start=Array[0];
      int value=Array.length-1;
      int end=Array[value];
      int var=0;
      var=start;
      start=end;
      end=var;
        System.out.println("Starting index of the Array is "+Array[0]+"  "+"Ending index value of the Array is ="+Array[Array.length-1]);
        System.out.println("After swaping  the value. the staring value of the Array is = "+start+"  and the end value is = "+end);
    }
}
