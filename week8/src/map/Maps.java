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


}
