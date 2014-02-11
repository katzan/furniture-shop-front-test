package com.katzan.spring.furniturefronttest.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;

@RequestMapping("/catalogue/**")
@Controller
public class CatalogueController extends BaseController {

    @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index(ModelMap model) {
     List<FurnitureItem> furnitureItems= itemRepository.findAll();
     model.put("furnitureItems", furnitureItems);
        return "catalogue/index";
    }
}
