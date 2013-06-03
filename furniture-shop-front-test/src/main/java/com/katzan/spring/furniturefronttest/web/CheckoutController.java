package com.katzan.spring.furniturefronttest.web;

import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.katzan.spring.furniturefronttest.email.NotificationService;
import com.katzan.spring.furniturefronttest.email.NotificationServiceImpl;
import com.katzan.spring.furniturefronttest.model.Cart;
import com.katzan.spring.furniturefronttest.model.FurnitureItem;
import com.katzan.spring.furniturefronttest.model.ShopOrder;
import com.katzan.spring.furniturefronttest.model.ShopOrderDetail;
import com.katzan.spring.furniturefronttest.repository.ShopOrderRepository;
import com.katzan.spring.furniturefronttest.repository.UserAccountRepository;


@Controller
@SessionAttributes(types = { ShopOrder.class })
@RequestMapping("/cart/checkout")
public class CheckoutController {
	

    @Autowired
    private Cart cart;
    
    @Autowired
    private NotificationService notificationService;
    
    @Autowired
    private ShopOrderRepository shopOrderRepository;
    
    @Autowired
    private UserAccountRepository userAccountRepository;
    
    @ModelAttribute("countries")
    public Map<String, String> countries(Locale currentLocale) {
        Map<String, String> countries = new TreeMap<String, String>();
        for (Locale locale : Locale.getAvailableLocales()) {
            countries.put(locale.getCountry(), locale.getDisplayCountry(currentLocale));
        }
        return countries;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String show(HttpSession session, ModelMap model) {
    	System.out.println("Executing show order!!!");
        //Account account = (Account) session.getAttribute(LoginController.ACCOUNT_ATTRIBUTE);
        ShopOrder order = createOrder(this.cart);
        model.put("order", order);
        //model.addAttribute(order);
        return "checkout/index";
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "order")
    public String checkout(SessionStatus status, @Valid @ModelAttribute("order")  ShopOrder shopOrder, BindingResult errors) {
    	System.out.println("Executing save order!!!");
    	if (errors.hasErrors()) {
        	System.out.println("Order with errors!!!");
            return "checkout/index";
        } else {
        	userAccountRepository.save(shopOrder.getAccount());
            shopOrderRepository.save(shopOrder);
            status.setComplete(); //remove order from session
            this.cart.clear(); // clear the cart
            String orderString = shopOrder.getShopOrderMessageString();
            notificationService.sendMessage("kashkin.alex@gmail.com", orderString);
            return "redirect:/index.htm";
        }
    }
    
    private ShopOrder createOrder(Cart cart) {
        ShopOrder order = new ShopOrder();
        for (Entry<FurnitureItem, Integer> line : cart.getItems().entrySet()) {
            order.addOrderDetail(new ShopOrderDetail(line.getKey(), line.getValue()));
        }
        order.setOrderDate(new Date());
        return order;
    }
    
    @RequestMapping(method = RequestMethod.POST, params = "update")
    public String update(@ModelAttribute("order") ShopOrder shopOrder) {
        shopOrder.updateOrderDetails();
        return "checkout/index";
    }
    
    /**  @InitBinder
    public void initBinder(WebDataBinder binder) {
    	binder.setRequiredFields("account.emailAddress");
    	binder.validate();
    }

   @RequestMapping(method = RequestMethod.POST, value = "{id}")
    public void post(@PathVariable Long id, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) {
    }

    @RequestMapping
    public String index() {
        return "checkout/index";
    } **/
}
