import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
private static final String File_name="task.json";

    public static void saveTaskToFile(List<Task> tasks)
    {   Gson gson=new Gson();
        try(FileWriter fw=new FileWriter("task.json"))
        {
            gson.toJson(tasks,fw);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static List<Task> readTaskfile()
    {
        Gson gson=new Gson();
        try(FileReader fd=new FileReader("task.json"))
        {
            Type taskListType=new TypeToken<List<Task>>(){}.getType();
            return gson.fromJson(fd,taskListType);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }


}
