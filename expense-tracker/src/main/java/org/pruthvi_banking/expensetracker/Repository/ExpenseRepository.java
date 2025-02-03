package org.pruthvi_banking.expensetracker.Repository;


import org.pruthvi_banking.expensetracker.Entity.Expense;

import java.util.*;

public class ExpenseRepository {

    private List<Expense> expenses=new ArrayList<>();

    public void add(Expense expense)
    {
        expenses.add(expense);
        saveExpenses();
    }
    public void deleteExpenses(int id)
    {
        expenses.removeIf(expense->expense.getId()==id);
        saveExpenses();
    }
    public List<Expense> getAllExpenses()
    {
        return expenses;
    }
    public void saveExpenses()
    {

    }

}
