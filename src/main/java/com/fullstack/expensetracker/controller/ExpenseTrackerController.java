package com.fullstack.expensetracker.controller;

import com.fullstack.expensetracker.model.Expense;
import com.fullstack.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("expense")
public class ExpenseTrackerController {

    @Autowired
    public final ExpenseService expenseService; //instantiate object

    public ExpenseTrackerController(ExpenseService expenseService) { //allows you to access methods.
        this.expenseService = expenseService;
    }

    @GetMapping
    public Iterable<Expense> getAllExpense(){
        return expenseService.getAllExpense();
    }

    @DeleteMapping("expense/{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable("id") Long id){  //use to respond to a request
       Expense deletedExpense = expenseService.deleteExpense(id);     //is this code too long and need to be shorter?
        if (deletedExpense != null){
            return ResponseEntity.ok("Expense Deleted!");
        }
        else {
            return ResponseEntity.notFound().build(); // Return 404 if expense not found
        }
    }



    @GetMapping
    public String testMethod(){
        return "Test";
    }
}
