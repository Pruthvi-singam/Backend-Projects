package org.pruthvi_banking.expensetracker.Controller;

import org.pruthvi_banking.expensetracker.Entity.Expense;
import org.pruthvi_banking.expensetracker.Service.ExpenseManager;

import java.util.Scanner;

public class CommandHandler {
    private ExpenseManager manager;
    private Scanner scanner=new Scanner(System.in);

    public CommandHandler(ExpenseManager manager) {
        this.manager = manager;
    }

    public void run()

    {
            while(true)
            {
                System.out.println("Enter command:");
                String command=scanner.nextLine();
                String[] args=command.split(" ");
                switch(args[0])
                {
                    case "add":
                        if(args.length<3)
                        {
                            System.out.println("Usage: add <description> <amount> [category]");
                            continue;
                        }
                        String description=args[1];
                        Double amount=Double.parseDouble(args[2]);
                        String Category=args.length>3 ? args[3]:"General";
                        manager.addExpense(description,amount,Category);
                        break;
                    case "delete":
                        if(args.length<2)
                        {
                            System.out.println("Usage: delete <Id>");
                            continue;
                        }
                        int id=Integer.parseInt(args[1]);
                        manager.deleteExpense(id);
                        break;
                    case "list":
                        manager.listExpenses();
                        break;
                    case "summary":
                        if(args.length==2)
                        {
                            int month=Integer.parseInt(args[1]);
                            manager.summaryByMonth(month);
                        }else {
                            manager.summary();
                        }
                        break;

                        default:
                            System.out.println("Unknown command");
                }

            }
    }
}
