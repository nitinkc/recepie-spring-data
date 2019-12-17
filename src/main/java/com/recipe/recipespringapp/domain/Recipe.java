package com.recipe.recipespringapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by nichaurasia on Monday, December/09/2019 at 11:19 PM
 */

@Getter
@Setter
@Entity
public class Recipe {

    //Adding the ID for the Database
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    //TODO
    //private Difficulty difficulty;

    @Lob
    private Byte[] image;

    // Notes is owned by each recepie
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

}
