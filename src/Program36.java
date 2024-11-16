import java.util.Scanner;

//Write a Java program to compute the distance between two points on the earth's surface.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
public class Program36 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Input the latitude of coordinate lat1:");
    double lat1=sc.nextDouble();
    System.out.print("Input the longitude of coordinate long1:");
    double long1=sc.nextDouble();
    System.out.print("Input the latitude of coordinate lat2:");
    double lat2=sc.nextDouble();
    System.out.print("Input the longitude of coordinate long2:");
    double long2=sc.nextDouble();
    System.out.println("Radius of the earth r :");
    double r=sc.nextDouble();
    System.out.println("The distance between those points is :"+cal(lat1,lat2,long1,long2,r));
}
public static double cal(double lat1,double lat2,double long1,double long2,double r){
    double d=0;
    lat1 = Math.toRadians(lat1);
    long1 = Math.toRadians(long1);
    lat2 = Math.toRadians(lat2);
    long2 = Math.toRadians(long2);
    d = r * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
    return d;
}
}
