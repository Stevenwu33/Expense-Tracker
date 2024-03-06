package com.fullstack.expensetracker.service;

import com.fullstack.expensetracker.model.Expense;

public interface ExpenseService {  //CRUD basics

    Iterable<Expense> getAllExpense();  //Get
    void saveExpense(Expense expense);  //Post and PUT

    //put:
    void findById(Long id);

    //Delete:

    Expense deleteExpense(Long id);


    //naming these methods should be clear, so it can be used in the controller class
    //methods to include for implementation:

    //calculate budget to total income (get total)
    //calculate total expense category to compare to budget (get)
    //delete entry(delete)
    //update budget (put)
    //add entries(post)
    //user authentication


}
