package com.slomek.CoupleMe.location.infrastructure.database;

import com.slomek.CoupleMe.location.domain.LocationBrowser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LocationDBConfig {

    @Bean
    LocationBrowser locationBrowser(LocationRepository locationRepository) {
        return new DBClient(locationRepository);
    }
}
