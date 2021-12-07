package springbackwell.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import springbackwell.model.Attainment;
import springbackwell.model.GameAdmin;
import springbackwell.model.Player;
import springbackwell.qualifiers.AdminQualifier;
import springbackwell.qualifiers.CustomClassQualifier;
import springbackwell.qualifiers.CustomStringQualifier;
import springbackwell.qualifiers.LisQualifier;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@Import(AttainmentsBeanConfig.class)
@PropertySource({"classpath:admin.function.properties", "classpath:players.properties"})

public class PlayersBeanConfig {

    @Value("#{${admin.functions}}")
    private Map <Integer, String > adminFunction;
    @CustomStringQualifier(name = "ANT")
    @Bean
    public Player myh (@Value("#{${myh.attainment}}") Set <Attainment> myhAttainment, @Value("${myh.id}") int id, @Value("${myh.name}") String name, @Value("${myh.login}") String login) {
        return new Player(id, name, login, myhAttainment);
    }
    @AdminQualifier
    @LisQualifier
    @Bean
    public Player lis (@Value("#{${lis.attainment}}")Set <Attainment> lisAttainment, @Value("${lis.id}") int id, @Value("${lis.name}") String name, @Value("${lis.login}") String login) {
        return new Player(id, name, login, lisAttainment);
    }
    @CustomClassQualifier(clazz = GameAdmin.class)
    @Bean ("Victor")
    public GameAdmin admin (@Value("#{${admin.attainment}}")Set <Attainment> adminAttainment,@Value("${admin.id}") int id, @Value("${admin.name}") String name, @Value("${admin.login}") String login) {
        return new GameAdmin(id, name, login, adminAttainment, adminFunction);
    }
}
