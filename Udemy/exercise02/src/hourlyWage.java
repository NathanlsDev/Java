import java.util.Scanner;
public class hourlyWage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int employerNumber;
    double workedHours;
    double amountPerHour;
    double salary;

    employerNumber = sc.nextInt();
    workedHours = sc.nextDouble();
    amountPerHour = sc.nextDouble();

    salary = workedHours * amountPerHour;

    System.out.printf("The employee N°: %d, 'll receive U$: %.2f", employerNumber,salary);
  }
}
