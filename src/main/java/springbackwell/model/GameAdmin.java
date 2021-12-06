package springbackwell.model;

import lombok.*;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString

public class GameAdmin extends Player{

    public GameAdmin(int id, String name, String login) {
        this.id=id;
        this.name=name;
        this.login=login;
    }

    private int id;
    private String name;
    private String login;
    private Set<Attainment> attainments;
    private Map <Integer, String> function;
}
