package com.slomek.CoupleMe.news.infrastructure.database;


import com.slomek.CoupleMe.news.dto.NewsDto;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Entity
class NewsEntity {
    @Id private long id;
    private String name;
    private String username;

    NewsDto dto() {
       return NewsDto.builder()
               .description(name)
               .title(username)
               .build();
    }

}
