package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = FurnitureCategory.class)
public interface FurnitureCategoryRepository {
}
