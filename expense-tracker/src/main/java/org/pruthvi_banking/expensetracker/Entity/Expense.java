package org.pruthvi_banking.expensetracker.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Expense {
    private int id;
    private String description;
    private LocalDate expenseDate;
    private Double amount;
    private String category;

    public Expense(int id, String description, LocalDate expenseDate, Double amount, String category) {
        this.id = id;
        this.description = description;
        this.expenseDate = expenseDate;
        this.amount = amount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
