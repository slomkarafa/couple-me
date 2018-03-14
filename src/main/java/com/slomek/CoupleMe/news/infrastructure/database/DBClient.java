package com.slomek.CoupleMe.news.infrastructure.database;

import com.slomek.CoupleMe.news.NewsBrowser;
import com.slomek.CoupleMe.news.dto.NewsDto;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
class DBClient implements NewsBrowser {

    private final NewsRepository newsRepository;

    @Override
    public List<NewsDto> searchForCountry(String country) {
        return newsRepository.findAll().stream().map(NewsEntity::dto).collect(Collectors.toList());
    }

}
