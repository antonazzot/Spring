package springbackwell.start;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbackwell.model.Game;

public class StartInXML {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Game game = ctx.getBean(Game.class);
        System.out.println(game);
    }
}
