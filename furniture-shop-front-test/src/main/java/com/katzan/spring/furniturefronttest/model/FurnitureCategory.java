package com.katzan.spring.furniturefronttest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.Size;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;



@RooJavaBean
@RooToString
@RooJpaEntity
public class FurnitureCategory implements Serializable {

    @Size(max=200)
	private String categoryName;

    @Size(max=1000)
    private String categoryDescription;
    
    @Size(max=1000)
    private String metaDescription;

    @Size(max=200)
    private String metaTitle;

    @Size(max=200)
    private String metaKeywords;
    
   // @ManyToMany(fetch=FetchType.EAGER)
   // private Set<Big>bigs;
    
   @ManyToMany(fetch=FetchType.EAGER)
   private Set<ImageFile>imageFiles;
    
   @ManyToMany(mappedBy="furnitureCategories")
   private Set<FurnitureCollection>furnitureCollections;
    
   @ManyToMany(mappedBy="furnitureCategories")
   @OrderBy("listNumber ASC")
   private Set<FurnitureItem>furnitureItems;
   
   private String smallImageFile;
   private String largeImageFile;
}
