package map;

import java.util.*;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, 1);
        map.put(5, 2);
        map.put(4, 5);
        map.put(9, 4);
        System.out.println(Maps.count(map));
        Maps.empty(map);
        System.out.println(map.toString());
        map.put(1, 5);
        map.put(2, 1);
        map.put(5, 2);
        map.put(4, 5);
        map.put(9, 4);
        if (Maps.contains(map, 5)) {
            System.out.println("map contains key");
        } else {
            System.out.println("map does not contains key");
        }

        if (Maps.containsValue(map, 5, 2)) {
            System.out.println("map contains key-value");
        } else {
            System.out.println("map does not contains key-value");
        }

        Set<Integer> keySet = Maps.keySet(map);
        System.out.println(keySet.toString());

        Collection<Integer> values = Maps.values(map);
        System.out.println(values.toString());

        for (Integer value : values) {
            System.out.println(Maps.getColor(value));
        }
    }
}
