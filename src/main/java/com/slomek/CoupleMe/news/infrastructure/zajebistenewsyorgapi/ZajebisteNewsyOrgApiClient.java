package com.slomek.CoupleMe.news.infrastructure.zajebistenewsyorgapi;

import com.slomek.CoupleMe.news.NewsBrowser;
import com.slomek.CoupleMe.news.dto.NewsDto;

import java.util.List;

public class ZajebisteNewsyOrgApiClient implements NewsBrowser {

    @Override
    public List<NewsDto> searchForCountry(String country) {
        return null;
    }
}
