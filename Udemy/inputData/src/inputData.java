import java.util.Scanner;

public class inputData {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double z;
    int y;
    char beta;
    String x;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();
    beta = sc.next().charAt(0);

    System.out.printf("You typed: %s\n", x);
    System.out.printf("You typed: %s\n", y);
    System.out.printf("You typed: %s\n", z);
    System.out.printf("You typed: %s\n", beta);

    sc.close();
  }
}
