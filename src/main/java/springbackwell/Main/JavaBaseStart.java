package springbackwell.Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import springbackwell.config.GameBeanConfig;
import springbackwell.config.PlayersBeanConfig;
import springbackwell.model.Game;
import springbackwell.model.Player;

public class JavaBaseStart {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("springbackwell");
        Game stalker = ctx.getBean("game", Game.class);
        System.out.println(stalker);
        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello'");
        String massege = exp.getValue(String.class);
        System.out.println(massege);
    }
}
