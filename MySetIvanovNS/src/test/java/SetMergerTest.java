import org.example.SetIntersectionChecker;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetMergerTest {

        @Test
        void testSet1() {
            SetIntersectionChecker checker = new SetIntersectionChecker();

            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            assertTrue(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

        }

        @Test
        void testSet2() {
            SetIntersectionChecker checker = new SetIntersectionChecker();

            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 10, 7, 9, 8));
            assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

        }


        @Test
        void testSet3() {
            SetIntersectionChecker checker = new SetIntersectionChecker();

            Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
            Set<Integer> set2 = new HashSet<>(Arrays.asList());
            assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

        }


        @Test
        void testSet4() {
            SetIntersectionChecker checker = new SetIntersectionChecker();

            Set<Integer> set1 = new HashSet<>(Arrays.asList());
            Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 10, 7, 9, 8));
            assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

        }


        @Test
        void testSet5() {
            SetIntersectionChecker checker = new SetIntersectionChecker();

            Set<Integer> set1 = new HashSet<>(Arrays.asList());
            Set<Integer> set2 = new HashSet<>(Arrays.asList());
            assertFalse(checker.isIntersecting(set1, set2), "I don't understand what write here. ");

        }

    }


