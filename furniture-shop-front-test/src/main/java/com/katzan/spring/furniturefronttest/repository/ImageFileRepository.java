package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.ImageFile;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = ImageFile.class)
public interface ImageFileRepository {
}
