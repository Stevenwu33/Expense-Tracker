package com.fullstack.expensetracker.repository;

import com.fullstack.expensetracker.model.Expense;
import com.fullstack.expensetracker.model.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory,Long> {
}
