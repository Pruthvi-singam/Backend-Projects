import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static Task findTaskById(List<Task> tasks,int id)
    {
        for(Task task:tasks)
        {
            if(task.getId()==id)
            {
                return task;
            }
        }
        return null;
    }
    private static void validateStatus(String status)
    {
        try
        {
            TaskStatus taskStatus=TaskStatus.fromString(status);
            System.out.println("Valid status"+taskStatus.getStatus());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void update(List<Task> tasks,Scanner input)
    {
        System.out.print("Enter the task ID to update: ");
        int id=input.nextInt();
        input.nextLine();
        Task updateTask=findTaskById(tasks,id);
        if(updateTask!=null)
        {   System.out.print("Enter new description: ");
            String description=input.nextLine();
            System.out.print("\nEnter new status (ToDo/InProgress/Done): ");
            String status=input.nextLine();

            updateTask.setDescription(description);
            updateTask.setStatus(status);
            System.out.println("Task updated successfully.");
        }
        else {
            System.out.println("Task not found.");
        }
    }
    public static void deleteTask(List<Task> tasks,Scanner input)
    {
        System.out.println(("enter the task ID to delete"));
        int id=input.nextInt();
        input.nextLine();
        Task  deletetask=findTaskById(tasks,id);
        if(deletetask!=null)
        {
            tasks.remove(deletetask);
            System.out.println("Task deleted successfully.");
        }
        else {
            System.out.println("Task not found.");
        }
    }
    public static void listTasks(List<Task> tasks)
    {
        for(Task task:tasks)
        {
            System.out.println("ID: "+task.getId()+",DEscription: "+task.getDescription()+",Status:"+task.getStatus());
        }
    }
    public static void main(String[] args)
    {
        int choice;
        Scanner input=new Scanner(System.in);
        List<Task> tasks=FileUtil.readTaskfile();

        do {
            System.out.println("\nTask Tracker CLI");
            System.out.println("----------------");
            System.out.println("1. List all tasks");
            System.out.println("2. Add a new task");
            System.out.println("3. Update a task");
            System.out.println("4. Delete a task");
            System.out.println("5. Search tasks by status");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {
                case 1->listTasks(tasks);
                case 2->System.out.println("comming soon");
                case 3->update(tasks,input);
                case 4->deleteTask(tasks,input);
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while(choice!=6);

            String status1 = "In_progress";
        String status2 = "Done";
        String status3 = "ToDo";

//        validateStatus(status1);
//        validateStatus(status2);
//        validateStatus(status3);
//
//        Task newTask=new Task(1,"something","In_progress");
//        Task newTask1=new Task(2,"Buy Groceries 1","In_progress");
//        Task newTask2=new Task(3,"Buy Groceries 2","Done");
//        Task newTask3=new Task(4,"Buy Groceries 3","ToDo");
//
//        tasks.add(newTask);
//        tasks.add(newTask1);
//        tasks.add(newTask2);
//        tasks.add(newTask3);

        FileUtil fu=new FileUtil();
//        fu.saveTaskToFile(tasks);
//        listTasks(tasks);
////        System.out.println();
////        update(tasks,1);
//        deleteTask(tasks,3);
////        fu.saveTaskToFile(tasks);
////        System.out.println();
//        listTasks(tasks);
    }


}