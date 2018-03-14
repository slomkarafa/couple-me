package com.slomek.CoupleMe.news.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class NewsDto {

    private final String title;
    private final String description;

}
