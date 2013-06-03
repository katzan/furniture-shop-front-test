package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.Contact;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = Contact.class)
public interface ContactRepository {
}
