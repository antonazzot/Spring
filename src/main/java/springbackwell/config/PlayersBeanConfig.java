package springbackwell.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import springbackwell.model.Attainment;
import springbackwell.model.GameAdmin;
import springbackwell.model.Player;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Import(AttainmentsBeanConfig.class)
@PropertySource({"classpath:admin.function.properties", "classpath:players.properties"})
public class PlayersBeanConfig {

    @Value("#{${admin.functions}}")
    private Map <Integer, String > adminFunction;

    @Bean
    public Player myh (@Qualifier("myhAttainment") Set <Attainment> myhAttainment, @Value("${myh.id}") int id, @Value("${myh.name}") String name, @Value("${myh.login}") String login) {
        return new Player(id, name, login, myhAttainment);
    }
    @Bean
    public Player lis (@Qualifier("lisAttainment")Set <Attainment> lisAttainment, @Value("${lis.id}") int id, @Value("${lis.name}") String name, @Value("${lis.login}") String login) {
        return new Player(id, name, login, lisAttainment);
    }
    @Bean
    public GameAdmin admin (@Qualifier("adminAttainment")Set <Attainment> adminAttainment,@Value("${admin.id}") int id, @Value("${admin.name}") String name, @Value("${admin.login}") String login) {
        return new GameAdmin(id, name, login, adminAttainment, adminFunction);
    }
}
