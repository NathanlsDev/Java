public class Main {
  public static void main(String[] args) {
    int y = 32;
    double x = 10.35784;
    String name = "Maria";
    int age = 31;
    double salary = 4000.0;

    System.out.println("Hello World");
    System.out.println("Good Evening");
    System.out.println(y);
    System.out.printf("%.2f%n", x);
    System.out.printf("%.4f%n", x);
    System.out.println("Result = " + x + " meters");
    System.out.printf("Result = %.2f meters %n", x);
    System.out.printf("%s is %d years old, and earn $ %.2f dollars%n", name, age, salary);

  }
}
