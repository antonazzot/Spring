package springbackwell.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import springbackwell.qualifier.AdminQualifier;
import springbackwell.qualifier.CustomClassQualifiers;
import springbackwell.qualifier.CustomStringQualifier;
import springbackwell.qualifier.GameAdminQualifier;

import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int id;
    private String name;

    private Map <Player, Set<Attainment>> players;
    @Autowired
//    @AdminQualifier
    @CustomStringQualifier(name = "Serg")
    @CustomClassQualifiers(clazz = Player.class)
    private Player gameAdmin;
//      private Player myh;

    public Game(int id, String name, Map<Player, Set<Attainment>> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public Game(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void initGame () {
        System.out.println("Game: " + this.getName() + "was started");
    }

    public void destroyGame () {
        System.out.println("Game: " + this.getName() + "was destroy");
    }
 }
