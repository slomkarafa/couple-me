package com.slomek.CoupleMe.location.domain;

import java.util.*;

public class InMemoryLocationBrowser implements LocationBrowser {

    private static final Map<String, LocationDto> map = new HashMap<>();

    static {
        map.put("TestKristi", LocationDto.builder()
                .latitude("100")
                .longitude("200")
                .username("TestKristi")
                .build());
    }
    @Override
    public LocationDto searchForUserLocation(String username) {
        LocationDto loc = map.get(username);
        return loc != null ? loc : new LocationDto(null,null,null);
    }
}
