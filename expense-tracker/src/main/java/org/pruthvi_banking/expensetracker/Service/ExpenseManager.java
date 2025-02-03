package org.pruthvi_banking.expensetracker.Service;

import org.pruthvi_banking.expensetracker.Entity.Expense;
import org.pruthvi_banking.expensetracker.Repository.ExpenseRepository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ExpenseManager {
    private ExpenseRepository expenseRepository;
    private int expenseCount=1;

    public ExpenseManager(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    public void addExpense(String description, Double amount,String category) {
        Expense expense = new Expense(expenseCount++,description, LocalDate.now(), amount, category);
        expenseRepository.add(expense);
        System.out.println("Expense added successfully (ID: "+expense.getId()+")");
    }
    public void deleteExpense(int id) {
        expenseRepository.deleteExpenses(id);
        System.out.println("Expense deleted successfully");
    }
    public void listExpenses() {
        List<Expense> expense=expenseRepository.getAllExpenses();
        System.out.println("ID Date        Description   Amount   Category");
        for(Expense e:expense) {
            System.out.println(e.getId()+" "+e.getExpenseDate()+"  "+e.getDescription()+"        "+e.getAmount()+"      "+e.getCategory());
        }
    }
    public void summary()
    {
        Double total=expenseRepository.getAllExpenses().stream().mapToDouble(Expense::getAmount).sum();
        System.out.println("Total expenses: $" + total);
    }
    public void summaryByMonth(int month)
    {
        Double total=expenseRepository.getAllExpenses().stream().filter(expense -> expense.getExpenseDate().getMonthValue()==month)
                .mapToDouble(Expense::getAmount).sum();
        System.out.println("Total expenses for monthly: $" + total);
    }

}
