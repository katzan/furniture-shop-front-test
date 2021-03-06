package com.katzan.spring.furniturefronttest.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.ManyToOne;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class ShopOrderDetail implements Serializable {
	
    public ShopOrderDetail(FurnitureItem item, int quantity) {
        super();
        this.furnitureItem = item;
        this.quantity = quantity;
    }

	@ManyToOne(optional = false)
	private FurnitureItem furnitureItem;
	
    private Integer quantity;
    
    public Double getPrice() {
        if (this.furnitureItem != null) {
            return this.furnitureItem.getItemPrice()* this.quantity;
        }
        return Double.valueOf(0);
    }
}
