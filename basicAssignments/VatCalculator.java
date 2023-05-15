import java.util.Scanner;

public class VatCalculator {
    // İbrahim Halil HAN
    public static void main(String[] args) {
        double sVat = 0.18, bVat = 0.08, inputPrice, pricewithVat;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total price: ");
        inputPrice = input.nextDouble();
        double totalVat = (inputPrice > 0 && inputPrice <= 1000) ? inputPrice * sVat : inputPrice * bVat;
        double usingVat = (inputPrice > 0 && inputPrice <= 1000) ? sVat : bVat;
        pricewithVat = totalVat + inputPrice;

        //Print area
        System.out.println("Price with no VAT: " + inputPrice);
        System.out.println("According to amount of the price, VAT: " + usingVat);
        System.out.println("Amount of VAT: " + totalVat);
        System.out.println("Price with VAT: "+ pricewithVat);

        input.close();
    }
}
