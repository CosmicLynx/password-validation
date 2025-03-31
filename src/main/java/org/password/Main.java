package org.password;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a password");
        String input = scn.nextLine();

        if (!isPasswordAtLeast8CharactersLong(input) || !passwordContainsNumbers(input)
                || !passwordContainsUppercaseLetter(input)
                || !passwordContainsLowercaseLetter(input)) {
            if (!isPasswordAtLeast8CharactersLong(input))
                System.out.println("Password must be at least 8 characters long.");
            if (!passwordContainsNumbers(input))
                System.out.println("Password must contain at least one number.");
            if (!passwordContainsUppercaseLetter(input))
                System.out.println("Password must contain at least one uppercase letter.");
            if (!passwordContainsLowercaseLetter(input))
                System.out.println("Password must contain at least one lowercase letter.");
        } else if (!passwordIsNotCommon(input))
            System.out.println("Password is too common. Create a stronger password.");

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

    public static boolean passwordIsNotCommon(String password) {
        return !Arrays.stream(CommonPasswords.mostCommonPasswords).anyMatch(password::equals);
    }

}
