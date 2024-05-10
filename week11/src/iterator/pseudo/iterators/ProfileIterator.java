package iterator.pseudo.iterators;

import iterator.pseudo.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
