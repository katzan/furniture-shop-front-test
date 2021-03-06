// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.katzan.spring.furniturefronttest.model;

import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.model.FurnitureItemDataOnDemand;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

privileged aspect FurnitureItemDataOnDemand_Roo_DataOnDemand {
    
    declare @type: FurnitureItemDataOnDemand: @Component;
    
    private Random FurnitureItemDataOnDemand.rnd = new SecureRandom();
    
    private List<FurnitureItem> FurnitureItemDataOnDemand.data;
    
    @Autowired
    FurnitureItemRepository FurnitureItemDataOnDemand.furnitureItemRepository;
    
    public FurnitureItem FurnitureItemDataOnDemand.getNewTransientFurnitureItem(int index) {
        FurnitureItem obj = new FurnitureItem();
        setCodeNumber(obj, index);
        setDimensions(obj, index);
        setInStock(obj, index);
        setItemDescription(obj, index);
        setItemName(obj, index);
        setItemPrice(obj, index);
        setLargeImageFile(obj, index);
        setLargeImageSize(obj, index);
        setListNumber(obj, index);
        setMaterials(obj, index);
        setMetaDescription(obj, index);
        setMetaKeywords(obj, index);
        setMetaTitle(obj, index);
        setShowOnFirstPage(obj, index);
        setSmallImageFile(obj, index);
        setSmallImageSize(obj, index);
        return obj;
    }
    
    public void FurnitureItemDataOnDemand.setCodeNumber(FurnitureItem obj, int index) {
        String codeNumber = "codeNumber_" + index;
        obj.setCodeNumber(codeNumber);
    }
    
    public void FurnitureItemDataOnDemand.setDimensions(FurnitureItem obj, int index) {
        String dimensions = "dimensions_" + index;
        obj.setDimensions(dimensions);
    }
    
    public void FurnitureItemDataOnDemand.setInStock(FurnitureItem obj, int index) {
        Boolean inStock = Boolean.TRUE;
        obj.setInStock(inStock);
    }
    
    public void FurnitureItemDataOnDemand.setItemDescription(FurnitureItem obj, int index) {
        String itemDescription = "itemDescription_" + index;
        obj.setItemDescription(itemDescription);
    }
    
    public void FurnitureItemDataOnDemand.setItemName(FurnitureItem obj, int index) {
        String itemName = "itemName_" + index;
        obj.setItemName(itemName);
    }
    
    public void FurnitureItemDataOnDemand.setItemPrice(FurnitureItem obj, int index) {
        double itemPrice = new Integer(index).doubleValue();
        obj.setItemPrice(itemPrice);
    }
    
    public void FurnitureItemDataOnDemand.setLargeImageFile(FurnitureItem obj, int index) {
        String largeImageFile = "largeImageFile_" + index;
        obj.setLargeImageFile(largeImageFile);
    }
    
    public void FurnitureItemDataOnDemand.setLargeImageSize(FurnitureItem obj, int index) {
        Long largeImageSize = new Integer(index).longValue();
        obj.setLargeImageSize(largeImageSize);
    }
    
    public void FurnitureItemDataOnDemand.setListNumber(FurnitureItem obj, int index) {
        int listNumber = index;
        obj.setListNumber(listNumber);
    }
    
    public void FurnitureItemDataOnDemand.setMaterials(FurnitureItem obj, int index) {
        String materials = "materials_" + index;
        obj.setMaterials(materials);
    }
    
    public void FurnitureItemDataOnDemand.setMetaDescription(FurnitureItem obj, int index) {
        String metaDescription = "metaDescription_" + index;
        obj.setMetaDescription(metaDescription);
    }
    
    public void FurnitureItemDataOnDemand.setMetaKeywords(FurnitureItem obj, int index) {
        String metaKeywords = "metaKeywords_" + index;
        obj.setMetaKeywords(metaKeywords);
    }
    
    public void FurnitureItemDataOnDemand.setMetaTitle(FurnitureItem obj, int index) {
        String metaTitle = "metaTitle_" + index;
        obj.setMetaTitle(metaTitle);
    }
    
    public void FurnitureItemDataOnDemand.setShowOnFirstPage(FurnitureItem obj, int index) {
        Boolean showOnFirstPage = Boolean.TRUE;
        obj.setShowOnFirstPage(showOnFirstPage);
    }
    
    public void FurnitureItemDataOnDemand.setSmallImageFile(FurnitureItem obj, int index) {
        String smallImageFile = "smallImageFile_" + index;
        obj.setSmallImageFile(smallImageFile);
    }
    
    public void FurnitureItemDataOnDemand.setSmallImageSize(FurnitureItem obj, int index) {
        Long smallImageSize = new Integer(index).longValue();
        obj.setSmallImageSize(smallImageSize);
    }
    
    public FurnitureItem FurnitureItemDataOnDemand.getSpecificFurnitureItem(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        FurnitureItem obj = data.get(index);
        Long id = obj.getId();
        return furnitureItemRepository.findOne(id);
    }
    
    public FurnitureItem FurnitureItemDataOnDemand.getRandomFurnitureItem() {
        init();
        FurnitureItem obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return furnitureItemRepository.findOne(id);
    }
    
    public boolean FurnitureItemDataOnDemand.modifyFurnitureItem(FurnitureItem obj) {
        return false;
    }
    
    public void FurnitureItemDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = furnitureItemRepository.findAll(new org.springframework.data.domain.PageRequest(from / to, to)).getContent();
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'FurnitureItem' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<FurnitureItem>();
        for (int i = 0; i < 10; i++) {
            FurnitureItem obj = getNewTransientFurnitureItem(i);
            try {
                furnitureItemRepository.save(obj);
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            furnitureItemRepository.flush();
            data.add(obj);
        }
    }
    
}
