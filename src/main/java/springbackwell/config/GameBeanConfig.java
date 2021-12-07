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
import springbackwell.qualifiers.AdminQualifier;
import springbackwell.qualifiers.CustomClassQualifier;
import springbackwell.qualifiers.CustomStringQualifier;
import springbackwell.qualifiers.LisQualifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Configuration
@Import({AttainmentsBeanConfig.class, PlayersBeanConfig.class})
@PropertySource({"classpath:game.properties"})
public class GameBeanConfig {
//    @Autowired
//    @LisQualifier
//    private Player player1;
//    @Autowired
//    @CustomStringQualifier(name = "ANT")
//    private Player player2;
//    @CustomClassQualifier(clazz = GameAdmin.class)
//    @Autowired
//    private Player player3;
//    @Autowired
//    @AdminQualifier
//    private GameAdmin gameAdmin;
//    @Bean
//    public Game stalker (@Value("${stalker.id}") int id, @Value("${stalker.name}") String name) {
//       return new Game(id, name, Map.of(player1, player1.getAttainments(), player2, player2.getAttainments(),
//               player3, player3.getAttainments()), gameAdmin);
//    }
}
