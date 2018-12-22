package components;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Saw implements Tool {
    boolean cut;

    public void fixIt() {
        System.out.println("strong cut");
    }
}
