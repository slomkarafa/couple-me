package com.slomek.CoupleMe.location.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class LocationDto {

    private final String username;
    private final String latitude;
    private final String longitude;

}
