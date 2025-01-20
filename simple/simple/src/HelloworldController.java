import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController
{
    @GetMapping("/hello")
    {
        public String hellloworld()
        {
            return "Hello world Controller";
        }
    }
}