package com.example.foodrecipee;

public class Recipe {
    private String title;
    private String description;
    private String ingredients;
    private String instructions;

    public Recipe(String title, String description, String ingredients, String instructions) {
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getIngredients() { return ingredients; }
    public String getInstructions() { return instructions; }
}
