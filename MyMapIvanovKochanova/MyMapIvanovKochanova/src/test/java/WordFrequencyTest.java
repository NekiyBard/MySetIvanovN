import org.junit.jupiter.api.Test;

import java.util.Map;
import org.example.WordFrequency;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordFrequencyTest {
    @Test
    public void testCountWordFrequency() {
        String sentence = "Hello world! Hello everyone.";
        Map<String, Integer> expected = Map.of("hello", 2, "world", 1, "everyone", 1);
        Map<String, Integer> actual = WordFrequency.countWordFrequency(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWordFrequencyEmptyString() {
        String sentence = "";
        Map<String, Integer> expected = Map.of();
        Map<String, Integer> actual = WordFrequency.countWordFrequency(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWordFrequencyNullString() {
        String sentence = null;
        Map<String, Integer> expected = Map.of();
        Map<String, Integer> actual = WordFrequency.countWordFrequency(sentence);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWordFrequencySingleWord() {
        String sentence = "Word";
        Map<String, Integer> expected = Map.of("word", 1);
        Map<String, Integer> actual = WordFrequency.countWordFrequency(sentence);
        assertEquals(expected, actual);
    }
}