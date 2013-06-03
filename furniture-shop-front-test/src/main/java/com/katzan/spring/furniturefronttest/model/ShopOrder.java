package com.katzan.spring.furniturefronttest.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.CascadeType;
import javax.validation.Valid;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.entity.RooJpaEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaEntity
public class ShopOrder {
	
	public ShopOrder() {
		this.orderDate = new Date();
	}
	
    @Embedded
    private Address shippingAddress;
    
    private boolean billingSameAsShipping = true;
    
    @ManyToOne
    @Valid
    private UserAccount account;
    
    private Date orderDate;
    private Date deliveryDate;
    private String comments;

    private Double totalOrderPrice;
    
    @JoinColumn(name = "order_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<ShopOrderDetail> orderDetails = new ArrayList<ShopOrderDetail>();
    
    public void addOrderDetail(ShopOrderDetail detail) {
        if (this.orderDetails.add(detail)) {
            if (this.totalOrderPrice == null) {
                this.totalOrderPrice = detail.getPrice();
            } else {
                this.totalOrderPrice = this.totalOrderPrice + detail.getPrice();
            }
        }
    }
    
    /**
     * Update the order details and update the total price. If the quantity is 0 or less the order detail is removed from the list.
     */
    public void updateOrderDetails() {
        Double total = new Double(0);
        Iterator<ShopOrderDetail> details = this.orderDetails.iterator();
        while (details.hasNext()) {
            ShopOrderDetail detail = details.next();
            if (detail.getQuantity() <= 0) {
                details.remove();
            } else {
                total = total + detail.getPrice();

            }
        }
        //total.setScale(2, RoundingMode.HALF_UP);
        this.totalOrderPrice = total;
    }
    
    public String getShopOrderMessageString() {
    	StringBuffer orderString = new StringBuffer();
    	orderString.append("Дата заказа: "+ this.orderDate +"\r\n");
    	orderString.append("Сведения о клиенте: \r\n");
    	orderString.append("Имя клиента: "+ this.account.getFirstName() +"\r\n" );
    	orderString.append("Фамилия клиента: "+ this.account.getLastName() +"\r\n" );
    	orderString.append("Электронный адрес: "+ this.account.getEmailAddress()+"\r\n");
    	orderString.append("Телефон: "+ this.account.getPhoneNumber()+"\r\n" );
    	orderString.append("Комментарии: "+ this.comments+"\r\n" );
    	orderString.append("\r\n");
    	orderString.append("Адрес доставки: \r\n");
    	orderString.append("Город: "+ this.shippingAddress.getCity()+"\r\n" );
    	orderString.append("Улица: "+this.shippingAddress.getStreet()+"\r\n" );
    	orderString.append("Номер дома: "+ this.shippingAddress.getHouseNumber()+"\r\n" );
    	orderString.append("Квартира(Офис): "+ this.shippingAddress.getBoxNumber()+"\r\n" );
    	orderString.append("Почтовый индекс: "+ this.shippingAddress.getPostalCode()+"\r\n" );
    	orderString.append("\r\n");
    	orderString.append("Заказ: \r\n");
    	int i=0;
    	for(ShopOrderDetail detail: this.orderDetails ) {
    		orderString.append(++i + ". "+detail.getFurnitureItem().getItemName() +
    		"- "+ detail.getQuantity()+"шт. -по "+detail.getFurnitureItem().getItemPrice()
    		+ "руб/ед. -"+ detail.getPrice()+"руб.\r\n");
    	}
    	orderString.append("\r\n");
    	orderString.append("Всего: "+this.totalOrderPrice + "руб.\r\n");
    	return orderString.toString();
    	
    }
}
