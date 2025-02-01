package org.pruthvi_banking.expensetracker;

import org.pruthvi_banking.expensetracker.Controller.CommandHandler;
import org.pruthvi_banking.expensetracker.Entity.Expense;
import org.pruthvi_banking.expensetracker.Repository.ExpenseRepository;
import org.pruthvi_banking.expensetracker.Service.ExpenseManager;

public class ExpenseTrackerApplication {

    public static void main(String[] args) {
        ExpenseRepository expenseRepository = new ExpenseRepository();
        ExpenseManager expenseManager = new ExpenseManager(expenseRepository);
        CommandHandler commandHandler = new CommandHandler(expenseManager);
        commandHandler.run();
    }

}
