package com.slomek.CoupleMe.news.infrastructure.rest;


import com.slomek.CoupleMe.news.NewsFacade;
import com.slomek.CoupleMe.news.dto.NewsDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
class ShowNewsEndpoint {

    private final NewsFacade newsFacade;

    @GetMapping("/news/{country}")
    List<NewsDto> showNews(@PathVariable String country) {
        return newsFacade.showNews(country);
    }

}
