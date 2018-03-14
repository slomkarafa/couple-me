package com.slomek.CoupleMe.news;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class NewsConfiguration {

    @Bean
    NewsFacade newsFacade(@Qualifier("NEWSBROWSERDB") NewsBrowser newsBrowserAPI, NewsBrowser newsBrowserDB) {
        return new NewsFacade(newsBrowserDB, newsBrowserAPI, newsSorter());
    }

    NewsFacade newsFacade() {
        NewsBrowser newsBrowser = new InMemoryNewsBrowser();
        return new NewsFacade(newsBrowser, newsBrowser, newsSorter());
    }


    private NewsSorter newsSorter() {
        return new NewsSorter();
    }

}
