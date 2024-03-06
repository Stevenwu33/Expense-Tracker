package com.fullstack.expensetracker.repository;

import com.fullstack.expensetracker.model.Expense;
import com.fullstack.expensetracker.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income,Long> {
}
