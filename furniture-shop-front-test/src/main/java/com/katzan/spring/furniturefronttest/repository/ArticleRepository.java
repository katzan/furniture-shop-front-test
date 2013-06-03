package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.Article;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Article.class)
public interface ArticleRepository {
}
