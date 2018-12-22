package components;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Rule implements Tool {
    String model;
    public void fixIt() {
        System.out.println("Size-size");
    }
}
