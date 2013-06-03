package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.FurnitureCollection;

@RequestMapping("/collection/**")
@Controller
public class CollectionController extends BaseController {
	

	

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public String post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    	modelMap.put("furCollection", collectionRepository.findOne(id));
    	FurnitureCollection collection = collectionRepository.findOne(id);
    	return "collection/index";
    }

  /**  @RequestMapping
    public String index() {
        return "collection/index";
    } **/
}
