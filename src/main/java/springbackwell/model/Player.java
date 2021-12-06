package springbackwell.model;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Builder

public class Player {

    private int id;
    private String name;
    private String login;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Attainment> attainments;

    public Player(String name) {
        this.name = name;
    }

    public Player(int id, String name, String login) {
        this.id = id;
        this.name = name;
        this.login = login;
    }

    public void initPlayer () {
        System.out.println("Player:" + this.getName() +" " + this.getLogin() + " was connected");
    }

    public void destroyPlayer () {
        initPlayer();
        System.out.println("Player destroy");
    }
}
