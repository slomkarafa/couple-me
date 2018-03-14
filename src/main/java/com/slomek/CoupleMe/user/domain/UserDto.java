package com.slomek.CoupleMe.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class UserDto {

    private final String name;
    private final String surname;
    private final long id;
    private final String username;

}
