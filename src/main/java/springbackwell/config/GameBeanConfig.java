package springbackwell.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import springbackwell.model.Attainment;
import springbackwell.model.Game;
import springbackwell.model.GameAdmin;
import springbackwell.model.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Configuration
@Import({AttainmentsBeanConfig.class, PlayersBeanConfig.class})
@PropertySource({"classpath:game.properties"})
public class GameBeanConfig {
    @Bean
    public Game stalker (Player myh, Player lis, GameAdmin gameAdmin, @Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
       return new Game(id, name,Map.of(myh, myh.getAttainments(), lis, lis.getAttainments()), gameAdmin);
    }
}
