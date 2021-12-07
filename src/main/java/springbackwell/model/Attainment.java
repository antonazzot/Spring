package springbackwell.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode

public class Attainment {

    private int id;
    private String attainmentName;

}
