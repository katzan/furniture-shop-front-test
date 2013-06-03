package com.katzan.spring.furniturefronttest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;



@RooJavaBean
@RooToString
@RooJpaEntity
public class FurnitureItem implements Serializable {

    private String itemName;

    private String itemDescription;
    
    private String codeNumber;
    private String dimensions;
    private String materials;

    private String metaDescription;

    private String metaTitle;

    private String metaKeywords;

    private double itemPrice;

    private Boolean inStock;
    private Boolean showOnFirstPage;
    private int listNumber;
    
    //Small image block
    private String smallImageFile; // added
    private long smallImageSize; //added 
    
    //Large image block
    private String largeImageFile; // added
    private long largeImageSize; //added 
    
   // @ManyToMany(fetch=FetchType.EAGER)
   // private Set<Big>bigs;
    
    @ManyToMany(fetch=FetchType.EAGER)
    private Set<ImageFile>imageFiles;
    
    
    @ManyToMany(fetch=FetchType.EAGER)
    private Set<FurnitureCategory>furnitureCategories;
    
    @ManyToMany(fetch=FetchType.EAGER)
    private Set<FurnitureCollection>furnitureCollections;
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        FurnitureItem other = (FurnitureItem) object;

        return new EqualsBuilder().append(this.getId(), other.getId()).isEquals();
    }
  
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(getId()).append(getItemName()).toHashCode();
    }
    
    
}
