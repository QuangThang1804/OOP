package mylist;

public interface MyList extends MyIterable {
    void append(Object o);
    Object get(int index);
    void insert(Object o, int index);
    void remove(int index);
    void set(Object o, int index);
    int size();
}
