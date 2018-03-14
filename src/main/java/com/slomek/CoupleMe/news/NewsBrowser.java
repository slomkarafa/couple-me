package com.slomek.CoupleMe.news;


import com.slomek.CoupleMe.news.dto.NewsDto;

import java.util.List;

public interface NewsBrowser {

    List<NewsDto> searchForCountry(String country);

}
