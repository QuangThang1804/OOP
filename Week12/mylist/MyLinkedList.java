package hus.Week12.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return this.size;
        // Neu k co size
//        int count = 0;
//        MyLinkedListNode currentNode = this.head;
//        while (currentNode != null) {
//            count++;
//            currentNode = currentNode.getNext();
//        }
//        return count;

    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return this.getNodeByIndex(index).getPayload();
//        MyLinkedListNode current = this.head;
//        for (int i = 0; i < index; i++) {
//            current = current.getNext();
//        }
//        return current;
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            return;
        }
        if (index == 0) {
//            this.head = this.getNodeByIndex(1);
            if (this.head == null) {
                return;
            }
            MyLinkedListNode nextNode = this.head.getNext();
            if (nextNode == null) {
                this.head = null;
                return;
            }
            this.head = nextNode;
        } else if (index == size - 1) {
            MyLinkedListNode preNode = getNodeByIndex(index - 1);
            if (preNode == null) {
                return;
            }
            preNode.setNext(null);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
//            current.setNext(getNodeByIndex(index + 1));
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
//        if (size == 0) {
//            this.head = new MyLinkedListNode(payload);
//        }
//        MyLinkedListNode current = getNodeByIndex(size - 1);
//        current.setNext(new MyLinkedListNode(payload));
//        size++;
        this.insert(payload, this.size);
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            this.head = new MyLinkedListNode(payload, this.head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(payload, current.getNext()));
        }
        this.size++;

        // code cua thay Ha
//        MyLinkedListNode newNode = new MyLinkedListNode(payload);
//        if (index == 0) {
//            newNode.setNext(this.head);
//            this.head = newNode;
//        }
//
//        if (index == size) {
//            this.append(payload);
//        }
//        MyLinkedListNode currentNode = getNodeByIndex(index);
//        MyLinkedListNode nextNode = currentNode.getNext();
//
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(this.head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }
}
