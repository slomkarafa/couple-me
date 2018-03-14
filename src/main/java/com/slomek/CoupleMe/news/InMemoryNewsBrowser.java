package com.slomek.CoupleMe.news;

import com.slomek.CoupleMe.news.dto.NewsDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class InMemoryNewsBrowser implements NewsBrowser {

    private static final Map<String, List<NewsDto>> map = new HashMap<>();

    static {
        map.put("Poland", Arrays.asList(new NewsDto("Title", "Description"), new NewsDto("Tytul2", "Description 2")));
    }

    @Override
    public List<NewsDto> searchForCountry(String country) {
        return map.get(country);
    }

}
