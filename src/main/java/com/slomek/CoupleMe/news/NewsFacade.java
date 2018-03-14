package com.slomek.CoupleMe.news;

import com.slomek.CoupleMe.news.dto.NewsDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class NewsFacade {

    private final NewsBrowser newsBrowserFromDB;
    private final NewsBrowser newsBrowserFromAPI;
    private final NewsSorter newsSorter;


    public List<NewsDto> showNews(String country) {
        Objects.requireNonNull(country, "Country cannot be null");

        List<NewsDto> news = newsBrowserFromAPI.searchForCountry(country);
        return newsSorter.getSorted(news);
    }

}
