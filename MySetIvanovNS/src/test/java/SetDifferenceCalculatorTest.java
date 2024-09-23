import org.junit.jupiter.api.Test;
import org.example.SetDifferenceCalculator;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetDifferenceCalculatorTest {
    @Test
    public void test1(){
        SetDifferenceCalculator setC = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(5,4,3,2,1));
        Set<Integer> set2 = new HashSet<>(Set.of(1,2,3,4,5));
        Set<Integer> result = setC.calculateDifference(set1,set2);
        Set<Integer> expected = new HashSet<>(Set.of());
        assertEquals(expected,result);
    }
    @Test
    public void test2(){
        SetDifferenceCalculator setC = new SetDifferenceCalculator();
        Set<Integer> set1 = new HashSet<>(Set.of(2,3,5,7));
        Set<Integer> set2 = new HashSet<>(Set.of(1,2,3,4));
        Set<Integer> result = setC.calculateDifference(set1,set2);
        Set<Integer> expected = new HashSet<>(Set.of(5,7));
        assertEquals(expected,result);
    }
}
