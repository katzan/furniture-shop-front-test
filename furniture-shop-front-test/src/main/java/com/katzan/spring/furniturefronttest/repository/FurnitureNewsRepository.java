package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.FurnitureNews;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = FurnitureNews.class)
public interface FurnitureNewsRepository {
}
