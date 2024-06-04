package hus.FE_An.mybookmanager;

import hus.Week12.mylist.MyLinkedListNode;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            this.currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            return getNodeByIndex(this.currentPosition).data != null;
        }

        @Override
        public Object next() {
//            return getNodeByIndex(this.currentPosition++).data;
            Node current = getNodeByIndex(this.currentPosition);
            this.currentPosition++;
            return current.data;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        Node current = getNodeByIndex(index);
        current.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        insertAtPosition(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        insertAtPosition(value, this.size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        super.checkBoundaries(index, this.size);
        if (index == 0) {
            this.head = new Node(value, this.head);
        } else {
            Node current = getNodeByIndex(index - 1);
            current.next = new Node(value, current.next);
        }
        this.size++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        super.checkBoundaries(index, size);
        if (index == 0) {
            head = head.next;
        } else {
            Node current = getNodeByIndex(index - 1);
            current.next = getNodeByIndex(index + 1);
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Object get(int index) {
        return getNodeByIndex(index).data;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(0);
    }
}
