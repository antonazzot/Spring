package springbackwell.config;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    @Qualifier("lis")
    private Player player;
    @Autowired
    @Qualifier("myh")
    private Player player1;
    @Autowired
    @Qualifier("admin")
    private Player player2;
    @Autowired
    private GameAdmin admin;
    @Bean
    public Game stalker (@Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
       return new Game(id, name, Map.of(player, player.getAttainments(), player1, player1.getAttainments(), player2, player2.getAttainments()), admin);
    }
}
