// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.katzan.spring.furniturefronttest.model;

import com.katzan.spring.furniturefronttest.model.ShopOrder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect ShopOrder_Roo_Jpa_Entity {
    
    declare @type: ShopOrder: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ShopOrder.id;
    
    @Version
    @Column(name = "version")
    private Integer ShopOrder.version;
    
    public Long ShopOrder.getId() {
        return this.id;
    }
    
    public void ShopOrder.setId(Long id) {
        this.id = id;
    }
    
    public Integer ShopOrder.getVersion() {
        return this.version;
    }
    
    public void ShopOrder.setVersion(Integer version) {
        this.version = version;
    }
    
}
