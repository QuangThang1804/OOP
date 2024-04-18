package mylist;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            return false;
        }
        return true;
    }

    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu theo định dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            if (i == 0) {
                sb.append("[");
            }
            if (i != size() - 1) {
                sb.append(get(i)).append(", ");
            } else {
                sb.append(get(i)).append("]");
            }
        }
        return sb.toString();
    }
}
