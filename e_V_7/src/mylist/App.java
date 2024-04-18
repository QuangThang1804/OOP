package mylist;

public class App {
    public static void main(String[] args) {
        MyList list = new LinkedListMyList();
        list.insertAtStart(5);
        list.insertAtPos(6, 1);
        list.insertAtEnd(7);
        System.out.println(list.toString());
//        testQueue();
        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */

    }

    public static void testStack() {

        /* TODO */
    }

    public static void testQueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.add(2);
        myQueue.add(4);
        myQueue.add(5);
        System.out.println(myQueue.toString());
        myQueue.remove();
        System.out.println(myQueue);

        System.out.println(myQueue.peek());
        if (myQueue.isEmpty()) {
            System.out.println("Queue empty");
        } else {
            System.out.println("Queue not empty");
        }
    }
}
