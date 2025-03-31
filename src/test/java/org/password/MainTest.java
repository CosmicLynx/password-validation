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
}
