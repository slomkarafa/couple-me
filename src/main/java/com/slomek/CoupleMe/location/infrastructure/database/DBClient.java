package com.slomek.CoupleMe.location.infrastructure.database;

import com.slomek.CoupleMe.location.domain.LocationBrowser;
import com.slomek.CoupleMe.location.domain.LocationDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DBClient implements LocationBrowser{

    private final LocationRepository locationRepository;

    @Override
    public LocationDto searchForUserLocation(String username) {
        return locationRepository.findAll().stream().map(LocationEntity::dto)
        .filter(x -> username.equals(x.getUsername())).findFirst()
                .orElse(new LocationDto(null,null,null));
    }
}
