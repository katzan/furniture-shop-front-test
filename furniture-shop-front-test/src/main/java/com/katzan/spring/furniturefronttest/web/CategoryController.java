package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureCollectionRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import com.katzan.spring.furniturefronttest.repository.ImageFileRepository;

@RequestMapping("/category/**")
@Controller
public class CategoryController extends BaseController {



  @RequestMapping(method = RequestMethod.GET, value = "{id}")
  public String index(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    populateModel(modelMap);
	FurnitureCategory furnitureCategory = categoryRepository.findOne(id);
	String page_title=furnitureCategory.getMetaTitle();
	modelMap.put("page_title", page_title);
    modelMap.put("furnitureCategory", furnitureCategory);
    return "category/index";
  }

  //  @RequestMapping
  //  public String index() {
  //      return "category/index";
  //  }
}
