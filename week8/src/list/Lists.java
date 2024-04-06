package list;

import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        boolean removed = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
                removed = true;
            }
        }
        if (!removed) {
            System.out.println("List does not have element 666");
        }
    }

    public static List<Integer> generateSquare() {
        List<Integer> square = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            square.add(i * i);
        }
        return square;
    }

    public static boolean contains(List<Integer> list, int value) {
        boolean isContains = false;
        for (Integer integer : list) {
            if (integer == value) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target.removeAll(target);
        target.addAll(source);
    }

    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        int temp;
        for (int fIdx = 0, lIdx = list.size() - 1; fIdx < lIdx; fIdx++, lIdx--) {
            temp = list.get(lIdx);
            list.set(lIdx, list.get(fIdx));
            list.set(fIdx, temp);
        }
    }

    public static void insetBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        insertFirst(list, 0);
        System.out.println(list.toString());
        insertLast(list,1000);
        System.out.println(list.toString());
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(666);
        System.out.println(list.toString());
        replace(list, 10);
        System.out.println(list.toString());
        removeThird(list);
        System.out.println(list.toString());
        removeEvil(list);
        System.out.println(list.toString());
        List<Integer> listSquare = generateSquare();
        System.out.println(listSquare.toString());
        if (contains(list, 2)) {
            System.out.println("list contains 2");
        } else {
            System.out.println("list does not contain 2");
        }
        copy(list, listSquare);
        System.out.println(listSquare.toString());
        reverse(listSquare);
        System.out.println(listSquare.toString());
        reverseManual(listSquare);
        System.out.println(listSquare);
        LinkedList<Integer> newList = new LinkedList<>();
        insetBeginningEnd(newList, 5);
        System.out.println(newList.toString());
    }
}
