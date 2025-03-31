package org.password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a password");
        String input = scn.nextLine();

        if (!isPasswordAtLeast8CharactersLong(input))
            System.out.println("Password must be at least 8 characters long.");
        else
            System.out.println("Password ok");

        scn.close();

    }

    public static boolean isPasswordAtLeast8CharactersLong(String password) {
        int passwordLength = password.length();

        return passwordLength >= 8;
    }
}
