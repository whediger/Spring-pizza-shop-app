package com.springsource.roo.pizzashop.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * = Topping
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Topping {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(min = 2)
    private String name;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Pizza pizza;
}
