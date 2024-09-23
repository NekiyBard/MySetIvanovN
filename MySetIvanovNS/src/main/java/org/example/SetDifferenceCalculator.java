package org.example;
import java.util.Set;

public class SetDifferenceCalculator {
    public Set<Integer> calculateDifference(Set<Integer> set1, Set<Integer> set2){
    set1.removeAll(set2);
        return set1;
    }

}
