package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.UserAccount;
import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

@RooJpaRepository(domainType = UserAccount.class)
public interface UserAccountRepository {
}
