package springbackwell.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import springbackwell.qualifiers.AdminQualifier;
import springbackwell.qualifiers.LisQualifier;

import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
@PropertySource({"classpath:game.properties"})
public class Game {
//    @Value("${stalker.id}")
    private int id;
//    @Value("${stalker.name}")
    private String name;

    private Map <Player, Set<Attainment>> players;
//    @Autowired
//    @LisQualifier
    private Player admin;

    public Game(int id, String name, Map<Player, Set<Attainment>> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public Game(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
