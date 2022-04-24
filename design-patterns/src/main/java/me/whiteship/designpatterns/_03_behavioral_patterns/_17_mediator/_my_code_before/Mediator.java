package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_before;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {

    List<Colleague> colleagues = new ArrayList<>();

    default boolean addColleague(Colleague colleague) {
        if(colleague != null)
            return colleagues.add(colleague);
        else
            return false;
    }

    void mediate(String data);

}
