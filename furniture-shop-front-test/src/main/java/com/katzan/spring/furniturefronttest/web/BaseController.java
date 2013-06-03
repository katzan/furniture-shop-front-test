package com.katzan.spring.furniturefronttest.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import antlr.collections.List;

import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureCollectionRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import com.katzan.spring.furniturefronttest.repository.ImageFileRepository;

public class BaseController {
	   @Autowired
	   FurnitureCategoryRepository categoryRepository;
	   
	   @Autowired
	   FurnitureCollectionRepository collectionRepository;
	   
	   @Autowired
	   FurnitureItemRepository itemRepository;
	   
	   @Autowired
	   ImageFileRepository imageRepository;
	   
	   public void populateModel(ModelMap modelMap) {
	      //java.util.List<FurnitureCategory> categories = categoryRepository.findAll();
	      
		  //modelMap.put("categories", categories);
		  //java.util.List<FurnitureItem> items = itemRepository.findItemsForFirstPage();
		  //modelMap.put("items", items);  
	   }

}
