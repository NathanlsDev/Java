import java.util.Scanner;

public class exercise01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//    int x;
//    int y;
//
//    x = sc.nextInt();
//    y = sc.nextInt();
//
//    int result = x + y;
//
//    System.out.printf("The sum of %d e %d is: %d", x, y, result);


    double pi;
    double diameter;
    double result;

    pi =  3.14159;
    diameter = sc.nextDouble();

    result = pi * Math.pow(diameter, 2);

    System.out.printf("The area of %.2f is: %.4f", diameter, result);
  }
}
