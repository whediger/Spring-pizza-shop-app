package com.springsource.roo.pizzashop.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

/**
 * = PizzaOrder
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
public class PizzaOrder {

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
    @Size(max = 30)
    private String address;

    /**
     * TODO Auto-generated field documentation
     *
     */
    private Float total;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date deliveryDate;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "pizzaOrder")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Pizza> pizzas = new HashSet<Pizza>();
}
