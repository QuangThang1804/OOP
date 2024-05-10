package com.iterator.pseudocode.social_networks;

import com.iterator.pseudocode.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);


}
