import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static void searchTasksByStatus(List<Task> tasks, Scanner scanner) {
        System.out.print("Enter status to search (ToDo/InProgress/Done): ");
        String status = scanner.nextLine();

        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                filteredTasks.add(task);
            }
        }

        if (filteredTasks.isEmpty()) {
            System.out.println("No tasks found with status: " + status);
        } else {
            System.out.println("Tasks with status '" + status + "':");
            for (Task task : filteredTasks) {
                System.out.println(task);
            }
        }
    }
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
    private static void addTask(List<Task> tasks,Scanner input)
    {
        System.out.println("Enter task Description: ");
        String description=input.nextLine();
        System.out.println("Enter task status (ToDo/InProgress/Done): ");
        String status=input.nextLine();
        int id=tasks.size()+1;
        tasks.add(new Task(id,description,status));
        System.out.println("Task added successfully.");
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
                case 2->addTask(tasks,input);
                case 3->update(tasks,input);
                case 4->deleteTask(tasks,input);
                case 5->searchTasksByStatus(tasks,input);
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while(choice!=6);


//
    }


}