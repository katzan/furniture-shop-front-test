package com.katzan.spring.furniturefronttest.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.Cart;
import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.repository.FurnitureItemRepository;

//@RequestMapping("/cart/**")
@Controller
public class CartController {
	
   @Autowired
   private Cart cart;
    
    @Autowired
    private FurnitureItemRepository furnitureItemRepository;

  /**  @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    } **/
	
	

   @RequestMapping("/cart/show/details")
    public String index(ModelMap model) {
    	model.put("cart", cart);
        return "cart/index";
    }
    
    @RequestMapping("/cart/add/{itemId}")
    public String addToCart(@PathVariable("itemId") long itemId, @RequestHeader("referer") String referer, ModelMap model) {
        FurnitureItem item = furnitureItemRepository.findOne(itemId);
        System.out.println("Adding item to the Cart!!!");
        Boolean added = new Boolean(true);
        this.cart.addItem(item);
        model.put("added", added);
        return "redirect:" + referer;
    }
}
