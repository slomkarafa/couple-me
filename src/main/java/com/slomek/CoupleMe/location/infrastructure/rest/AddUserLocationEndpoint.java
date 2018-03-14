package com.slomek.CoupleMe.location.infrastructure.rest;

import com.slomek.CoupleMe.location.domain.LocationFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class AddUserLocationEndpoint {

    LocationFacade locationFacade;

    @PutMapping(value = "/location/{username}/{latitude}/{longitude}")
    void addUserLocation(
            @PathVariable String username,
            @PathVariable String latitude,
            @PathVariable String longitude
    ) {
        locationFacade.saveUserLocation(username,latitude,longitude);
    }
}
