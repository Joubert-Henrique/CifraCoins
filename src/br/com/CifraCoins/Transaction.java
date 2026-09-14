package br.com.CifraCoins;

import java.time.LocalDate;

public class Transaction {
    public double getValue() {
        return value;
    }

    public Category getCategory() {
        return category;
    }

    private double value;
    private String description;
    private LocalDate date;
    private Category category;

    public Transaction(double value, String description, LocalDate date, Category category) {
        this.value = value;
        this.description = description;
        this.date = date;
        this.category = category;
    }
}
