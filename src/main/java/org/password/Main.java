package org.password;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner scn = new Scanner( System.in );
        System.out.println( "Please enter a password" );
        String input = scn.nextLine();
        
        if ( passwordHasError( input ) ) {
            if ( !isPasswordAtLeast8CharactersLong( input ) )
                System.out.println( "Password must be at least 8 characters long." );
            if ( !passwordContainsNumbers( input ) )
                System.out.println( "Password must contain at least one number." );
            if ( !passwordContainsUppercaseLetter( input ) )
                System.out.println( "Password must contain at least one uppercase letter." );
            if ( !passwordContainsLowercaseLetter( input ) )
                System.out.println( "Password must contain at least one lowercase letter." );
            if ( !passwordContainsSpecialCharacter( input ) )
                System.out.println( "Password must contain at least one special character." );
        } else if ( !passwordIsNotCommon( input ) )
            System.out.println( "Password is too common. Create a stronger password." );
        else
            System.out.println( "Password is good." );
        
        scn.close();
        
        randomPassword();
        
    }
    
    public static boolean isPasswordAtLeast8CharactersLong( String password ) {
        int passwordLength = password.length();
        
        return passwordLength >= 8;
    }
    
    public static boolean passwordContainsNumbers( String password ) {
        return password.matches( ".*\\d.*" );
    }
    
    public static boolean passwordContainsUppercaseLetter( String password ) {
        return password.matches( ".*[A-Z].*" );
    }
    
    public static boolean passwordContainsLowercaseLetter( String password ) {
        return password.matches( ".*[a-z].*" );
    }
    
    public static boolean passwordContainsSpecialCharacter( String password ) {
        return password.matches( ".*[\\p{P}\\p{S}].*" );
    }
    
    public static boolean passwordIsNotCommon( String password ) {
        return !Arrays.asList( CommonPasswords.mostCommonPasswords ).contains( password );
    }
    
    public static void randomPassword() {
        String generatedPassword = "";
        
        while ( passwordHasError( generatedPassword ) ) {
            generatedPassword = RandomStringUtils.insecure().nextAscii( 8 );
        }
        
        System.out.println( "Random password: " + generatedPassword );
    }
    
    public static boolean passwordHasError( String password ) {
        return !isPasswordAtLeast8CharactersLong( password ) || !passwordContainsNumbers( password )
                || !passwordContainsUppercaseLetter( password )
                || !passwordContainsLowercaseLetter( password )
                || !passwordContainsSpecialCharacter( password );
    }
    
}
