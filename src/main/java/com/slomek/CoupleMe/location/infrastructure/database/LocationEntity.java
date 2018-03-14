package com.slomek.CoupleMe.location.infrastructure.database;

import com.slomek.CoupleMe.location.domain.LocationDto;
import com.slomek.CoupleMe.user.domain.Location;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
class LocationEntity {

    @Id private long id;
    private final String username;
    private final String latitude;
    private final String longitude;

    LocationDto dto() {
        return LocationDto.builder()
                .username(username)
                .longitude(longitude)
                .latitude(latitude)
                .build();
    }
}
