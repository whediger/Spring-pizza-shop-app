// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.pizzashop.domain;

import com.springsource.roo.pizzashop.domain.Pizza;
import com.springsource.roo.pizzashop.domain.Topping;

privileged aspect Topping_Roo_JavaBean {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Topping.getName() {
        return this.name;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param name
     */
    public void Topping.setName(String name) {
        this.name = name;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Pizza
     */
    public Pizza Topping.getPizza() {
        return this.pizza;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pizza
     */
    public void Topping.setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
}