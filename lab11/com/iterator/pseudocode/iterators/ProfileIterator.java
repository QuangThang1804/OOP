package com.iterator.pseudocode.iterators;

import com.iterator.pseudocode.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
