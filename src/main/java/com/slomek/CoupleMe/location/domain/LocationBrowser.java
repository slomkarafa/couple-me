package com.slomek.CoupleMe.location.domain;

public interface LocationBrowser {

    LocationDto searchForUserLocation(String username);

    void addUserLocation(LocationDto locationDto);
}
