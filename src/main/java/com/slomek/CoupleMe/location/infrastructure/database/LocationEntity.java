package com.slomek.CoupleMe.location.infrastructure.database;

import com.slomek.CoupleMe.location.domain.LocationDto;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
class LocationEntity {

    @Id
    @GeneratedValue
    private long id;
    private final String username;
    private final String latitude;
    private final String longitude;

//    public LocationEntity(String username, String latitude, String longitude) {
//        this.username = username;
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }
    LocationEntity(){
        this.username = null;
        this.latitude = null;
        this.longitude =null;
    }


    LocationDto dto() {
        return LocationDto.builder()
                .username(username)
                .longitude(longitude)
                .latitude(latitude)
                .build();
    }

}
