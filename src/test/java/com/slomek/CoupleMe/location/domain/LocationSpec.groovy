package com.slomek.CoupleMe.location.domain

import spock.lang.Specification

class LocationSpec extends Specification {


    LocationFacade locationFacade

    def setup() {
        locationFacade = new LocationConfig().locationFacade()
        locationFacade.saveUserLocation("TestKristi", "200", "100")
    }

    def "'showUserLocation' method should return not null location which contains longitude and latitude for correct username"() {

        given: "Client want to get location of TestKristi"
        def username = "TestKristi"

        when: "Client perform 'getUserLocation' method for above params"
        def locationDto = locationFacade.showUserLocation(username)

        then: "Base should have starting values"
        locationDto != null
        locationDto.username == "TestKristi"
        locationDto.latitude == "100"
        locationDto.longitude == "200"
    }

    def "'showUserLocation' method should return not null location which doesn't contain longitude and latitude for incorrect username"() {

        given: "Client want to get location of TestKristi"
        def username = "wrongUsername"

        when: "Client perform 'getUserLocation' method for above params"
        def locationDto = locationFacade.showUserLocation(username)

        then: "Base should have starting values"
        locationDto != null
        locationDto.username == null
        locationDto.latitude == null
        locationDto.longitude == null
    }


}
