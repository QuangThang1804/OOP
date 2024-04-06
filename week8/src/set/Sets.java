package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer value: second) {
            if (first.contains(value)) {
                intersectionSet.add(value);
            }
        }
        return intersectionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        for (Integer value: second) {
            if (!first.contains(value)) {
                unionSet.add(value);
            }
        }
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = first;
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = first;
        unionSet.addAll(second);
        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>();
        for (Integer value: source) {
            list.add(value);
        }
        return list;
    }
}
