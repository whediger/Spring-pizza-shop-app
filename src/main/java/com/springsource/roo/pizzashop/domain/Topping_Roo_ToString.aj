// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.pizzashop.domain;

import com.springsource.roo.pizzashop.domain.Topping;

privileged aspect Topping_Roo_ToString {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String Topping.toString() {
        return "Topping {" + 
                "id='" + id + '\'' + 
                ", version='" + version + '\'' + "}" + super.toString();
    }
    
}
