package CONTACTBOOK;

import java.util.Scanner;

public class Driver {
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {
        Scanner readVal = new Scanner(System.in);
        System.out.println(TEXT_BLUE + "********** Contact Book *************8"+ TEXT_RESET);
        System.out.println(
                TEXT_BLUE+"1.Add Contact \n" +
                        "2.View Contacts\n" +
                        "3.Search Contact\n" +
                        "4.Update Contact\n" +
                        "5.Delete Contact\n" +
                        "6.Exit\n\n" +
                        "" +
                        "Enter your Choice:"
        );
        int choice = readVal.nextInt();
        System.out.println(TEXT_BLUE +"********************************************************"+ TEXT_RESET);

    }
}
