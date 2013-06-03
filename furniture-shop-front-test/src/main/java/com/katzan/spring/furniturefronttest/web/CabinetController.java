package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/cabinet/**")
@Controller
public class CabinetController extends BaseController{

   // @RequestMapping(method = RequestMethod.POST, value = "{id}")
   // public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
  //  }

    @RequestMapping
    public String index(ModelMap modelMap) {
    	populateModel(modelMap);
        return "cabinet/index";
    }
}
