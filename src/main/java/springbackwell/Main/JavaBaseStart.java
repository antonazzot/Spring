package springbackwell.Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springbackwell.config.GameBeanConfig;
import springbackwell.config.PlayersBeanConfig;
import springbackwell.model.Game;
import springbackwell.model.Player;

public class JavaBaseStart {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(GameBeanConfig.class);
        Game stalker = ctx.getBean("stalker", Game.class);
        System.out.println(stalker);
    }
}
