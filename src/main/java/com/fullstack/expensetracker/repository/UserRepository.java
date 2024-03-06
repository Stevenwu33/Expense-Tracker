package com.fullstack.expensetracker.repository;

import com.fullstack.expensetracker.model.Expense;
import com.fullstack.expensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
