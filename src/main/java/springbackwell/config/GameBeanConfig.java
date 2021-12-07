package springbackwell.config;

import org.springframework.beans.factory.annotation.Qualifier;
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
    public Game stalker (@Qualifier("lis") Player player,@Qualifier ("myh") Player player1, @Qualifier ("admin") Player player2,  GameAdmin player3, @Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
       return new Game(id, name, Map.of(player, player.getAttainments(), player1, player1.getAttainments(), player2, player2.getAttainments()), player3);
    }
}
