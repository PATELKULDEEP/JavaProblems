import java.util.Scanner;

public class RetailStoreManagement {

    public static void main(String[] args) {
        int billId = 0;
        int customerId = 0;
        int discount = 0;
        double billAmount = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("billId : ");
        billId = input.nextInt();
        System.out.print("customerId : ");
        customerId = input.nextInt();
        System.out.print("discount : ");
        discount = input.nextInt();
        System.out.print("billAmount : ");
        billAmount = input.nextDouble();

        double discountedBillAmount = billAmount - (billAmount *  ((double) discount / 100));

        System.out.println(discountedBillAmount);
    }


}
