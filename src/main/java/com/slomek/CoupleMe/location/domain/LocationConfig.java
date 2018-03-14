package com.slomek.CoupleMe.location.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LocationConfig {

    @Bean
    LocationFacade locationFacade(LocationBrowser locationBrowser){
        return new LocationFacade(locationBrowser);
    }

    LocationFacade locationFacade(){
        LocationBrowser locationBrowser = new InMemoryLocationBrowser();
        return new LocationFacade(locationBrowser);
    }
}
