package org.password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a password");
        String input = scn.nextLine();

        if (!isPasswordAtLeast8CharactersLong(input))
            System.out.println("Password must be at least 8 characters long.");
        if (!passwordContainsNumbers(input))
            System.out.println("Password must contain at least one number.");
        if (!passwordContainsUppercaseLetter(input))
            System.out.println("Password must contain at least one uppercase letter.");
        if (!passwordContainsLowercaseLetter(input))
            System.out.println("Password must contain at least one lowercase letter.");

        scn.close();

    }

    public static boolean isPasswordAtLeast8CharactersLong(String password) {
        int passwordLength = password.length();

        return passwordLength >= 8;
    }

    public static boolean passwordContainsNumbers(String password) {
        return password.matches(".*\\d.*");
    }

    public static boolean passwordContainsUppercaseLetter(String password) {
        return password.matches(".*[A-Z].*");
    }

    public static boolean passwordContainsLowercaseLetter(String password) {
        return password.matches(".*[a-z].*");
    }
}
