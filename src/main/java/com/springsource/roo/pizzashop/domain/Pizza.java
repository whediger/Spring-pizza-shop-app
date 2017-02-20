package com.springsource.roo.pizzashop.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;

/**
 * = Pizza
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class Pizza {

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
    private Float price;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "pizza")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Topping> toppings = new HashSet<Topping>();

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToOne(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "pizza")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Base base;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private PizzaOrder pizzaOrder;
}