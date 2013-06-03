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

import com.katzan.spring.furniturefronttest.model.AboutUs;
import com.katzan.spring.furniturefronttest.repository.AboutUsRepository;

@RequestMapping("/aboutus/**")
@Controller
public class AboutUsController extends BaseController {

  //  @RequestMapping(method = RequestMethod.POST, value = "{id}")
  //  public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
  //  }
	
	@Autowired
	AboutUsRepository aboutUsRepository;

    @RequestMapping(method=RequestMethod.GET)
    public String index(ModelMap modelMap) {
    	populateModel(modelMap);
    	List<AboutUs> aboutUs = aboutUsRepository.findAll();
    	modelMap.put("aboutUs", aboutUs);
        return "aboutus/index";
    }
}
