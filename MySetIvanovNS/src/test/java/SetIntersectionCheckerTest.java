import org.example.SetIntersectionChecker;
import org.example.UniqueNumberExtractor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetIntersectionCheckerTest {
    @Test
    void testSetWithCommonElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        assertTrue(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

    }

    @Test
    void testSetWithElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 10, 7, 9, 8));
        assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

    }


    @Test
    void testWithNotCommonElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList());
        assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

    }


    @Test
    void testSetWithNotCommonElement() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList());
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 10, 7, 9, 8));
        assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

    }


    @Test
    void testSetWithNotCommonElements() {
        SetIntersectionChecker checker = new SetIntersectionChecker();

        Set<Integer> set1 = new HashSet<>(Arrays.asList());
        Set<Integer> set2 = new HashSet<>(Arrays.asList());
        assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

    }

}
