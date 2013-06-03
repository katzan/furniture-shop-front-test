package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.ServiceItem;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = ServiceItem.class)
public interface ServiceItemRepository {
}
