package com.katzan.spring.furniturefronttest.model;

import java.awt.ItemSelectable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;

import antlr.collections.List;



public class Cart implements Serializable {
	
	
    private Map<FurnitureItem, Integer> items = new HashMap<FurnitureItem, Integer>();
    
    
     

    public Map<FurnitureItem, Integer> getItems() {
        return Collections.unmodifiableMap(this.items);
    }

    public void addItem(FurnitureItem item) {
        if (this.items.containsKey(item)) {
            int quantity = this.items.get(item);
            quantity++;
            this.items.put(item, quantity);
        } else {
            this.items.put(item, 1);
        }
    }

    public void removeItem(FurnitureItem item) {
        this.items.remove(item);
    }

    public void clear() {
        this.items.clear();
    }

    @Override
    public String toString() {
        //ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE);
        //builder.append("items", this.items.keySet());
        //return builder.build();
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    } 
  /** private java.util.List<String> items = new ArrayList<String>();
   
   public java.util.List<String> getItems() {
       return this.items;
   }
   
   public void addItem(String item) {
       items.add(item);
   }
   
   public void removeItem(String item) {
       this.items.remove(item);
   }
   
   public void clear() {
       this.items.clear();
   } **/

}
