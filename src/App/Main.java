package App;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static String[] products;

    public static void main(String[] args) {

        products = new String[]{"milk", "potatoes", "meat", "apples", "cakes", "candies", "juice", "apples", "candies",
                "milk", "cakes", "apples", "juice"};

        int counter = 1;

        for (String productName : products) {

            if (counter == 1)
                System.out.printf("%nList of products:%n%d) %s", counter, productName);
            else
                System.out.printf("%n%d) %s", counter, productName);

            counter++;

        }

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        String inputProdName;
        String indexes = "indexes: ";
        String sequenceNum = "Sequence numbers: ";

        System.out.print("\n\nEnter the name of the product: ");
        inputProdName = scanner.nextLine();

        counter = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(inputProdName)) {
                if (counter == 0) {
                    indexes += Integer.toString(i);
                    sequenceNum += Integer.toString(i + 1);
                } else {
                    indexes += ", " + Integer.toString(i);
                    sequenceNum += ", " + Integer.toString(i + 1);
                }

                counter++;
            }
        }

        if (counter <= 0)
            System.out.print("\nNot found :( ");
        else
            System.out.printf("%nCount of products found = %d; %n%s; %n%s;%n", counter, sequenceNum, indexes);


        scanner.close();

    }
}
