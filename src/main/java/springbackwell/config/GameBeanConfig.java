package springbackwell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springbackwell.model.Attainment;
import springbackwell.model.Game;
import springbackwell.model.GameAdmin;
import springbackwell.model.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Configuration
@Import({AttainmentsBeanConfig.class, PlayersBeanConfig.class})
public class GameBeanConfig {
    @Bean
    public Game stalker (Player myh, Player lis, GameAdmin gameAdmin) {
        Game game = new Game(100,"STALKER");
        game.setGameAdmin(gameAdmin);
        Map<Player, Set<Attainment>> playerSetMap = new HashMap<>();
        playerSetMap.put(myh, myh.getAttainments());
        playerSetMap.put(lis, lis.getAttainments());
        playerSetMap.put(gameAdmin, gameAdmin.getAttainments());
        game.setPlayers(playerSetMap);
        return game;
    }
}
