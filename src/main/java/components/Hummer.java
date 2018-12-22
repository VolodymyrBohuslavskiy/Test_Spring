package components;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
public class Hummer implements Tool {
    int wh;


    public void fixIt() {
        System.out.println("Tuc-tuck");
    }
}
