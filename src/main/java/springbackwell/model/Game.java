package springbackwell.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int id;
    private String name;

    private Map <Player, Set<Attainment>> players;
    private Player gameAdmin;

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
