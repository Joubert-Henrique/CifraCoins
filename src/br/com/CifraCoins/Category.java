package br.com.CifraCoins;

public class Category {
    private String name;
    private CategoryType type;

    public Category(String name, CategoryType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public CategoryType getType() {
        return type;
    }

}


