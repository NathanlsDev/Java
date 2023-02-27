import java.util.Scanner;
public class product {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int partCode;
    int partQuantity;
    double partPrice;

    int codePart2;
    int quantityPart2;
    double pricePart2;

    double total;

    partCode = sc.nextInt();
    partQuantity = sc.nextInt();
    partPrice = sc.nextDouble();

    codePart2 = sc.nextInt();
    quantityPart2 = sc.nextInt();
    pricePart2 = sc.nextDouble();

    total = (partQuantity * partPrice) + (quantityPart2 * pricePart2);

    System.out.printf("The code of product 1: is %d,\n" +
        "amount: %d,\n" +
        "code of product 2: %d,\n" +
        "amout: %d,\n" +
        "total price is: %.2f",
        partCode, partQuantity, codePart2, quantityPart2, total);
  }
}
