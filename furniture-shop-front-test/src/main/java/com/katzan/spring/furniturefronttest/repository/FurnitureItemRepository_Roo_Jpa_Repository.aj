// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.katzan.spring.furniturefronttest.repository;

import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect FurnitureItemRepository_Roo_Jpa_Repository {
    
    declare parents: FurnitureItemRepository extends JpaRepository<FurnitureItem, Long>;
    
    declare parents: FurnitureItemRepository extends JpaSpecificationExecutor<FurnitureItem>;
    
    declare @type: FurnitureItemRepository: @Repository;
    
}