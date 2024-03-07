package com.fullstack.expensetracker.service;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.fullstack.expensetracker.model.Expense;

public interface ExpenseService {  //CRUD basics


    //Get Methods:
    Iterable<Expense> getAllExpense();
    Expense findById(Long id);

     //Post Methods:

    Expense addExpense(Expense expense);

    //Put Methods:
    Expense updatedExpense(Long id, Expense expense);

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
