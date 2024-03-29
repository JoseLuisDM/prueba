package com.hampcode.articlesapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.hampcode.articlesapp.model.Article;

@Repository
public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {
//JPA Hereda de CRUD ->  PagingAndSorting Hereda de JPA
	Page<Article> findAll(Pageable pageable);
}
