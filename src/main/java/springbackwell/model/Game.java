package springbackwell.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
    @Qualifier ("admin")
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
