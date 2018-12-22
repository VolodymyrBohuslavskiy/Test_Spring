import components.Tool;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Component
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Worker {
    int id;
    String name;
    Tool tool;

    public void doSome(Tool tool){
        tool.fixIt();
    }
}
