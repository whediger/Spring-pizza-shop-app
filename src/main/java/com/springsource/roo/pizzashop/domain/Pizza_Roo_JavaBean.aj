// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.pizzashop.domain;

import com.springsource.roo.pizzashop.domain.Base;
import com.springsource.roo.pizzashop.domain.Pizza;
import com.springsource.roo.pizzashop.domain.PizzaOrder;
import com.springsource.roo.pizzashop.domain.Topping;
import java.util.Set;

privileged aspect Pizza_Roo_JavaBean {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Pizza.getName() {
        return this.name;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param name
     */
    public void Pizza.setName(String name) {
        this.name = name;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Float
     */
    public Float Pizza.getPrice() {
        return this.price;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param price
     */
    public void Pizza.setPrice(Float price) {
        this.price = price;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Topping> Pizza.getToppings() {
        return this.toppings;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param toppings
     */
    public void Pizza.setToppings(Set<Topping> toppings) {
        this.toppings = toppings;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Base
     */
    public Base Pizza.getBase() {
        return this.base;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param base
     */
    public void Pizza.setBase(Base base) {
        this.base = base;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PizzaOrder
     */
    public PizzaOrder Pizza.getPizzaOrder() {
        return this.pizzaOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pizzaOrder
     */
    public void Pizza.setPizzaOrder(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }
    
}
