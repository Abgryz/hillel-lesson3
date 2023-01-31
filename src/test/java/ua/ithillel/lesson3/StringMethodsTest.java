package ua.ithillel.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMethodsTest {

    @Test
    void findSymbolOccuranceTest1() {
        assertEquals(2, StringMethods.findSymbolOccurance("some string", 's'));
    }
    @Test
    void findSymbolOccuranceTest2() {
        assertEquals(0, StringMethods.findSymbolOccurance("some string", 'q'));
    }


    @Test
    void findWordPositionTest1() {
        assertEquals(-1, StringMethods.findWordPosition("some string", "none"));
    }
    @Test
    void findWordPositionTest2() {
        assertEquals(0, StringMethods.findWordPosition("some string", "some"));
    }
    @Test
    void findWordPositionTest3() {
        assertEquals(5, StringMethods.findWordPosition("some string", "string"));
    }

    @Test
    void stringReverseTest1() {
        assertEquals("egassem", StringMethods.stringReverse("message"));
    }
    @Test
    void stringReverseTest2() {
        assertEquals("tseT", StringMethods.stringReverse("Test"));
    }

    @Test
    void isPalindromeTest1() {
        assertTrue(StringMethods.isPalindrome("arara"));
    }
    @Test
    void isPalindromeTest2() {
        assertFalse(StringMethods.isPalindrome("ararat"));
    }
}