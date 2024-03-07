package com.fullstack.expensetracker.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_expenses")
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String expenseName ;
    @Enumerated
    private BudgetType budgetType ;
    private double amount;

    public Expense(Long id, String expenseName, BudgetType expenseType, double amount) {
        this.id = id;
        this.expenseName = expenseName;
        this.budgetType = expenseType;
        this.amount = amount;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpenseName() {
        return expenseName;
    }

    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public BudgetType getExpenseType() {
        return budgetType;
    }

    public void setExpenseType(BudgetType expenseType) {
        this.budgetType = expenseType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expenseName='" + expenseName + '\'' +
                ", expenseType=" + budgetType +
                ", amount=" + amount +
                '}';
    }
}
