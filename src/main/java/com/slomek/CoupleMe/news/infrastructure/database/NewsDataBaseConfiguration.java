package com.slomek.CoupleMe.news.infrastructure.database;


import com.slomek.CoupleMe.news.NewsBrowser;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class NewsDataBaseConfiguration {



    @Qualifier("NEWSBROWSERDB")
    @Bean
    NewsBrowser newsBrowser(NewsRepository newsRepository) {
        return new DBClient(newsRepository);
    }

}
