package mylist;

public class TestApp {
    public static void main(String[] args) {
        // Test MyArrayList
        MyList list = new MyArrayList();
        list.add("a", 0);
        list.add("b");
        list.add("c", 0);
        list.add("c", 3);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println();

        // Test MyLinkedList
        MyList list2 = new MyLinkedList();
        list2.add("a", 0);
        list2.add("b");
        System.out.println(list2);
        list2.remove(0);
        System.out.println(list2);
        list2.add("c", 0);
        list2.add("d", 2);
        System.out.println(list2);
        list2.remove(list2.size() - 1);
        System.out.println(list2.size());
        System.out.println(list2);
    }
}
