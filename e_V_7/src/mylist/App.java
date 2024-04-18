package mylist;

public class App {
    public static void main(String[] args) {
        MyList list = new LinkedListMyList();
        list.insertAtStart(5);
        list.insertAtPos(6, 1);
        list.insertAtEnd(7);
        list.insertAtPos(10, 4);
        System.out.println(list.toString());
//        testQueue();
//        testStack();
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
        int n = (int) (Math.random() * 15) + 15;
        System.out.println(n);
        MyStack myStack = new MyStack();
        for (int i = 0; i <= n; i++) {
            myStack.push((int) (Math.random() * 100));
        }
        while (!myStack.isEmpty()) {
            myStack.pop();
            System.out.println(myStack);
        }
        System.out.println();
    }

    public static void testQueue() {
        int n = (int) (Math.random() * 15) + 15;
        System.out.println(n);
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i <= n; i++) {
            myQueue.add((int) (Math.random() * 100));
        }
        while (!myQueue.isEmpty()) {
            myQueue.remove();
            System.out.println(myQueue);
        }
        System.out.println();
    }
}
