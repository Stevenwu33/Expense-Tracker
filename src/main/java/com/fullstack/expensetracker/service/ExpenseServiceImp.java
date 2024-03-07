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
    public Expense findById(Long id){
        if (expenseRepository.findById(id).isPresent()){
            return expenseRepository.findById(id).get();
        }
        return null;
    }
    @Override
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense updatedExpense(Long id, Expense expense) {

        Optional<Expense> optionalExpense = expenseRepository.findById(id);

        if(optionalExpense.isEmpty()){
            return null;
        }

        Expense updatedExpense = optionalExpense.get();
        updatedExpense.setExpenseName(expense.getExpenseName());
        updatedExpense.setExpenseType(expense.getExpenseType());
        updatedExpense.setAmount(expense.getAmount());
        expenseRepository.save(updatedExpense);
        return updatedExpense;
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
