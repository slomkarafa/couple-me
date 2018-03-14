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

    public void saveUserLocation(String username, String longitude, String latitude) {
        Objects.requireNonNull(username, "Username cannot be null");
        Objects.requireNonNull(longitude, "Longitude cannot be null");
        Objects.requireNonNull(latitude, "Latitude cannot be null");

        locationBrowser.addUserLocation(new LocationDto(username, latitude, longitude));
    }
}
