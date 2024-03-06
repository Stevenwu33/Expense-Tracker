package com.fullstack.expensetracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Income {
    @Id
    @GeneratedValue
    private Long id;
    private String source ;
    private double amount;
    private Date date;

    public Income(Long id, String source, double amount, Date date) {
        this.id = id;
        this.source = source;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", source='" + source + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
