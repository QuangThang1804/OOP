package hus.Week12.mylist;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        return data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * @param index
     */
    @Override
    public void remove(int index) {
        for (int i = index; i < this.size() - 1; i++) {
            data[i] = data[i + 1];
        }
        this.size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        if (this.size() >= data.length - 1) {
            enlarge();
        }
        data[size++] = payload;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        if (this.size() >= data.length - 1) {
            enlarge();
        }
        for (int i = this.size() - 1; i > index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = payload;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(this.data);
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        Object[] newData = new Object[this.data.length * 2];
        System.arraycopy(data, 0, newData, 0, this.size());
        this.data = newData;
    }
}
