package set;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer value : second) {
            if (first.contains(value)) {
                intersectionSet.add(value);
            }
        }
        return intersectionSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionSet = new HashSet<>();
        for (Integer value : first) {
            unionSet.add(value);
        }
        for (Integer value : second) {
            if (!unionSet.contains(value)) {
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
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> newSet = new HashSet<>(source);
        return new ArrayList<>(newSet);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> newList = new ArrayList<>();
        for (Integer value : source) {
            if (!newList.contains(value)) {
                newList.add(value);
            }
        }
        return newList;
    }

    public static String firstRecurringCharacter(String s) {
        String result = "";
        boolean isRecure = false;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    result += s.charAt(i);
                    isRecure = true;
                }
                if (isRecure) {
                    break;
                }
            }
        }
        return result;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> setRecurringChars = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    setRecurringChars.add(s.charAt(i));
                }
            }
        }
        return setRecurringChars;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Object[] objects = source.toArray();
        Integer[] integers = new Integer[objects.length];
        for (int i = 0; i < objects.length; i++) {
            integers[i] = (Integer) objects[i];
        }
        return integers;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
