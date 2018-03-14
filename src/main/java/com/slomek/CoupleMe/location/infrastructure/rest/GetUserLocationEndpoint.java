package com.slomek.CoupleMe.location.infrastructure.rest;

import com.slomek.CoupleMe.location.domain.LocationDto;
import com.slomek.CoupleMe.location.domain.LocationFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
class GetUserLocationEndpoint {

    private final LocationFacade locationFacade;

    @GetMapping(value = "/location/{username}")
    LocationDto getUserLocation(@PathVariable String username) {
        return locationFacade.showUserLocation(username);
    }
}
