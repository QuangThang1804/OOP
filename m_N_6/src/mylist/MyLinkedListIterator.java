package mylist;

public class MyLinkedListIterator implements MyIterator {
    MyLinkedListNode currentNode;
    @Override
    public boolean hasNext() {
        return (currentNode.next != null);
    }

    @Override
    public Object next() {
        return currentNode.getNext().getPayload();
    }
}
