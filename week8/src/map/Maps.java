package map;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsValue(Map<Integer, Integer> map, int key, int value) {
        boolean isContainValue = false;
        if (contains(map, key)) {
            if (map.get(key) == value) {
                isContainValue = true;
            }
        }
        return isContainValue;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        StringBuilder colorStr = new StringBuilder();
        if (value == 0) {
            colorStr.append("black");
        } else if (value == 1) {
            colorStr.append("white");
        } else if (value == 2) {
            colorStr.append("red");
        }
        return colorStr.toString();
    }
}
