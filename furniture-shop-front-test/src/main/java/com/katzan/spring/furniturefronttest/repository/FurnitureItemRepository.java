package com.katzan.spring.furniturefronttest.repository;

import antlr.collections.List;

import com.katzan.spring.furniturefronttest.model.FurnitureItem;

import org.hibernate.annotations.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.springframework.transaction.annotation.Transactional;

@RooJpaRepository(domainType = FurnitureItem.class)
public interface FurnitureItemRepository {
	
	@Query("select distinct i from FurnitureItem as i where i.showOnFirstPage=true")
	@Transactional(readOnly=true)
	java.util.List<FurnitureItem> findItemsForFirstPage();
	
	@Query("select distinct i from FurnitureItem as i where i.showOnFirstPage=true")
	@Transactional(readOnly=true)
	java.util.List<FurnitureItem> findItemsForFirstPage(org.springframework.data.domain.Sort sort);
}
