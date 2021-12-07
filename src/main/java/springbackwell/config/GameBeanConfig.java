package springbackwell.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
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
    private Player lis;
    @Autowired
    private Player myh;
    @Autowired
    private Player admin;
    private GameAdmin gameAdmin;
    @Bean
    public Game stalker (@Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
       return new Game(id, name, Map.of(lis, lis.getAttainments(), myh, myh.getAttainments(), admin, admin.getAttainments()), gameAdmin);
    }
}
