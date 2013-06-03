package com.katzan.spring.furniturefronttest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;

public class CommonDataInterceptor implements WebRequestInterceptor,
		WebBindingInitializer {
	
	@Autowired
	FurnitureItemRepository furnitureItemRepository;
	
	@Autowired
	FurnitureCategoryRepository furnitureCategoryRepository;

	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// TODO Auto-generated method stub

	}

	@Override
	public void preHandle(WebRequest request) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		model.put("categories", furnitureCategoryRepository.findAll());
		boolean added = true;
		//model.put("added", added);
		System.out.println("My interceptor invoked!");
        
	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
