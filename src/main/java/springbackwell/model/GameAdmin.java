package springbackwell.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Component
public class GameAdmin extends Player{

    public GameAdmin(int id, String name, String login) {
        this.id=id;
        this.name=name;
        this.login=login;
    }

    private int id;
    private String name;
    private String login;
    @ToString.Exclude
    private Set<Attainment> attainments;
    private Map <Integer, String> function;
}
