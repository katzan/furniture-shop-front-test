package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.ShopOrder;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = ShopOrder.class)
public interface ShopOrderRepository {
}
