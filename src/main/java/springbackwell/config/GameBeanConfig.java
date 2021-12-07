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
    // some problem with insert stalker.players.prop={myh:myh.attainments, "lis":lis.attainments, admin:admin.attainments}
    // from properties. In map "playerSetMap" bean myh/lis/admin insert like field name for object Players, but not like  object Player
    @Bean
    public Game stalker (@Value("#{${stalker.players.prop}}") Map <Player, Set<Attainment>> playerSetMap, GameAdmin gameAdmin, @Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
       return new Game(id, name, playerSetMap, gameAdmin);
    }
}
