package com.fullstack.expensetracker.service;

import com.fullstack.expensetracker.model.Expense;
import com.fullstack.expensetracker.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpenseServiceImp implements ExpenseService {
    public final ExpenseRepository expenseRepository;
    public ExpenseServiceImp(final ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Iterable<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }

    @Override
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    @Override
    public void findById(Long id) {         //add more code, if id is not present return null
        expenseRepository.findById(id);
    }

    @Override
    public Expense deleteExpense(Long id) { //add more code, if id is not present return null
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isEmpty()){
            return null;
        }

        Expense expenseToDelete = optionalExpense.get();
        expenseRepository.delete(expenseToDelete);
        return expenseToDelete;
    }
}
