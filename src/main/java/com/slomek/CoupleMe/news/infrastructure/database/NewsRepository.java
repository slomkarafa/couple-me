package com.slomek.CoupleMe.news.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity, Long> {

}
