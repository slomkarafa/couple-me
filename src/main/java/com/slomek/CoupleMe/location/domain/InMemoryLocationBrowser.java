package com.slomek.CoupleMe.location.domain;

import java.util.*;

class InMemoryLocationBrowser implements LocationBrowser {

    private static Map<String, LocationDto> map = new HashMap<>();

//    static {
//        map.put("TestKristi", LocationDto.builder()
//                .latitude("100")
//                .longitude("200")
//                .username("TestKristi")
//                .build());
//    }
    @Override
    public LocationDto searchForUserLocation(String username) {
        LocationDto loc = map.get(username);
        return loc != null ? loc : new LocationDto(null,null,null);
    }

    @Override
    public void addUserLocation(LocationDto locationDto) {
        map.put(locationDto.getUsername(), locationDto);
    }
}
