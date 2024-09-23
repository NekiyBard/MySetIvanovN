import java.util.HashSet;
import java.util.Set;
public class SetMerger {
    public Set<Integer> mergerSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> merger = new HashSet<>(set1);
        merger.addAll(set2);
        return merger;
    }
}
