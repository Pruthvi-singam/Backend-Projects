import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class FileUtil {
private static final String File_name="task.json";

    public static void saveTaskToFile(List<Task> tasks)
    {
        try(FileWriter fw=new FileWriter("task.json"))
        {
            fw.write(tasks.toString());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void  readTaskfile(List<Task> tasks)
    {
        try(FileReader fd=new FileReader("task.json"))
        {
        }
        catch(Exception e)
        {

        }
    }


}
