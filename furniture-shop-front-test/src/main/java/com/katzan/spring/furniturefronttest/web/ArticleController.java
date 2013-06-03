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

import com.katzan.spring.furniturefronttest.model.Article;
import com.katzan.spring.furniturefronttest.repository.ArticleRepository;

@RequestMapping("/article/**")
@Controller
public class ArticleController extends BaseController {
	
	@Autowired
    ArticleRepository articleRepository;

  /**  @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    } **/

    @RequestMapping(method=RequestMethod.GET)
    public String index(ModelMap modelMap) {
    	populateModel(modelMap);
    	List<Article> articles = articleRepository.findAll();
    	modelMap.put("articles", articles);
        return "article/index"; 
    }
}
