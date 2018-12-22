import components.Hummer;
import components.Saw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("components")
public class Generator {

//    @Autowired
//    Saw tool;

//    @Bean
//    public Worker worker1(Saw tool) {
//        Worker worker = new Worker();
//
//        worker.setId(1);
//        worker.setName("name");
//        worker.setTool(tool);
//
//        return worker;
//    }

//    @Autowired
//    @Qualifier("hummerx")
//    Hummer hummer;

    @Bean
    public Worker worker1() {
        Worker worker = new Worker();

        worker.setId(1);
        worker.setName("name");
        worker.setTool(hummerx());

        return worker;
    }


    @Bean
    public Hummer hummerx() {
        return new Hummer(900);
    }
}
