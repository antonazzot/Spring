package springbackwell.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@PropertySource({"classpath:admin.function.properties", "classpath:players.properties"})
@Component
public class GameAdmin extends Player{

    public GameAdmin(int id, String name, String login) {
        this.id=id;
        this.name=name;
        this.login=login;
    }
    @Value("${admin.id}")
    private int id;
    @Value("${admin.name}")
    private String name;
    @Value("${admin.login}")
    private String login;
    @ToString.Exclude
//    @Value("#{${admin.attainment}}")
    private Set<Attainment> attainments;
    @Value("#{${admin.functions}}")
    private Map <Integer, String> function;
    @PostConstruct
    public void startAdmin() {
        System.out.println("Admin:" + this.name + " login: " +this.getLogin() + "  start");
    }

    @PreDestroy
    public void finishAdmin() {
        System.out.println("Admin:" + this.name + " login: " +this.getLogin() + "  finish") ;
    }
}
