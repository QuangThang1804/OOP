package mylist;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
//        this.end = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        Node current = this.start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        Node current = this.start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        insertAtPos(value, 0);
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        insertAtPos(value, size);
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
//        if (!checkBoundaries(index, size)) {
//            throw new ArrayIndexOutOfBoundsException("Index out of range");
//        }
        // Xử lý cả end và start
        if (checkBoundaries(index, size)) {
            Node newNode = new Node(value);
            if (size == 0) {
                start = newNode;
                end = newNode;
            } else if (index == 0) {
                newNode.next = start;
                start = newNode;
            } else if (index == size) {
                end.next = newNode;
                end = newNode;
            } else {
                Node prevNode = getNodeByIndex(index - 1);
                newNode.next = prevNode.next;
                prevNode.next = newNode;
            }
            size++;
        } else {
            System.out.println("Index out of range");
        }

//        Node newNode;
//        if (checkBoundaries(index, size)) {
//            if (index == 0) {
//                newNode = new Node(value);
//                newNode.next = this.start;
//                this.start = newNode;
//            } else {
//                Node current = getNodeByIndex(index - 1);
//                newNode = new Node(value);
//                current.next = newNode;
//                if (index != size - 1) {
//                    newNode.next = current.next;
//                } else {
//                    this.end = newNode;
//                    newNode.next = null;
//                }
//            }
//            size++;
//        } else {
//            System.out.println("Index out of range");
//        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        if (index == 0) {
            this.start = start.getNext();
        } else {
            Node current = getNodeByIndex(index - 1);
            current.next = getNodeByIndex(index + 1);
            if (index == size - 1) {
                this.end = current;
            }
        }
        size--;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        Node current = start;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = get(i);
        }
        return arr;
    }
}
