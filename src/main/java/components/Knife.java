package components;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Knife implements Tool {
    int lng;



    public void fixIt() {
        System.out.println("Cut-cut");
    }
}
