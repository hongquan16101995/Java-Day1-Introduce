package Exercise3;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        USD = scanner.nextDouble();
        double change = USD * VND;
        System.out.println("Giá trị VND: " + change);
    }
}
