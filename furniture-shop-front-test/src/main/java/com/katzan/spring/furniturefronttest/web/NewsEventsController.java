package com.katzan.spring.furniturefronttest.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.FurnitureNews;
import com.katzan.spring.furniturefronttest.repository.FurnitureNewsRepository;

@RequestMapping("/newsevents/**")
@Controller
public class NewsEventsController extends BaseController{

  //  @RequestMapping(method = RequestMethod.POST, value = "{id}")
  //  public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
  //  }
	
	@Autowired
	FurnitureNewsRepository furnitureNewsRepository;

    @RequestMapping
    public String index(ModelMap modelMap) {
    	populateModel(modelMap);
    	List<FurnitureNews> news = furnitureNewsRepository.findAll();
    	modelMap.put("news", news);
    	System.out.println("Index of news events invoked");
        return "newsevents/index";
    }
}
