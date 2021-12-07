package springbackwell.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import springbackwell.model.Attainment;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
@PropertySource({"classpath:attainments.properties"})
public class AttainmentsBeanConfig {
    @Bean
    public Attainment lord (@Value("${lord.id}")  int id, @Value("${lord.name}")  String lordNam) {
        return new Attainment(id, lordNam);
    }
    @Bean
    public Attainment killer (@Value("${killer.id}")  int id, @Value("${killer.name}")  String name) {
        return new Attainment(id, name);
    }
    @Bean
    public Attainment thunderer (@Value("${thunderer.id}")  int id, @Value("${thunderer.name}")  String name) {
      return new Attainment(id, name);
    }
    @Bean
    public Attainment medic (@Value("${medic.id}")  int id, @Value("${medic.name}")  String name) {
        return new Attainment(id, name);
    }
    @Bean
    public Set <Attainment> myhAttainment (Attainment lord, Attainment killer) {
//        Set <Attainment> set = new HashSet<>();
//        set.add(lord);
//        set.add(killer);
//        return set;
        return Set.of(lord,killer);
    }
    @Bean
    public Set <Attainment> lisAttainment (Attainment medic, Attainment thunderer) {
        return Set.of(medic,thunderer);
    }
    @Bean
    public Set <Attainment> adminAttainment (Attainment lord, Attainment killer, Attainment thunderer) {
        return Set.of(lord, killer, thunderer);
    }


 }
