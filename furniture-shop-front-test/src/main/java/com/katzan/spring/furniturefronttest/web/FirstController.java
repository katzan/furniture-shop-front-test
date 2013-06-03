package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;

import antlr.collections.List;

import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureCategoryRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureCollectionRepository;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;
import com.katzan.spring.furniturefronttest.repository.ImageFileRepository;
//import com.katzan.spring.furniturefronttest.model.FurnitureCategory;
import com.katzan.spring.furniturefronttest.service.FrontService;


//import org.hibernate.annotations.Sort;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/*")
@Controller
@RooWebScaffold(path = "frontservices", formBackingObject = FrontService.class)
public class FirstController extends BaseController {
	
 
	
	@RequestMapping(value={"/","index.htm","index.html"},method=RequestMethod.GET)
	public String getFrontPage(HttpServletRequest request, ModelMap modelMap) {

		populateModel(modelMap);
		modelMap.put("page_title", "Интернет-магазин по оптовой продаже мебели в Москве.");
		Sort sort = new Sort(Sort.Direction.ASC,"listNumber");
		//Sort sort = new Sort()
		java.util.List<FurnitureItem> items = itemRepository.findItemsForFirstPage(sort);
		modelMap.put("firstItems", items);
		
		
		return "index";
	}
}
 