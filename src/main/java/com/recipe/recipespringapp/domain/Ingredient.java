package com.recipe.recipespringapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by nichaurasia on Monday, December/09/2019 at 11:53 PM
 */

public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    private Recipe recepie;
    //private UnitOfMeasure uom
}
