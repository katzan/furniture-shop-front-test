package com.katzan.spring.furniturefronttest.model;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class FurnitureNews {

    private String newsName;

    private String newsText;
    
    private String newsTitle;
}
