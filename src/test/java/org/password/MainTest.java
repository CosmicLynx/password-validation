package org.password;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void test_isPasswordAtLeast8CharactersLong_trueIf10Chars() {
        assertTrue(Main.isPasswordAtLeast8CharactersLong("tencharspw"));
    }

    @Test
    void test_isPasswordAtLeast8CharactersLong_falseIf5Chars() {
        assertFalse(Main.isPasswordAtLeast8CharactersLong("passw"));
    }

}
