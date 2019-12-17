package com.recipe.recipespringapp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by nichaurasia on Monday, December/09/2019 at 11:19 PM
 */

@Entity
@Getter
@Setter
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
