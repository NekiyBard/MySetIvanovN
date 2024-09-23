import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExtractorTest {
    @Test
    void testExtractUniqueNumbersWithDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 5, 3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "The unique numbers from an empty list should be an empty set. ");

    }

    @Test
    void testExtractUniqueNumbersWithEmptyList() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = List.of();

        Set<Integer> expectedUniqueNumbers = new HashSet<>(List.of());
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "The unique numbers from an empty list should be an empty set. ");
    }

    @Test
    void testExtractUniqueNumbersWithNoDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "The unique numbers from an empty list should be an empty set. ");

    }

    @Test
    void testExtractUniqueNumbersWithNegativeNumbers() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -1, -5, -3);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(Arrays.asList(-1, -2, -3, -4, -5));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "The unique numbers from an empty list should be an empty set. ");

    }

    @Test
    void testExtractUniqueNumbersWithAllDuplicates() {
        UniqueNumberExtractor extractor = new UniqueNumberExtractor();
        List<Integer> numbers = Arrays.asList(2, 2, 2, 2);

        Set<Integer> expectedUniqueNumbers = new HashSet<>(List.of(2));
        Set<Integer> actualUniqueNumbers = extractor.extractUniqueNumbers(numbers);
        assertEquals(expectedUniqueNumbers, actualUniqueNumbers, "The unique numbers from an empty list should be an empty set. ");

    }
}