import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args)
    {
        List<Task> tasks=new ArrayList<>();
        Task newTask=new Task(1,"Buy Groceries");
        Task newTask1=new Task(2,"Buy Groceries 1");
        Task newTask2=new Task(3,"Buy Groceries 2");
        Task newTask3=new Task(4,"Buy Groceries 3");
        tasks.add(newTask);
        tasks.add(newTask1);
        tasks.add(newTask2);
        tasks.add(newTask3);
        FileUtil fu=new FileUtil();
        fu.saveTaskToFile(tasks);
        listTasks(tasks);
    }
    public static void listTasks(List<Task> tasks)
    {
        for(Task task:tasks)
        {
            System.out.println("ID: "+task.getId()+",DEscription: "+task.getDescription());
        }
    }
    public void addTask(Task task)
    {

    }
}