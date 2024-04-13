package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Lists.insertFirst(list, 0);
        System.out.println(list.toString());
        Lists.insertLast(list, 1000);
        System.out.println(list.toString());
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(666);
        System.out.println(list.toString());
        Lists.replace(list, 10);
        System.out.println(list.toString());
        Lists.removeThird(list);
        System.out.println(list.toString());
        Lists.removeEvil(list);
        System.out.println(list.toString());
        List<Integer> listSquare = Lists.generateSquare();
        System.out.println(listSquare.toString());
        if (Lists.contains(list, 2)) {
            System.out.println("list contains 2");
        } else {
            System.out.println("list does not contain 2");
        }
        Lists.copy(list, listSquare);
        System.out.println(listSquare.toString());
        Lists.reverse(listSquare);
        System.out.println(listSquare.toString());
        Lists.reverseManual(listSquare);
        System.out.println(listSquare);
        LinkedList<Integer> newList = new LinkedList<>();
        Lists.insetBeginningEnd(newList, 5);
        System.out.println(newList.toString());
    }
}
