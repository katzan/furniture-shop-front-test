package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.FurnitureCollection;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = FurnitureCollection.class)
public interface FurnitureCollectionRepository {
}
