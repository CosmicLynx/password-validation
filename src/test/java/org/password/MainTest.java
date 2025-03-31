package org.password;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class MainTest {

    // Password Length
    @Test
    void test_isPasswordAtLeast8CharactersLong_trueIf10Chars() {
        assertTrue(Main.isPasswordAtLeast8CharactersLong("tencharspw"));
    }

    @Test
    void test_isPasswordAtLeast8CharactersLong_falseIf5Chars() {
        assertFalse(Main.isPasswordAtLeast8CharactersLong("passw"));
    }

    @Test
    void test_isPasswordAtLeast8CharactersLong_trueIf8Chars() {
        assertTrue(Main.isPasswordAtLeast8CharactersLong("password"));
    }

    // Password contains numbers
    @Test
    void test_passwordContainsNumbers_trueIfContainsNumbers() {
        assertTrue(Main.passwordContainsNumbers("password2"));
    }

    @Test
    void test_passwordContainsNumbers_falseIfContainsNoNumbers() {
        assertFalse(Main.passwordContainsNumbers("password"));
    }

    // Password contains at least one uppercase and one lowercase letter
    @Test
    void test_passwordContainsUppercaseLetter_trueIfContainsUppercaseLetter() {
        assertTrue(Main.passwordContainsUppercaseLetter("passWord"));
    }

    @Test
    void test_passwordContainsUppercaseLetter_falseIfContainsNoUppercaseLetter() {
        assertFalse(Main.passwordContainsUppercaseLetter("password"));
    }

    @Test
    void test_passwordContainsLowercaseLetter_trueIfContainsLowercaseLetter() {
        assertTrue(Main.passwordContainsLowercaseLetter("PASSwORD"));
    }

    @Test
    void test_passwordContainsLowercaseLetter_falseIfContainsNoLowercaseLetter() {
        assertFalse(Main.passwordContainsLowercaseLetter("PASSWORD"));
    }

    // Password contains special characters
    @Test
    void test_passwordContainsSpecialCharacters_trueIfContainsSpecialCharacter() {
        assertTrue(Main.passwordContainsSpecialCharacters("Password{"));
    }

    @Test
    void test_passwordContainsSpecialCharacters_falseIfContainsNoSpecialCharacter() {
        assertFalse(Main.passwordContainsSpecialCharacters("Password"));
    }

    // Password is not common
    @Test
    void test_passwordIsNotCommon_trueIfNotCommon() {
        assertTrue(Main.passwordIsNotCommon("Jgd492hSDvf"));
    }

    @Test
    void test_passwordIsNotCommon_falseIfCommon() {
        assertFalse(Main.passwordIsNotCommon("Password1"));
    }

}
