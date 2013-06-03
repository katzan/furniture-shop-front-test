// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.katzan.spring.furniturefronttest.model;

import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import com.katzan.spring.furniturefronttest.model.FurnitureCategoryDataOnDemand;
import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect FurnitureCategoryDataOnDemand_Roo_DataOnDemand {
    
    declare @type: FurnitureCategoryDataOnDemand: @Component;
    
    private Random FurnitureCategoryDataOnDemand.rnd = new SecureRandom();
    
    private List<FurnitureCategory> FurnitureCategoryDataOnDemand.data;
    
    @Autowired
    FurnitureCategoryRepository FurnitureCategoryDataOnDemand.furnitureCategoryRepository;
    
    public FurnitureCategory FurnitureCategoryDataOnDemand.getNewTransientFurnitureCategory(int index) {
        FurnitureCategory obj = new FurnitureCategory();
        setCategoryDescription(obj, index);
        setCategoryName(obj, index);
        setMetaDescription(obj, index);
        setMetaKeywords(obj, index);
        setMetaTitle(obj, index);
        return obj;
    }
    
    public void FurnitureCategoryDataOnDemand.setCategoryDescription(FurnitureCategory obj, int index) {
        String categoryDescription = "categoryDescription_" + index;
        if (categoryDescription.length() > 1000) {
            categoryDescription = categoryDescription.substring(0, 1000);
        }
        obj.setCategoryDescription(categoryDescription);
    }
    
    public void FurnitureCategoryDataOnDemand.setCategoryName(FurnitureCategory obj, int index) {
        String categoryName = "categoryName_" + index;
        if (categoryName.length() > 200) {
            categoryName = categoryName.substring(0, 200);
        }
        obj.setCategoryName(categoryName);
    }
    
    public void FurnitureCategoryDataOnDemand.setMetaDescription(FurnitureCategory obj, int index) {
        String metaDescription = "metaDescription_" + index;
        if (metaDescription.length() > 1000) {
            metaDescription = metaDescription.substring(0, 1000);
        }
        obj.setMetaDescription(metaDescription);
    }
    
    public void FurnitureCategoryDataOnDemand.setMetaKeywords(FurnitureCategory obj, int index) {
        String metaKeywords = "metaKeywords_" + index;
        if (metaKeywords.length() > 200) {
            metaKeywords = metaKeywords.substring(0, 200);
        }
        obj.setMetaKeywords(metaKeywords);
    }
    
    public void FurnitureCategoryDataOnDemand.setMetaTitle(FurnitureCategory obj, int index) {
        String metaTitle = "metaTitle_" + index;
        if (metaTitle.length() > 200) {
            metaTitle = metaTitle.substring(0, 200);
        }
        obj.setMetaTitle(metaTitle);
    }
    
    public FurnitureCategory FurnitureCategoryDataOnDemand.getSpecificFurnitureCategory(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        FurnitureCategory obj = data.get(index);
        Long id = obj.getId();
        return furnitureCategoryRepository.findOne(id);
    }
    
    public FurnitureCategory FurnitureCategoryDataOnDemand.getRandomFurnitureCategory() {
        init();
        FurnitureCategory obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return furnitureCategoryRepository.findOne(id);
    }
    
    public boolean FurnitureCategoryDataOnDemand.modifyFurnitureCategory(FurnitureCategory obj) {
        return false;
    }
    
    public void FurnitureCategoryDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = furnitureCategoryRepository.findAll(new org.springframework.data.domain.PageRequest(from / to, to)).getContent();
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'FurnitureCategory' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<FurnitureCategory>();
        for (int i = 0; i < 10; i++) {
            FurnitureCategory obj = getNewTransientFurnitureCategory(i);
            try {
                furnitureCategoryRepository.save(obj);
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            furnitureCategoryRepository.flush();
            data.add(obj);
        }
    }
    
}
