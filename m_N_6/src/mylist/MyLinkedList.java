package mylist;

public class MyLinkedList extends MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public MyIterator iterator() {
        MyLinkedListIterator newList = new MyLinkedListIterator(head);
        return newList;
    }

    @Override
    public void append(Object o) {
        insert(o, size);
    }

    @Override
    public Object get(int index) {
        return this;
    }

    @Override
    public void insert(Object o, int index) {
        if (index == 0) {
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode nextNode = getNodeByIndex(index + 1);
            current.setNext(nextNode);
        }
        size--;
    }

    @Override
    public void set(Object o, int index) {
        MyLinkedListNode current = getNodeByIndex(index - 1);
        current.setNext(new MyLinkedListNode(o, current.getNext()));
    }

    @Override
    public int size() {
        return size;
    }
}
