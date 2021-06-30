package com.example.tacocloud.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {

    @Id
    @GeneratedValue
    private Long id;

    private Date createdAt;

    @NotBlank(message = "Must fill out name")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @Size(min = 2, message = "You must have at least 2 ingredients to make a taco.")
    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}
