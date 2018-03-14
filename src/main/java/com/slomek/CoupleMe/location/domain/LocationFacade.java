package com.slomek.CoupleMe.location.domain;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class LocationFacade {

    private final LocationBrowser locationBrowser;

    public LocationDto showUserLocation(String username){
        Objects.requireNonNull(username, "Username cannot be null");

        return locationBrowser.searchForUserLocation(username);
    }
}
