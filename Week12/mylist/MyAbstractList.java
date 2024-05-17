package hus.Week12.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            str.append("[").append(get(i)).append("]").append(" ");
        }
        return str.toString();
    }
}
