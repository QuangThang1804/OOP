package set;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 3, 2, 1, 4));
        Set<Integer> second = new HashSet<>(Arrays.asList(8, 3, 5, 1, 4));

        Set<Integer> intersectionManual = Sets.intersectionManual(first, second);
        System.out.println(intersectionManual.toString());
        Set<Integer> unionManual = Sets.unionManual(first, second);
        System.out.println(unionManual.toString());

        Set<Integer> intersection = Sets.intersection(first, second);
        System.out.println(intersection.toString());
        Set<Integer> union = Sets.union(first, second);
        System.out.println(union.toString());

        List<Integer> list = Sets.toList(first);
        System.out.println(list.toString());

        List<Integer> list1 = Arrays.asList(1, 2, 5, 7, 5, 2, 0, 9);
        List<Integer> listRemoveDuplicatesManual = Sets.removeDuplicatesManual(list1);
        System.out.println(listRemoveDuplicatesManual.toString());
        List<Integer> listRemoveDuplicates = Sets.removeDuplicates(list1);
        System.out.println(listRemoveDuplicates.toString());

        System.out.println(Sets.firstRecurringCharacter("abcacb"));
        System.out.println(Sets.allRecurringChars("abccbadeffde"));

        Integer[] setToArr = Sets.toArray(first);
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 5, 7, 5, 2, 0, 9));
        System.out.println(Sets.getFirst(set));
        System.out.println(Sets.getLast(set));
        System.out.println(Sets.getGreater(set, 6));
    }
}
