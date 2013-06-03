package com.katzan.spring.furniturefronttest.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.web.multipart.commons.CommonsMultipartFile;



@RooJavaBean
@RooToString
@RooJpaEntity
public class FurnitureCollection implements Serializable {

    private String collectionName;

    private String collectionDescription;

    private String metaDescription;

    private String metaTitle;

    private String metaKeywords;

    private double collectionPrice;

    private Boolean inStock;
    
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
    
    @ManyToMany(mappedBy="furnitureCollections")
    private Set<FurnitureItem>furnitureItems;
    
    public boolean belongsToCategory(String categoryName) {
    	boolean belongs=false;
    	for (FurnitureCategory category:furnitureCategories) {
			if (category.getCategoryName().equalsIgnoreCase(categoryName)) {
				belongs=true;
			}
		}
    	return belongs;
    }
}
