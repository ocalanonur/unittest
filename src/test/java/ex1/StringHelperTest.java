package ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class StringHelperTest {

    @Test
    public void test() {

        boolean result = StringHelper.isStringLong("abc");
        assertFalse(result);
    }
}