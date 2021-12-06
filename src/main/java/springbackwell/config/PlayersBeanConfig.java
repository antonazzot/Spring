package springbackwell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springbackwell.model.Attainment;
import springbackwell.model.GameAdmin;
import springbackwell.model.Player;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Import(AttainmentsBeanConfig.class)
public class PlayersBeanConfig {
    @Bean
    public Player myh (AttainmentsBeanConfig lord, AttainmentsBeanConfig meedic) {
        Player player = new Player(1, "Anton", "Myh_l");
        Set <Attainment> attainments = Set.of(lord.lord(), meedic.medic());
        player.setAttainments(attainments);
        return player;
    }
    @Bean
    public Player lis (AttainmentsBeanConfig thunderer, AttainmentsBeanConfig killer) {
        Player player = new Player(2, "Sergey", "Lis");
        Set <Attainment> attainments = Set.of(thunderer.thunderer(), killer.killer());
        player.setAttainments(attainments);
        return player;
    }
    @Bean
    public GameAdmin admin (AttainmentsBeanConfig lord, AttainmentsBeanConfig medic, AttainmentsBeanConfig thunderer) {
        GameAdmin player = new GameAdmin(10, "Victor", "Dark_Angel");
        player.setAttainments(Set.of(lord.lord(), medic.medic(), thunderer.thunderer()));
        player.setFunction(Map.of(1,"Ban", 2, "Rastart"));
        return player;
    }
}
