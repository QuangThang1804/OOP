package mylist;

public class TestApp {
    public static void main(String[] args) {
//        MyList list = new MyArrayList();
//        list.add("a", 0);
//        list.add("b");
//        list.add("c", 0);
//        list.add("c", 3);
//        System.out.println(list);
//
//        list.remove(3);
//        System.out.println(list);
//
//        System.out.println(list.size());
//        System.out.println(list);


        MyList list = new MyLinkedList();
        list.add("a", 0);
        list.remove(0);
        System.out.println(list);
        list.add("b");
        list.add("c", 0);
        list.add("c", 2);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list);
    }
}
