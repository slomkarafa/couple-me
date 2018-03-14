package com.slomek.CoupleMe.location.infrastructure.database;

import com.slomek.CoupleMe.location.domain.LocationBrowser;
import com.slomek.CoupleMe.location.domain.LocationDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
class DBClient implements LocationBrowser {

    private final LocationRepository locationRepository;

    @Override
    public LocationDto searchForUserLocation(String username) {
        return locationRepository.findAll().stream().map(LocationEntity::dto)
                .filter(x -> username.equals(x.getUsername())).findFirst()
                .orElse(new LocationDto(null, null, null));
    }

    @Override
    public void addUserLocation(LocationDto locationDto) {
        List<LocationEntity> list = locationRepository.findAll();
        for(LocationEntity t : list){
            locationRepository.delete(t);
        }
        locationRepository.save(LocationEntity.builder()
                .username(locationDto.getUsername())
                .latitude(locationDto.getLatitude())
                .longitude(locationDto.getLongitude())
                .build());
    }
}
