package com.example.tacocloud;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {
    @NotBlank(message = "Must fill out name")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;
    @Size(min = 2, message = "You must have at least 2 ingredients to make a taco.")
    private List<String> ingredients;
}