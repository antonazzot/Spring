package springbackwell.qualifier;

import springbackwell.model.Player;

public @interface CustomClassQualifiers {
    Class <? extends  Player> clazz();
}
