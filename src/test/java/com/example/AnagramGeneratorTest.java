package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramGeneratorTest {

    @Test
    public void testThreeLetters() {
        List<String> anagrams = AnagramGenerator.generateAnagrams("abc");
        assertEquals(6, anagrams.size());
        assertTrue(anagrams.contains("abc"));
        assertTrue(anagrams.contains("cba"));
    }

    @Test
    public void testSingleLetter() {
        List<String> anagrams = AnagramGenerator.generateAnagrams("a");
        assertEquals(1, anagrams.size());
        assertEquals("a", anagrams.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyInput() {
        AnagramGenerator.generateAnagrams("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidCharacters() {
        AnagramGenerator.generateAnagrams("a1b");
    }
}
