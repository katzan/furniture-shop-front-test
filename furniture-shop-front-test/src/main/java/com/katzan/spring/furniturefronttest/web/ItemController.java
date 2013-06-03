package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureCollectionRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import com.katzan.spring.furniturefronttest.repository.ImageFileRepository;

@RequestMapping("/item/**")
@Controller
public class ItemController extends BaseController {
	


    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public String post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
      populateModel(modelMap);
      FurnitureItem furnitureItem = itemRepository.findOne(id);
      String page_title = furnitureItem.getMetaTitle();
      modelMap.put("page_title",page_title);
      modelMap.put("furnitureItem", furnitureItem);
      return "item/index";
    }

   /** @RequestMapping
    public String index() {
        return "item/index";
    } **/
}
