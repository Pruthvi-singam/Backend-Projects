import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
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
    public static void update(List<Task> tasks,int id)
    {

        for(Task tas:tasks) {
            if (tas.getId() == 1) {
                tas.setDescription("this is  new changed Description 2");

            }

        }
    }
    public static void deleteTask(List<Task> tasks,int id)
    {
        tasks.removeIf(task-> {
            if(task.getId()==id)
            {
                return true;
            }
            return false;
        });

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
        List<Task> tasks=FileUtil.readTaskfile();

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
        listTasks(tasks);
//        System.out.println();
//        update(tasks,1);
        deleteTask(tasks,3);
//        fu.saveTaskToFile(tasks);
//        System.out.println();
        listTasks(tasks);
    }


}