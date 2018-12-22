import components.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(Worker.class, Hummer.class, Knife.class, Rule.class, Saw.class,Generator.class);

        context.refresh();

        Worker worker = context.getBean("worker",Worker.class);
        worker.setId(1);
        worker.setName("Neo");

        Hummer hummer = context.getBean(Hummer.class);
        hummer.setWh(200);

        Knife knife = context.getBean(Knife.class);
        knife.setLng(100);

        Rule rule = context.getBean(Rule.class);
        rule.setModel("Model-1");

        Saw saw = context.getBean(Saw.class);
        saw.setCut(true);


        ArrayList<Tool> tools = new ArrayList<Tool>();
        tools.add(hummer);
        tools.add(knife);
        tools.add(rule);
        tools.add(saw);


        for (Tool tool : tools) {
            worker.setTool(tool);
            System.out.print(worker.getName() + " " + worker.getTool()+" ");
            tool.fixIt();
        }


        Object worker1 = context.getBean("worker1",Worker.class);
        System.out.println(worker1);
    }
}
