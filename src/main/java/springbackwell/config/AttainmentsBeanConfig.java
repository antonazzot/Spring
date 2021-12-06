package springbackwell.config;

import org.springframework.context.annotation.Bean;
import springbackwell.model.Attainment;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class AttainmentsBeanConfig {
    @Bean
    public Attainment lord () {
        Attainment attainment = new Attainment(1, "Lord");
        return attainment;
    }
    @Bean
    public Attainment killer () {
        Attainment attainment = new Attainment(2, "Killer");
        return attainment;
    }
    @Bean
    public Attainment thunderer () {
        Attainment attainment = new Attainment(1, "Thunderer");
        return attainment;
    }
    @Bean
    public Attainment medic () {
        Attainment attainment = new Attainment(1, "Medic");
        return attainment;
    }


 }
