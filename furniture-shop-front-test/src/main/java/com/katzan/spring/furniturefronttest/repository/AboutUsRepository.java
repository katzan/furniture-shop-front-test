package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.AboutUs;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = AboutUs.class)
public interface AboutUsRepository {
}
